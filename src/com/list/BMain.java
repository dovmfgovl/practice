package com.list;

import java.util.ArrayList;
import java.util.List;

class B{
	List<Integer> nums = new ArrayList<>();
	int ival;
	String s = null;
	String s1 = new String(); 
	B(){
		nums.add(50);
		nums.add(1, 15);
		nums.add(20);
//		for(int i=0; i<nums.size(); i++) {
//			System.out.println(nums.get(i));
		}	
	void list() {
		for(int i=0; i<nums.size(); i++) {
			System.out.println(nums.get(i));			
		}
	}
public class BMain {
	
	public static void main(String[] args) {
		B b = new B();
		b.list();
	}
}
}
