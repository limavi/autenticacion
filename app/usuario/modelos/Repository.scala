package usuario.modelos

import org.joda.time.{DateTime, LocalDate}
import slick.lifted.TableQuery
import play.api.Play
import play.api.db.slick.DatabaseConfigProvider
import play.api.libs.json.{Json, Writes}

import scala.concurrent.{ExecutionContext, Future}
import slick.driver.JdbcProfile
import slick.driver.MySQLDriver.api._

import scala.concurrent.ExecutionContext.Implicits.global

object Repository {
  val dbConfig = DatabaseConfigProvider.get[JdbcProfile](Play.current)
  val UsuarioTableQuery = TableQuery[UsuarioTable]
  val RolesUsuarioTableQuery = TableQuery[RolesUsuarioTable]
  val RolesTableQuery = TableQuery[RolesTable]

  def validarUsuario(usr:String, password:String): Future[Option[UsuarioCompleto]] = {
    val query=for{
      usuario<-UsuarioTableQuery.filter(us=> us.userName === usr && us.contrasena===password)
      rolesUsuario<-RolesUsuarioTableQuery.filter(_.userName===usr)
      roles<-RolesTableQuery.filter(_.id===rolesUsuario.idrol)
    }yield(usuario,rolesUsuario,roles)

    dbConfig.db.run(query.result).map(listaResult=>{
      if(listaResult.isEmpty)None
      else Some(UsuarioCompleto(listaResult.head._1,listaResult.map(_._3).toList))
    })

    //val query =UsuarioTableQuery.filter(us=> us.userName === usr && us.contrasena===password)
    //dbConfig.db.run(query.result.headOption)

  }

  def consultarRoles(): Future[Seq[Roles]] = {
    dbConfig.db.run(RolesTableQuery.result)
  }
}
