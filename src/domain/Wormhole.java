package domain;

public class Wormhole extends GameObject {
	
	double actionRatio;
	
	public Wormhole(int randomX, int randomY, double actionRatio) {
		super(randomX, randomY);
		this.actionRatio = actionRatio;
	}
	
	@Override
	public void attack(GameObject object) {
		// object is the target objective for the attack.
		// this void should use the actionRatio to MOVE object to its center and destroy it.
	}
	
	
}
