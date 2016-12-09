package controllers


import javax.inject.Inject

import play.api.db.Database
import play.api.mvc._


class Application @Inject()(db: Database) extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready. t2est"))
  }

}