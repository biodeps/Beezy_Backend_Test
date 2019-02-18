package domain;

public class Collision {
	
	GameObject participantA;
	GameObject participantB;
	
	public Collision(GameObject participantA, GameObject participantB) {
		this.participantA = participantA;
		this.participantB = participantB;
		
	}
	
	public GameObject getPaticipantA() {
		return this.participantA;
	}
	
	public GameObject getParticipantB() {
		return this.participantB;
	}
	
	public static boolean isCollision(GameObject participantA, GameObject participantB) {
		return (participantA.getPositionX() == participantB.getPositionX() &&
				participantA.getPositionY() == participantB.getPositionY());
	}
	
}
