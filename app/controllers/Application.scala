package controllers

import javax.management.relation.Role

import autenticacion.models.User
import autenticacion.{AnalistaTramitesAction, MedicoAction, PacienteAction, Secured}
import play.api.mvc._
import play.api.libs.json._
import play.api.libs.functional.syntax._
import pdi.jwt._
import play.twirl.api.Html
import usuario.modelos._
import usuario.servicios.usuarioServices

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success, Try}

class Application extends Controller with Secured {

  val listaContraseñasPosibles = Seq("red", "blue", "green")  //lili

  def index = Action {
    Ok(views.html.index(new Html("")))
  }

  private val loginForm: Reads[(String, String)] =
    (JsPath \ "username").read[String] and
    (JsPath \ "password").read[String] tupled

  implicit val infologinUsuarioFormat = Json.format[infologinUsuario]
  implicit val UsuarioFormat = Json.format[Usuario]
  implicit val RoleFormat = Json.format[Roles]
  implicit val UsuarioCompletoFormat = Json.format[UsuarioCompleto]


  def consultarRoles()= Action.async { implicit request =>
    val res= Repository.consultarRoles() map {rol => { Ok(Json.toJson( rol ))}}
    res.map( _.withHeaders( ( ACCESS_CONTROL_ALLOW_ORIGIN, "*" ), ( CONTENT_TYPE, "application/hal+json" ) ) )
  }

  def login = Action.async(parse.json) { implicit request =>
    request.body.validate[infologinUsuario].fold(
      errors => {
        println("error" + request.body.toString())
        Future(BadRequest(JsError.toJson(errors)))
      },
      data => {
        usuarioServices.getUsuario(data.userName, data.contrasena) map (usuario => {
          usuario match {
            case Some(usu) =>
              Ok.addingToJwtSession("user", usu)
            case None => Unauthorized
          }
        })
    })
  }


}
