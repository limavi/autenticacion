package usuariosApp.services

import migrana.modelo.RepositoryUsuarioApp
import usuariosApp.modelo._

import scala.concurrent.{ExecutionContext, Future}

object usuariosAppServices {

  def getUsuario(userName:String, contrasena:String): Future[Option[UsuarioApp]] = {
    RepositoryUsuarioApp.consultarUsuario(userName,contrasena )
  }

}
