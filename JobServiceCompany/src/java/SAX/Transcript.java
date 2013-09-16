package SAX;

import java.util.ArrayList;

public class Transcript {
	public String name;
	public String university;
	public String degree;
	public int year;
	public ArrayList<Course> courses;
	
	public Transcript()
	{
		courses = new ArrayList<Course>();
	}
	
}
