package models

import scala.collection.concurrent.TrieMap
import java.util.concurrent.atomic.AtomicLong

import play.api.libs.json.{Writes, Json, JsValue}
import play.api.libs.json.{Reads, _}
import play.api.libs.functional.syntax._

object Shop extends Shop{
  private val items = TrieMap.empty[Long, Item]
  private val seq = new AtomicLong
 
  def list(): Seq[Item] = items.values.to[Seq]
  def create(name:String, price:Double): Option[Item] = {
    val id = seq.incrementAndGet()
    val item = Item(id, name, price)
    items.put(id, item)
    Some(item)
  }

  def get(id: Long): Option[Item] = items.get(id)
  def delete(id: Long): Boolean = items.remove(id).isDefined

  def update(id:Long, name:String, price:Double): Option[Item] = {
    val item = Item(id, name, price)
    items.replace(id, item)
    Some(item)
  } 
}

case class Item(id:Long, name:String, price:Double)
case class CreateItem(name: String, price: Double)
object CreateItem{
implicit val readsCreateItem : Reads[CreateItem] = (
      ( ((JsPath \ "name").read[String]) and
        ((JsPath \ "price").read[Double])
      )(CreateItem.apply _) 
  )
}
object Item{
  implicit val writesItem = new Writes[Item]{
    def writes(item: Item): JsValue =
      Json.obj(
        "id" -> item.id,
        "name" -> item.name,
        "price" -> item.price
      )
  }
}

trait Shop{
  def list(): Seq[Item]
  def create(name:String, price:Double): Option[Item]
  def get(id:Long): Option[Item]
  def update(id:Long, name:String, price:Double): Option[Item]
  def delete(id:Long): Boolean
}
