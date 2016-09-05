package controllers

import autenticacion.models.User
import autenticacion.{AnalistaTramitesAction, MedicoAction, PacienteAction, Secured}
import play.api.mvc._
import play.api.libs.json._
import play.api.libs.functional.syntax._
import pdi.jwt._
import play.twirl.api.Html
import usuario.modelos.{Usuario, infologinUsuario}
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

  def login = Action.async(parse.json) { implicit request =>
    request.body.validate[infologinUsuario].fold(
      errors => {
        println("error" + request.body.toString())
        Future(BadRequest(JsError.toJson(errors)))
      },
      data => {
        usuarioServices.getUsuario(data.userName, data.contrasena) map (usuario => {
          println("usuario" + usuario)
          usuario match {
            case Some(usu) =>
              Ok.addingToJwtSession("user", usu)
            case None => Unauthorized
          }
        })
    })
  }


}
