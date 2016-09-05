package usuario.servicios

import play.api.mvc.Controller
import usuario.modelos.{UsuarioCompleto, Repository, Usuario}
import scala.concurrent.Future

object usuarioServices extends Controller{

  def getUsuario(user:String, password:String): Future[Option[UsuarioCompleto]] = {
    Repository.validarUsuario(user,password )
  }

  def getRoles() ={
    Repository.consultarRoles
  }

}
