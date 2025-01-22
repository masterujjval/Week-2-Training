import java.util.*;

// driver class and driver method

public class SchoolAndStudent{
public static void main(String args[]){

// creating object 
School school=new School("Maharishi");

Student s1=new Student("ujjwal");
Student s2=new Student("Steve jobs");

// adding student in school
school.addStd(s1);
school.addStd(s2);

school.display();

//objects of courses and students

Course c1=new Course("Maths");
Course c2=new Course("AI");

s1.addCourse(c1);
s2.addCourse(c2);
System.out.println("--------------------");
s1.display();
s2.display();


}
}




public class School{
public String name;
private ArrayList<Student> std; // school -> arggregates -> student (child is independant)

School(String name){
this.name=name;
this.std=new ArrayList<>();
}
// method to add student in our school
public void addStd(Student student){
std.add(student);
}

// display all student in the school

public void display(){
System.out.println("School Name: "+name);
for(Student s:std){
System.out.println("Student name: "+s.getName());
}
}



}

public class Student{
public String name;
private ArrayList<Course> course;

Student(String name){
this.name=name;
this.course=new ArrayList<>();
}

public void addCourse(Course ob){
course.add(ob);
ob.enrolled(this);

}

// to display student name in school
public String getName(){
return name;
}

//method to display student enrolled in courses

public void display(){
System.out.println("Student name: "+name);
for(Course c:course){
System.out.println("Enrolled in Subjects: "+c.getCourse());
}
}


}

public class Course{
public String name;
private ArrayList<Student> student;

Course(String name){
this.name=name;
this.student=new ArrayList<>();
}
//method to display course 
public String getCourse(){
return name;
}

public void enrolled(Student s){
student.add(s);
}

// method to view course 
public void display(){
System.out.println("course: "+name);
for(Student s:student){
System.out.println("Studen name enrolled in the course: "+s.getName());
}
}



}
