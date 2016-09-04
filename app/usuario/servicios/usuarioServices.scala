package usuario.servicios

import usuario.modelo.{UsuarioRepository, Usuario}

import scala.concurrent.Future

object usuarioServices {

  def getUsuario(user:String, password:String): Future[Option[Usuario]] = {
    UsuarioRepository.consultarUsuario(user,password )
  }

}
