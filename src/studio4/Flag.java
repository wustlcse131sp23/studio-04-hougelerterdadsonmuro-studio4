package studio4;

import java.awt.Color;
import java.awt.Font;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(Color.YELLOW);
		
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.3);
		
		Font font = new Font("Arial", Font.BOLD,60);
		
		StdDraw.setFont(font);
		
		StdDraw.setPenColor(Color.BLACK);

		StdDraw.text(0.5, 0.5,"MMM");
		
		Font fontTwo = new Font("Arial", Font.PLAIN,150);
		
		StdDraw.setFont(fontTwo);
		StdDraw.text(0.5, 0.33,"W");
		
		Font fontThree = new Font("Arial", Font.PLAIN, 120);
		StdDraw.setFont(fontThree);
		StdDraw.text(0.5, 0.36,"U");
		
	}
}