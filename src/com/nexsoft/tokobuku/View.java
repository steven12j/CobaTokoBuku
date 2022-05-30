package com.nexsoft.tokobuku;
import java.util.List;
import java.util.ArrayList;

public class View {

	String name = "";
	int height = 0;
	int width = 0;
	
	List<Component> lstComponent = new ArrayList<Component>();
	
	public View() {
		
	}
	
	public void addComponent(Component component) {
		lstComponent.add(component);
	}
	
	public void draw() {
		for (Component component : lstComponent) {
			component.draw();
		}
	}
	
	public View (String name, int height, int width) {
		this.name = name;
		this.height = height;
		this.width = width;
	}
}
