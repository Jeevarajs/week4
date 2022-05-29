package week4;

public class student {


public void getstudentinfo(int studentId,String name) {
	System.out.println("StudentId:"+studentId+" "+"Studentname:"+name);
			
}
public void getstudentinfo(String email,long phonenumber) {
	System.out.println("EmailId:"+email+" "+"Phonenumber:"+phonenumber);
			
}
public static void main(String[] args) {
	student Stu =new student();
	Stu.getstudentinfo(107, "jeeva");
	Stu.getstudentinfo("jeeva@gmail.com",890567785);
	
}



}
