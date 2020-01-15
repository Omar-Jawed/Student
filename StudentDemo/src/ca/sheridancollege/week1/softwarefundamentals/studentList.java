package ca.sheridancollege.week1.softwarefundamentals;

public class studentList {

	public static void main(String[] args)
	{
		student[] list = new student[3];
		student s1 = new student();
		s1.setName("Student 1");
		s1.setAge(25);
		
		student s2 = new student();
		s2.setName("Student 2");
		s2.setAge(35);
		
		student s3 = new student();
		s3.setName("Student 3");
		s3.setAge(30);
		list[0] = s1;
		list[1] = s2;
		list[2] = s3;
		for (int x = 0; x < list.length; x++) {
			System.out.println(list[x]);
			System.out.println(list[x].getName() + " " + list[x].getAge());
		}
	}
}