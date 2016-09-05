package usuario.modelos

import slick.driver.MySQLDriver.api._

case class Roles(
    id:                     Long,
    nombre:                 String,
    descripcion :           String)

class RolesTable(tag: Tag) extends Table[Roles](tag, "roles") {
  def id                 = column[Long]("id")
  def nombre             = column[String]("nombre")
  def descripcion        = column[String]  ("descripcion")

  override def * = (id, nombre , descripcion) <>(Roles.tupled, Roles.unapply _)
}