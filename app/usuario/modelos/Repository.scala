package usuario.modelos

import org.joda.time.{DateTime, LocalDate}
import slick.lifted.TableQuery
import play.api.Play
import play.api.db.slick.DatabaseConfigProvider
import play.api.libs.json.{Json, Writes}

import scala.concurrent.{ExecutionContext, Future}
import slick.driver.JdbcProfile
import slick.driver.MySQLDriver.api._

object Repository {
  val dbConfig = DatabaseConfigProvider.get[JdbcProfile](Play.current)
  val UsuarioTableQuery = TableQuery[UsuarioTable]
  val RolesUsuarioTableQuery = TableQuery[RolesUsuarioTable]
  val RolesTableQuery = TableQuery[RolesTable]

  def validarUsuario(usr:String, password:String): Future[Option[Usuario]] = {
    val query =UsuarioTableQuery.filter(us=> us.userName === usr && us.contrasena===password)
    dbConfig.db.run(query.result.headOption)
  }

  def consultarRoles(): Future[Seq[Roles]] = {
    dbConfig.db.run(RolesTableQuery.result)
  }
}
