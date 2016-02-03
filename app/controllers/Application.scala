package controllers

import play.api._
import play.api.mvc._

import play.api.Play.current
import play.api.i18n.Messages.Implicits._
import play.api.libs.concurrent.Execution.Implicits.defaultContext

import dao.CatDAO
import models.Cat
import play.api.data.Form
import play.api.data.Forms.mapping
import play.api.data.Forms.text

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your Thesora is ready."))
  }
  
  def tasks = Action{
    Ok("Hello")
  }

  def newTask = Action{
    Ok("Hello") 
  }

  def deleteTask(id: Long) = Action{
    Ok("Hello")
  }

  def vocs = TODO

  def newVoc = Action{ NotImplemented }

  def dao = new CatDAO

  private val catForm = Form(
    mapping(
      "name" -> text(),
      "color" -> text()
    )(Cat.apply)(Cat.unapply)
  )
  def insert = Action.async{implicit request =>
    val cat: Cat = catForm.bindFromRequest.get
    dao.insert(cat).map(_ => Redirect(routes.Application.catindex))
  }

  def catindex = Action.async {
    dao.all().map(c => Ok(views.html.catindex(c)))
  } 
}
