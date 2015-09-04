package controllers;

import play.*;
import play.data.DynamicForm;
import play.mvc.*;
import play.data.Form;
import views.html.*;

public class Application extends Controller {

  
  public static Result saveTaskList(){
	  
	  DynamicForm form = play.data.Form.form().bindFromRequest();
	  String list = form.get("list");
	  Logger.info(list);
	  return ok("Saved");
  }
  
  public static Result index(){
	  return ok(index.render());
  }
}