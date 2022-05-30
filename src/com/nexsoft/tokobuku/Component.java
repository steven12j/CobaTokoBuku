package com.nexsoft.tokobuku;

public class Component extends View {
	
	public Component() {
		
	}
	
	public Component(String name, int height, int width) {
		this.height = height;
		this.width = width;
		this.name = name;
	}
	
	public void draw() {
		for (int x = 0; x < height; x++) {
			for (int y = 0; y < width; y++) {
				if (x == 0 || x == height - 1) {
					System.out.print("*");
				}
				else {
					if (y == 0 || y == width - 1) {
						System.out.print("*");
					}
					else {
						content(y,x);
					}
				}
			}
			System.out.println("");
		}
	}
	
	public void content(int width, int height) {
		System.out.println(" ");
	}
	
	
	
}
