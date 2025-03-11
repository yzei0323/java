package Toss;

public class User {
	public String name;
	public String id;
	public String password;

	public User(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}

	public User() {
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
