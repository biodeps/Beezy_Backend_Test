package application;

import java.util.ArrayList;

import domain.GameObject;

public final class GameController {
	
	static ArrayList<GameObject> playingObjects = new ArrayList<>();
	
	public GameController() {
		// INICIALIZAR LAS VARIABLES SEGÚN UML
	}
	
	public void addGameObject(GameObject object) {
		// Add a single playing object
		playingObjects.add(object);
	}
	
	public void removeGameObject(GameObject object) {
		// Remove a single playing object
		playingObjects.remove(playingObjects.indexOf(object));
	}
	
	public ArrayList<GameObject> getPlayingObjects() {
		return playingObjects;
	}
	
	
	
}
