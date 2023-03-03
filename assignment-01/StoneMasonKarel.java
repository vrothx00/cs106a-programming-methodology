/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	public void run(){
		while(frontIsClear()){
			repairColumnFromDown();
			repositionForColumnFromTop();
			repairColumnFromTop();
			repositionForColumnFromDown();
		}
	}


	private void repairColumnFromDown(){
		turnLeft();
		while(frontIsClear()){
			if(noBeepersPresent()){
				putBeeper();
			}
			move();
		}
		OBOB();
	}

	private void repairColumnFromTop(){
		turnRight();
		while(frontIsClear()){
			if(noBeepersPresent()){
				putBeeper();
			}
			move();
		}
	}

	private void repositionForColumnFromTop(){
		turnRight();
		for(int i = 0; i < 4; i++){
			move();
		}
		if(leftIsClear()){
			repairColumnFromDown();
			turnRight();
		}
	}

	private void repositionForColumnFromDown(){
		turnLeft();
		if(frontIsClear()){
			for(int i = 0; i < 4; i++){
				move();
			}
		}
		if(rightIsClear()){
			repairColumnFromDown();
			turnLeft();
			repairColumnFromTop();
		}
	}

	private void OBOB(){
		if(noBeepersPresent()){
			putBeeper();
		}
	}

	private void moveToWall(){
		while(frontIsClear()){
			move();
		}
	}
}
