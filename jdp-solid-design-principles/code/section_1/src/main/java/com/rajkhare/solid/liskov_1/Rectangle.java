package com.rajkhare.solid.liskov_1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Rectangle implements Shape {

	private int width;
	private int height;

	@Override
	public int computeArea() {
		return width * height;
	}

}
