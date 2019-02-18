package application;

import java.util.ArrayList;

import domain.GameObject;

public final class GameController {
	
	public static ArrayList<GameObject> playingObjects = new ArrayList<>();
	
	public GameController() {
		
	}
	
	public static void addGameObject(GameObject object) {
		// Add a single playing object
		playingObjects.add(object);
	}
	
	public static void removeGameObject(GameObject object) {
		// Remove a single playing object
		playingObjects.remove(playingObjects.indexOf(object));
	}
	
	public ArrayList<GameObject> getPlayingObjects() {
		return playingObjects;
	}
	
	public void checkCollisions(ArrayList<GameObject> playingObjects) {
		
	}
	
	public void moveEnemy() {
		
	}
	
	public void attackEnemy() {
		
	}
	
	public void moveMeteor() {
		
	}
	
	public void attackWormhole() {
		
	}
	
	
	
}
