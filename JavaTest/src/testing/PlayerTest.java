package testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import projectFiles.UsableItem;
import projectFiles.Item;
import projectFiles.LocationItem;
import projectFiles.LocationObject;
import projectFiles.Player;

public class PlayerTest {
	
	@Test
	public void testPlayerCreation() {
		Player player = new Player(0,0);
		assertNotNull("Creation of player",player);
	}
	
	@Test
	public void testplayermove() {
		Player player = new Player(0,0);
		assertNotNull("Creation of player",player);
		player.playerMove(5,0,0,0);
		assertEquals("Testing player moves north", 5,player.getYcor());
		player.playerMove(0,0,5,0);
		assertEquals("Testing player moves south", 0,player.getYcor());
		player.playerMove(0,5,0,0);
		assertEquals("Testing player moves east", 5,player.getXcor());
		player.playerMove(0,0,0,5);
		assertEquals("Testing player moves west", 0,player.getXcor());
	}
	@Test
	public void testLocationDistanceCalculation() {
		Player player = new Player(0,0);
		assertNotNull("Creation of player",player);
		
		LocationItem TreasureChest = new LocationItem("Treasure Chest", "A chest full of tresure");
		ArrayList<LocationItem> locationItemsList = new ArrayList<LocationItem>();
		locationItemsList.add(TreasureChest);
		
		ArrayList<LocationObject> objectLocationList = new ArrayList<LocationObject>();
		
		LocationObject location = new LocationObject("House Exterior","An old house with a wooden door",locationItemsList, 58, 78);
		assertNotNull("Creation of a location",location);
		
		objectLocationList.add(location);
		objectLocationList.add(new LocationObject("Old tree","An old tree with a yellow face",locationItemsList, -20, -50));
		
			
		assertEquals("Nearestlocation calculation",50.00,player.locationDistanceCalculation(objectLocationList),5);
		
	}
	
	
	@Test
	public void testInventoryGet() {
		
		Player player = new Player(0,0);
		assertNotNull("Creation of player",player);
		
		assertNotNull("Creation of the inventory",player.getInventory());
		
		UsableItem book = new UsableItem("A dull book", "A book that is dull", null);
		assertNotNull("Creation of a book",book);
		
		player.getInventory().add(book);
		assertEquals("A book has been added","A dull book",player.getInventory().get(0).getName());
	}
	@Test
	public void playerUseItem1() {
		Player player = new Player(0,0);
		assertNotNull("Creation of player",player);
				
		assertNotNull("Creation of the inventory",player.getInventory());
		
		ArrayList<LocationObject> usesList = new ArrayList<LocationObject>(); 
		
		UsableItem book = new UsableItem("A dull book", "A book that is dull", usesList);
		assertNotNull("Creation of a book",book);
		
		player.getInventory().add(book);
		assertEquals("A book has been added","A dull book",player.getInventory().get(0).getName());
		System.out.println(player.getInventory().get(0).getName());
		
		//Creating a location item list
		LocationItem TreasureChest = new LocationItem("Treasure Chest", "A chest full of tresure");
		ArrayList<LocationItem> locationItemsList = new ArrayList<LocationItem>();
		locationItemsList.add(TreasureChest);
		
		//Creating a location
		LocationObject location = new LocationObject("House Exterior","An old house with a wooden door",locationItemsList, 0, 0);
		assertNotNull("Creation of a location",location);
		ArrayList<LocationObject> locationList = new ArrayList<LocationObject>();
		locationList.add(location);
				
		
		assertEquals("Player use item","There are no uses for that",player.UseItem(player.getInventory(),0,locationList,0, 0));
	}
	
	@Test
	public void playerUseItem2() {
		Player player = new Player(0,0);
		assertNotNull("Creation of player",player);
				
		assertNotNull("Creation of the inventory",player.getInventory());
		
		ArrayList<LocationObject> usesList = new ArrayList<LocationObject>();
		
		UsableItem key = new UsableItem("A key", "A key that is used to unlock something", usesList);
		assertNotNull("Creation of a key",key);
		
		player.getInventory().add(key);
		assertEquals("A key has been added","A key",player.getInventory().get(0).getName());
		
		//Creating a location item list
		LocationItem TreasureChest = new LocationItem("Treasure Chest", "A chest full of tresure");
		ArrayList<LocationItem> locationItemsList = new ArrayList<LocationItem>();
		locationItemsList.add(TreasureChest);
		
		//Creating a location
		LocationObject location = new LocationObject("House Exterior","An old house with a wooden door",locationItemsList, 0, 0);
		assertNotNull("Creation of a location",location);
		ArrayList<LocationObject> locationList = new ArrayList<LocationObject>();
		locationList.add(location);
		usesList.add(location);
				
		
		assertEquals("Player use item","Use A key With Treasure Chest",player.UseItem(player.getInventory(),0,locationList,0, 0));
	}
	
	@Test
	public void testInventoryAddition() {
		
	}
}
