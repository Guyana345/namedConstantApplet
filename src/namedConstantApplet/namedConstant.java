package namedConstantApplet;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class namedConstant extends JFrame {

	public static final int FACE_DIAMETER = 200;
	public static final int X_FACE = 100;
	public static final int Y_FACE = 50;

	public static final int EYE_WIDTH = 10;
	public static final int EYE_HEIGHT = 20;
	public static final int X_RIGHT_EYE = 155;
	public static final int X_LEFT_EYE = 230;
	public static final int Y_RIGHT_EYE = 100;
	public static final int Y_LEFT_EYE = Y_RIGHT_EYE;
	
	public static final int X_LEFT_EAR =270;
	public static final int Y_LEFT_EAR =125;
	public static final int X_RIGHT_EAR =80;
	public static final int Y_RIGHT_EAR = Y_LEFT_EAR;
	public static final int EAR_WIDTH = 50;
	public static final int EAR_HEIGHT = 50;
	public static final int EAR_START_ANGLE = 90;
	public static final int EAR_EXTENDED_ANGLE = 180;
	public static final int LEFT_EAR_START_ANGLE = -90;
	public static final int LEFT_EAR_EXTENDED_ANGLE = -180;
	
	public static final int X_NOSE = 195;
	public static final int Y_NOSE = 135;
	public static final int NOSE_DIAMETER = 10;
	public static final int MOUTH_WIDTH = 100;
	public static final int MOUTH_HEIGHT = 50;
	public static final int X_MOUTH = 150;
	public static final int Y_MOUTH = 160;
	public static final int MOUTH_START_ANGLE = 180;
	public static final int MOUTH_EXTEND_ANGLE = 180;

	public void paint(Graphics canvas) {

		super.paint(canvas);
		
		// Draw face Outline
		canvas.setColor(Color.BLACK);
		canvas.drawOval(X_FACE, Y_FACE, FACE_DIAMETER, FACE_DIAMETER);
		
		// face color
		canvas.setColor(Color.YELLOW);
		canvas.fillOval(X_FACE, Y_FACE, FACE_DIAMETER, FACE_DIAMETER);
		
		// Draw eyes 2 left and right
		canvas.setColor(Color.BLACK);
		canvas.fillOval(X_RIGHT_EYE, Y_RIGHT_EYE, EYE_WIDTH, EYE_HEIGHT);
		canvas.fillOval(X_LEFT_EYE, Y_LEFT_EYE, EYE_WIDTH, EYE_HEIGHT);
		
		// draw ear test
		canvas.setColor(Color.BLACK);
		canvas.drawArc(X_RIGHT_EAR, Y_RIGHT_EAR, EAR_WIDTH, EAR_HEIGHT, EAR_START_ANGLE, EAR_EXTENDED_ANGLE);
		canvas.drawArc(X_LEFT_EAR, Y_LEFT_EAR, EAR_WIDTH, EAR_HEIGHT, LEFT_EAR_START_ANGLE, EAR_EXTENDED_ANGLE);
		
		// nose
		canvas.setColor(Color.BLACK);
		canvas.fillOval(X_NOSE, Y_NOSE, NOSE_DIAMETER, NOSE_DIAMETER);
		
		// Draw mouth
		canvas.setColor(Color.RED);
		canvas.drawArc(X_MOUTH, Y_MOUTH, MOUTH_WIDTH, MOUTH_HEIGHT, MOUTH_START_ANGLE, MOUTH_EXTEND_ANGLE);
		
	}
	
	public namedConstant(){
		setSize(600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		namedConstant guiWindow = new namedConstant();
		guiWindow.setVisible(true);
	}
}

