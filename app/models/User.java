package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import play.db.ebean.Model;

@SuppressWarnings("serial")
@Entity
@JsonIgnoreProperties
public class User extends Model{
	
	
	private int id;
	private List<Task> tasks;
	private String login;
	private String password;
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL)
	public List<Task> getTasks() {
		return tasks;
	}
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public static Finder<Long,User> find = new Finder<Long,User>(Long.class, User.class); 
}
