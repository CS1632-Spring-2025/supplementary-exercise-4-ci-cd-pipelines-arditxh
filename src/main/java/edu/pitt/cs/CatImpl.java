package edu.pitt.cs;

public class CatImpl implements Cat {

	// complete
	private int id;
	private String name;
	private boolean rented = false;

	public CatImpl(int id, String name) {
		// complete
		this.id = id;
		this.name = name;
	}

	public void rentCat() {
		// complete
		rented = true;
	}

	public void returnCat() {
		// complete
		rented = false;
	}

	public void renameCat(String name) {
		// complete
		this.name = name;
	}

	public String getName() {
		// complete
		return name;
	}

	public int getId() {
		// complete
		return id;
	}

	public boolean getRented() {
		// complete
		return rented;
	}

	public String toString() {
		// complete
		return "ID " + id + ". " + name;
	}

}