package todo;

public class ToDo {
	private String title;
	private boolean expired;
	
	// constructor
	public ToDo(String title)
	{
		this.title = title;
		expired = false;
	}
	
	public String getTitle() {
		return title;
	}

	public boolean isExpired() {
		return expired;
	}

	public String toString() {
		return "Title: " + title + "\nExpired: " + expired;
	}
}
