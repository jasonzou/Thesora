import play.api._
import play.api.mvc._
import play.api.mvc.Results._

import scala.concurrent._

object Global extends GlobalSettings {

  override def onStart(app: Application) {
    Logger.info("Application has started")
  }  
  
  override def onStop(app: Application) {
    Logger.info("Application shutdown...")
  }  

  // 500 - internal server error
  override def onError(request: RequestHeader, ex: Throwable) = {
    Future.successful(
      InternalServerError(
        views.html.errorPage(ex)
      )
    )
  }  
  
  // 404 - page not found error
  override def onHandlerNotFound(request: RequestHeader) = {
    Future.successful(
      NotFound(
        views.html.notFoundPage(request)
      )
    )
  }  
  
  override def onBadRequest(request: RequestHeader, error: String) = {
    Future.successful(BadRequest("Bad Request: " + error))
  } 
}
