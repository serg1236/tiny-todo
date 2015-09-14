package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import play.db.ebean.Model;

@SuppressWarnings("serial")
@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
public class Task extends Model{
	
	@Id
	private int id;
	private String name;
	private String description;
	private String priority;
	private boolean completed;
	@ManyToOne
	@JoinColumn(name="user_id", nullable=false)
	private User user;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean isCompleted) {
		this.completed = isCompleted;
	}

}
