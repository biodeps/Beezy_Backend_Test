package domain;

import java.util.ArrayList;
import domain.Collision;

public final class CollisionDetector {
	
	ArrayList<Collision> collisionList;
	
	public CollisionDetector(ArrayList<GameObject> objectList) {
		collisionList = new ArrayList<>();
	}
	
	public ArrayList<Collision> getCollisions(ArrayList<GameObject> objectList) {
		// EXERCISE 2 IMPLEMENTATION
		for (int i = 0; i < objectList.size()-1; i++) {
			for (int j = i+1; j < objectList.size(); j++) {
				if (Collision.isCollision(objectList.get(i), objectList.get(j))) {
					collisionList.add(new Collision(objectList.get(i), objectList.get(j)));
				}
			}
			
		}
		
		return this.collisionList;
	}

}
