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

  def consultarUsuario(usr:String, password:String): Future[Option[Usuario]] = {
    println(usr + " -  " + password)
    val query: Query[UsuarioTable, Usuario, Seq] =UsuarioTableQuery.filter(us=> us.userName === usr && us.contrasena===password)
    dbConfig.db.run(query.result.headOption)
  }
}
