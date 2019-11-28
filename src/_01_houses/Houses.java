package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot jeff = new Robot();

	public void run() {
		jeff.setPenWidth(5);
		jeff.setSpeed(100);
		jeff.penDown();
	for(int i = 0; i < 10; i++) {
		jeff.setPenColor(0, 0, 0);
		drawHouse(100+i*10);
	}
	}
	private void drawHouse(int height) {
		// TODO Auto-generated method stub
		jeff.setX(0);
		jeff.setY(500);
		jeff.move(height);
		jeff.turn(45);
		jeff.move(35);
	    jeff.turn(90);
		jeff.move(35);
		jeff.turn(45);
		jeff.move(height);
		jeff.turn(270);
		jeff.setPenColor(0, 128, 0);
		jeff.move(25);
		jeff.turn(-90);
	}
}
