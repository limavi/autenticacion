package usuario.modelos

import slick.driver.MySQLDriver.api._

case class Roles(
    id:                     Option[String],
    nombre:                 String,
    descripcion :           String)

class RolesTable(tag: Tag) extends Table[Roles](tag, "roles") {
  def id                 = column[Option[String]]("id")
  def nombre             = column[String]("nombre")
  def descripcion        = column[String]  ("descripcion")

  override def * = (id, nombre , descripcion) <>(Roles.tupled, Roles.unapply _)
}