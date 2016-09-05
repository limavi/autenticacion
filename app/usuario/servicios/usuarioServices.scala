package usuario.servicios

import play.api.mvc.Controller
import usuario.modelos.{Repository, Usuario}
import scala.concurrent.Future

object usuarioServices extends Controller{

  def getUsuario(user:String, password:String): Future[Option[Usuario]] = {
    Repository.validarUsuario(user,password )
  }

  def getRoles() ={
    Repository.consultarRoles
  }

}
