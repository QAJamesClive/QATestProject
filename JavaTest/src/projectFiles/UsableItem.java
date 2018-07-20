package projectFiles;

import java.util.ArrayList;

public class UsableItem extends Item{
	
	protected ArrayList<LocationObject> usesList; 
	
	public ArrayList<LocationObject> getUsesList() {
		return usesList;
	}

	public void setUsesList(ArrayList<LocationObject> usesList) {
		this.usesList = usesList;
	}

	
	public UsableItem(String Name, String Description, ArrayList UsesList ) {
		
		this.name = Name;
		this.description = Description;
		this.usesList = UsesList;
		
	}
}
