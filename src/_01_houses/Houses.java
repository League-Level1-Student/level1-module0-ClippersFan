package _01_houses;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot jeff = new Robot();
	int height;
	public void run() {
		jeff.setPenWidth(5);
		jeff.setSpeed(10);
		jeff.penDown();
		jeff.setX(0);
		jeff.setY(500);
	for(int i = 0; i < 10; i++) {
		jeff.setPenColor(0, 0, 0);
		drawHouse("");
	}
	String small = "60";
	String medium = "120";
	String large = "250";
	String heights;
	}
	private void drawHouse(String heights) {
		// TODO Auto-generated method stub
		heights.equals("small");
		if(heights.equals("small")){
			int height = 60;
		}
		jeff.move(100);
		jeff.turn(45);
		jeff.move(35);
	    jeff.turn(90);
		jeff.move(35);
		jeff.turn(45);
		jeff.move(100);
		jeff.turn(270);
		jeff.setPenColor(0, 128, 0);
		jeff.move(25);
		jeff.turn(270);
	}
}
