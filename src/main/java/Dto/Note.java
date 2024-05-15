package Dto;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Note {
	@Id
	private int id;
	private String Title;
	private String Description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn
	private User users;
	public User getUsers() {
		return users;
	}
	public void setUsers(User users) {
		this.users = users;
	}
	

}
