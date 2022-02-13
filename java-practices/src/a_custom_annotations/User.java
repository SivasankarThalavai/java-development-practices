package a_custom_annotations;

import java.util.Date;

public class User {

	@MyFieldLevelAnnotation(name = "id", isPrimaryKey = true, type = Long.class)
	private long id;

	@MyFieldLevelAnnotation(name = "name", type = String.class)
	private String name;

	@MyFieldLevelAnnotation(name = "email", type = String.class)
	private String email;

	@MyFieldLevelAnnotation(name = "created", type = Date.class)
	private Date created;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
}