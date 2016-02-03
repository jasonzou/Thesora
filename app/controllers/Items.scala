package controllers

import play.api.mvc.{Controller, Action}
import play.api.libs.json.Json

import play.api.libs.json.{Writes, Json, JsValue}
import play.api.libs.json.{Reads, _}


object Items extends Controller{
  val shop = models.Shop
  val create = Action(parse.json){
    implicit request => request.body.validate[models.CreateItem] match{
      case JsSuccess(createItem, _) =>
        shop.create(createItem.name, createItem.price) match {
          case Some(item) => Ok(Json.toJson(item))
          case None => InternalServerError
        }
      case JsError(errors) => BadRequest
    }
  } 

  //implicit val writesItem = Json.writes[models.Item]

  def list(page: Int) = Action {
    Ok(Json.toJson(shop.list))
  }
 
  //  Ok(views.html.index(id.toString()))
  def update(id:Long) = TODO
  def delete(id:Long) = TODO 
 
  def details(id:Long) = Action{
    shop.get(id) match{
      case Some(item) =>
        //Ok(Json.toJson(item))
        Ok(views.html.index(id.toString()))
      case None => Ok(views.html.index(id.toString() + " not found"))
    }
  }
}
