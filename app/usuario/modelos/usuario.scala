package usuario.modelos

import java.sql.Timestamp
import org.joda.time.DateTime
import slick.driver.MySQLDriver.api._

case class Usuario(
    userName:               String,
    tipoDocumento:          String,
    numDocumento:           Long,
    fechaNacimiento:        DateTime,
    correoElectronico:      String,
    telefono:               String,
    contrasena:             String)

case class infologinUsuario(userName:String, contrasena: String)
case class UsuarioCompleto(usuario:Usuario, rolesUsuario:List[Roles])

class UsuarioTable(tag: Tag) extends Table[Usuario](tag, "usuario") {
  implicit val jdateColumnType = MappedColumnType.base[ DateTime, Timestamp ]( dt => new Timestamp( dt.getMillis ), ts => new DateTime( ts.getTime ) )
  def userName           = column[String]("userName")
  def tipoDocumento      = column[String]("tipoDocumento")
  def numDocumento       = column[Long]  ("numDocumento")
  def fechaNacimiento    = column[DateTime]("fechaNacimiento")
  def correoElectronico  = column[String]("correoElectronico")
  def telefono           = column[String]("telefono")
  def contrasena         = column[String]("contrasena")

  override def * = (userName, tipoDocumento , numDocumento,fechaNacimiento,correoElectronico,telefono,contrasena) <>(Usuario.tupled, Usuario.unapply _)
}