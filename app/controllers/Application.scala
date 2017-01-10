package controllers


import javax.inject.Inject

import play.api.db.Database
import play.api.mvc._


class Application @Inject()(db: Database) extends Controller {

  def index = Action({
    Ok(views.html.index("title") {
      "message2";
      "message333"
    })
  })

  def tokenEcho = Action { implicit request =>

    var echostr = request.getQueryString("echostr");

    var reqBody = request.body;

    println("the request body is " + reqBody.asText.get)

    println(echostr)
    Ok(echostr.get)

  }

  def redirect = Action { implicit request => {

    val adUrl = request.getQueryString("ad")

    println(adUrl.get)

    Results.Redirect(adUrl.get, 303)
  }

  }

}