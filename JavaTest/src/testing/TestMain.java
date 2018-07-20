package testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import projectFiles.Animal;
import projectFiles.Item;
import projectFiles.LocationItem;
import projectFiles.LocationObject;
import projectFiles.Main;
import projectFiles.Player;
import projectFiles.Rat;
import projectFiles.UsableItem;

public class TestMain {
	@Test
	public void TestMethodMain(){
		Main main = new Main();
		assertNotNull("Creation of main",main);
		
	}
	@Test
	public void TestMethodPlayer(){
		Player player = new Player(0,0);
		PlayerTest test = new PlayerTest();
		assertNotNull("Creation of Player",player);
		test.testPlayerCreation();
		test.testplayermove();
		test.testInventoryGet();
		test.testLocationDistanceCalculation();
		test.playerUseItem1();
		test.playerUseItem2();
		
	}
	
	@Test
	public void TestLocationItem() {
		LocationItem treasureChest = new LocationItem("Treasure Chest", "A chest full of tresure");
		assertNotNull("Creation of an Location Item Treasure Chest",treasureChest);
		
		assertEquals("Constructor test name", "Treasure Chest",treasureChest.getName());
		assertEquals("Constructor test description", "A chest full of tresure",treasureChest.getDescription());

		treasureChest.setName("An empty chest");
		assertEquals("Constructor test name", "An empty chest",treasureChest.getName());
		
		treasureChest.setDescription("A chest that is not full of treasure");
		assertEquals("Constructor test description", "A chest that is not full of treasure",treasureChest.getDescription());
		
		treasureChest.setXcor(0);
		assertEquals("Constructor test xcor", 0,treasureChest.getXcor());
		
		treasureChest.setYcor(0);
		assertEquals("Constructor test Ycor", 0,treasureChest.getYcor());
		
		
	}
	@Test
	public void TestLocationObject() {
		LocationItem TreasureChest = new LocationItem("Treasure Chest", "A chest full of tresure");
		ArrayList<LocationItem> locationItemsList = new ArrayList<LocationItem>();
		locationItemsList.add(TreasureChest);
		
		LocationObject location = new LocationObject("House Exterior","An old house with a wooden door",locationItemsList, 0, 0);
		assertNotNull("Creation of a location",location);
		
		assertEquals("Constructor test name", "House Exterior",location.getName());
		assertEquals("Constructor test description", "An old house with a wooden door",location.getDescription());
		
		location.setName("House Interior");
		assertEquals("Set and get test name", "House Interior",location.getName());
		
		location.setDescription("An old empty house with a treasure chest");
		assertEquals("Set and get test description", "An old empty house with a treasure chest",location.getDescription());
		
		location.setXcor(0);
		assertEquals("Constructor test xcor", 0,location.getXcor());
		
		location.setYcor(0);
		assertEquals("Constructor test Ycor", 0,location.getYcor());

	}
	@Test
	public void TestMethodAnimal(){
		Animal rat = new Rat("Scabbers", "A big rat");
		assertNotNull("Creation of an animal Rat",rat);
		
		assertEquals("Constructor test name", "Scabbers",rat.getName());
		assertEquals("Constructor test description", "A big rat",rat.getDescription());
		
		rat.setName("Monty");
		assertEquals("Set and get test name", "Monty",rat.getName());
		
		rat.setDescription("A small rat");
		assertEquals("Set and get test description", "A small rat",rat.getDescription());
		
		rat.setXcor(0);
		assertEquals("Constructor test xcor", 0,rat.getXcor());
		
		rat.setYcor(0);
		assertEquals("Constructor test Ycor", 0,rat.getYcor());

	}

	@Test
	public void TestMethodUsableItem(){
				
		Item book = new UsableItem("A dull book", "A really dull book", null);
		assertNotNull("Creation of an Item Book",book);
		
		assertEquals("Constructor test name", "A dull book",book.getName());
		assertEquals("Constructor test description", "A really dull book",book.getDescription());

		book.setName("A not so dull book");
		assertEquals("Constructor test name", "A not so dull book",book.getName());
		
		book.setDescription("A book that is not so dull");
		assertEquals("Constructor test description", "A book that is not so dull",book.getDescription());

	}


}
