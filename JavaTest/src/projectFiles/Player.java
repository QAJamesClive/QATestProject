package projectFiles;

import java.util.ArrayList;

public class Player {
	
	ArrayList<UsableItem> inventory = new ArrayList<UsableItem>();
	int xcor;
	int ycor;
	
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

	public ArrayList<UsableItem> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<UsableItem> inventory) {
		this.inventory = inventory;
	}

	public Player(int Xcor, int Ycor){
		this.xcor = Xcor;
		this.ycor = Ycor;
	}

	public String UseItem(ArrayList<UsableItem> inventory, int inventoryUsableItemID, ArrayList<LocationObject> LocationObjectList, int LocationObjectID, int LocationItemID) {
		System.out.println(inventory.get(inventoryUsableItemID).getName());
		if(inventory.get(inventoryUsableItemID).getUsesList().isEmpty()) {
			return "There are no uses for that";
		}
		for(int i = 0; i < inventory.get(inventoryUsableItemID).getUsesList().size(); i++)
		{
			for(int j = 0; j < LocationObjectList.get(LocationObjectID).listLocationItems.size(); j++) {
				if(inventory.get(inventoryUsableItemID).getUsesList().get(LocationObjectID).getListLocationItems().get(i).getName()
						.equals
						(LocationObjectList.get(LocationObjectID).listLocationItems.get(j).getName()))
				{
					System.out.println("Use "+inventory.get(inventoryUsableItemID).getName() + " With "+ inventory.get(inventoryUsableItemID).getUsesList().get(LocationObjectID).getListLocationItems().get(i).getName());
					return "Use "+inventory.get(inventoryUsableItemID).getName() + " With "+ inventory.get(inventoryUsableItemID).getUsesList().get(LocationObjectID).getListLocationItems().get(i).getName();
				}
				else {
					return "You can not use " +inventory.get(inventoryUsableItemID).getName()+ "With" + LocationObjectList.get(LocationObjectID).getName();
				}
				
			}
		}
		return null;
	}

	public void playerMove(int north, int east, int south, int west) {
		ycor += north+(-south);
		xcor += east+(-west);
		
	}


	public double locationDistanceCalculation(ArrayList<LocationObject> LocationList) {
		double TempDistance = 0;
		for(int i = 0; i < LocationList.size(); i++) {
			double Distance = 100;
			TempDistance = Math.sqrt(
					(Math.multiplyExact(LocationList.get(i).getXcor(), LocationList.get(i).getXcor()))+
					(Math.multiplyExact(LocationList.get(i).getYcor(), LocationList.get(i).getYcor()))
					);
			if(TempDistance > Distance) {
				Distance = TempDistance;
			}
		}
		System.out.println(TempDistance);
		return TempDistance;
	}
}
