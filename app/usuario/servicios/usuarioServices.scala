package usuario.servicios

import usuario.modelo.{RepositoryUsuario, Usuario}

import scala.concurrent.Future

object usuarioServices {

  def getUsuario(user:String, password:String): Future[Option[Usuario]] = {
    RepositoryUsuario.consultarUsuario(user,password )
  }

}
