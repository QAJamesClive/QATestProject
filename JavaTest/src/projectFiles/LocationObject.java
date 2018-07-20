package projectFiles;

import java.util.ArrayList;

public class LocationObject {
	
	protected String name;
	protected String description;
	protected ArrayList<LocationItem> listLocationItems = new ArrayList<LocationItem>();
	protected int xcor;
	protected int ycor;

	public LocationObject(String Name, String Description,ArrayList LocationItems,int Xcor,int Ycor) {
		this.description = Description;
		this.listLocationItems = LocationItems;
		this.name = Name;
		this.xcor = Xcor;
		this.ycor = Ycor;
	}

	public ArrayList<LocationItem> getListLocationItems() {
		return listLocationItems;
	}

	public void setListLocationItems(ArrayList<LocationItem> listLocationItems) {
		this.listLocationItems = listLocationItems;
	}

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

	public ArrayList<LocationItem> getLocationObjects() {
		return listLocationItems;
	}

	public void setLocationObjects(ArrayList<LocationItem> locationObjects) {
		this.listLocationItems = listLocationItems;
	}

}
