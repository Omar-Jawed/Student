/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

/**
 * printing student details
 * 
 * @author srinivsi
 */
public class Studentlist {
	public static void main(String[] args) {
		Student[] list = new Student[3];// array of objects
		Student s1 = new Student(); // object s1 for student class
		s1.setName("siva");
		s1.setAge(25);
		Student s2 = new Student(); // object s1 for student class
		s2.setName("sivaas");
		s2.setAge(22);
		Student s3 = new Student(); // object s1 for student class
		s3.setName("sivag");
		s3.setAge(21);
		// assigned student objects in array
		list[0] = s1;
		list[1] = s2;
		list[2] = s3;
		for (int i = 0; i < list.length; i++) {
			// System.out.println(list[i]);
			System.out.println(list[i].getName() + " " + list[i].getAge());
		}
	}
}
