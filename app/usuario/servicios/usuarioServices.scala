package usuario.servicios

import usuario.modelos.{Repository, Usuario}
import scala.concurrent.Future

object usuarioServices {

  def getUsuario(user:String, password:String): Future[Option[Usuario]] = {
    Repository.consultarUsuario(user,password )
  }

}
