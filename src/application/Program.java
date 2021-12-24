package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enu.Color;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<Shape>();
		
		System.out.print("Enter the number of shapes: ");
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++ ) {
			System.out.println("Shape #" + i + " data: ");
			System.out.print("Rectangle or Circle (r/c)?: ");
			char c = sc.next().charAt(0);
			System.out.print("Color: ");
			Color color = Color.valueOf(sc.next());
			if (c == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Heght: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			} else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}					
		}
		
		System.out.println();
		
		System.out.println("SHAPE AREAS: ");
		for(Shape c : list) {
			System.out.println(String.format("%.2f", c.area()) );
		}
		
		
		sc.close();
	}

}
