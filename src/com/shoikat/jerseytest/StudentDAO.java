package com.shoikat.jerseytest;

import java.util.ArrayList;

public class StudentDAO {
	public ArrayList<Student> findAll() {

		ArrayList<Student> stList=new ArrayList<Student>();
		stList.add(new Student("Shoikat", "Hossain", 27, 1));
		stList.add(new Student("Abhi", "Hossain", 27, 2));
		return stList;
		
	}
	
	public Student findById(int id) {
		if(id==1) {return new Student("Shoikat", "Hossain", 27, id);}
		else { return new Student("Abhi", "Hossain", 27, 2);}
		}

}
