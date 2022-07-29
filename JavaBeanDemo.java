package Oopsdemo;
/*
 * no-args constructor
 * parameterized constructor
 * toString() method
 * setter and getter method
 * maintain excapsulation all var will be private
 */
class College
{
	
private int collegeId;
private String collegeName;

public College() {
	super();
	// TODO Auto-generated constructor stub
}

public College(int collegeId, String collegeName) {
	super();
	this.collegeId = collegeId;
	this.collegeName = collegeName;
}

public int getCollegeId() {
	return collegeId;
}

public void setCollegeId(int collegeId) {
	this.collegeId = collegeId;
}

public String getCollegeName() {
	return collegeName;
}

public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("College [collegeId=").append(collegeId).append(", collegeName=").append(collegeName).append("]");
	return builder.toString();
}




}



public class JavaBeanDemo {

	public static void main(String[] args) {
		College college1=new College();
		college1.setCollegeId(101);
        college1.setCollegeName("swami vevakananda");
        System.out.println(college1);
        
        System.out.println(college1.getCollegeId()+" "+college1.getCollegeName());
        
        
        College college2=new College(102, "ihrm");
        System.out.println(college2.getCollegeId()+" "+college2.getCollegeName());	

	}

}
