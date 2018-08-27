package fahrtenbuch;

import java.io.Serializable;
// Klasse Fahrer
public class Driver implements Serializable {
	private int Id;
	private String name;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Driver() {

	}

	public Driver(int id, String name) {
		this.Id = id;
		this.name = name;
	}

}
