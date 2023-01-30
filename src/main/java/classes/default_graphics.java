package classes;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.Timer;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import edu.pacific.comp55.starter.GraphicsApplication;

public class default_graphics extends Map implements KeyListener {
	// Create New Class with Code
	// Copy down functions and output wanted types
	// Remove Extra Code
	public int change_speed(Level l) {
		int speed = 8;
		if (l == level_2) {
			speed = 15;
		}
		if (l == level_3) {
			speed = 6;
		}
		return speed;
	}


	public static void main(String args[]) {
		
	}

}
