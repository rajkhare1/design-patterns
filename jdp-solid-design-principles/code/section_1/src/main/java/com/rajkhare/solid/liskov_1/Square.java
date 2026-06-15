package com.rajkhare.solid.liskov_1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Square implements Shape {

	private int side;

	@Override
	public int computeArea() {
		return side * side;
	}
}
