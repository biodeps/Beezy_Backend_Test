package view;

import application.GameController;
import domain.Player;

public class Main {

	public static void main(String[] args) {
		// Here the player decides how to move and attack
		Player player = new Player(0,0);
		GameController.playingObjects.add(player);
		boolean gameEnd = false;
		
		System.out.println("WELCOME. Game is running...");
				
		while (!gameEnd) {
			// The game flow should go here: Periodic GameObjects and Collisions checks.
			// Call to move and attack for the player class goes here.
			// Object that collided should be destroyed here
		}
		
		System.out.println("Game has ended. Bye!");
	}

}
