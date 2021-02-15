package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

	public void run() {
		
			for (int i = 0; i < 5; i++) {
				if(frontIsClear());
					move();
			}
			
			turnLeft();
			
			if(beepersPresent());
				move();
				pickBeeper();
				turnAround();
				move();
				turnLeft();
			
			for (int i = 0; i < 4; i++) {
				if(frontIsClear());
					move();
			}
			
			if(beepersPresent());
				turnLeft();
				move();
				pickBeeper();
				turnAround();
				move();
				move();
				pickBeeper();
				pickBeeper();
				turnAround();
				move();
				turnRight();
				move();
			
	}
	
		
}
