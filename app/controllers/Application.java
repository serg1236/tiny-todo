package controllers;

import java.io.IOException;

import models.User;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ObjectNode;

import play.*;
import play.data.DynamicForm;
import play.libs.Json;
import play.mvc.*;
import play.data.Form;
import views.html.*;

public class Application extends Controller {

  
  public static Result saveTaskList(){
	  
	  JsonNode json = request().body().asJson();
	  Logger.info(json.get("login").getTextValue());
	  ObjectMapper mapper = new ObjectMapper();
	  User user=null;
		try {
			user = mapper.treeToValue(json, User.class);
			Logger.info(user.getLogin());
		} catch (IOException e) {
			Logger.error("Json mapping error",e);
		}
	  
	  return ok("Saved");
  }
  
  public static Result index(){
	  return ok(index.render());
  }
}