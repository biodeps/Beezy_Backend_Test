package domain;

public class GameObject {
	
	int positionX;
	int positionY;
	
	public GameObject(int x, int y) {
		this.positionX = x;
		this.positionY = y;
	}
	
	public void move(int Xincrement, int Yincrement) {
		// Position will vary according to its X and Y increments (of course they can be negative)
		this.positionX += Xincrement;
		this.positionY += Yincrement;
	}
	
	public void attack(GameObject object) {
		
	}

}
