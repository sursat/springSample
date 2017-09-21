package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	private int[] elements;
	
	@Autowired
	private SortingAlogirthm sortingAlogirthm; 
	
	public BinarySearchImpl(int[] elements) {
		this.elements = sortingAlogirthm.sort(elements);
	}
	
	public int getElementAt(int indexPosition) {
		return 3;
	}

}
