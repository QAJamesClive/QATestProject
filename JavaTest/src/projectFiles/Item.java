package projectFiles;

public abstract class Item {
	
	protected String name;
	protected String description;
	protected int xcor;
	protected int ycor;
	
	public int getXcor() {
		return xcor;
	}
	public void setXcor(int xcor) {
		this.xcor = xcor;
	}
	public int getYcor() {
		return ycor;
	}
	public void setYcor(int ycor) {
		this.ycor = ycor;
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
		

}
