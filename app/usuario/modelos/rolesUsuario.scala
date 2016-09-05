package usuario.modelos

import slick.driver.MySQLDriver.api._

case class RolesUsuario(
    idrol:                  Option[String],
    userName:               String)

class RolesUsuarioTable(tag: Tag) extends Table[RolesUsuario](tag, "rolesUsuario") {
  def idrol              = column[Option[String]]("idrol")
  def userName           = column[String]("userName")

  override def * = (idrol, userName) <>(RolesUsuario.tupled, RolesUsuario.unapply _)
}