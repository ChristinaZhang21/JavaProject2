package com.shxy.java;


public class SchoolPeople {
	String name;
	int num;
	String gender;
	int tel;
	String nation;
	SchoolPeople(String name,int num,String gender,int tel,String nation){	
		this.name=name;
		this.num=num;
		this.gender=gender;
		this.tel=tel;
		this.nation=nation;
	}
	public String toString(){
		return "|姓名："+name+
				"| |编号："+num+
				"| |性别："+gender+
				"|	|联系方式："+tel+"||民族："+nation+"|";		
	}
}
class Course{
	//课程（编号、课程名称、上课地点、时间、授课教师、……）
	String name;
	int num;
	String location;
	String teacher;
	String time;
	double credit;
	Course(){}
	Course(String name,int num,String location,String teacher,String time,double credit)
	{
		this.name=name;
		this.num=num;
		this.location=location;
		this.teacher=teacher;
		this.time=time;
		this.credit=credit;
	}
	public String toString()
	{ 
		return "所选课程信息："+"\r\n"+"|课程名："+name+
				"| |课程编号："+num+"| |上课地点："
				+teacher+"| |授课教师："+location+
				"| |上课时间："+time+"| |学分："+credit+"|";		
	}
}
class Student extends SchoolPeople{
	Course scourse;
	double grade;	

	Student(String name,int num,String gender,int tel,String nation){
		super(name,num,gender,tel,nation);
	}
	public String toString(){
		return "学生信息："+"\r\n"+super.toString()+"\r\n";
	}

	public Course getScourse() {
		return scourse;
	}

	public void setScourse(Course scourse) {
		this.scourse = scourse;
	}

	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}


}
class Teacher extends SchoolPeople{	
	Teacher(String name,int num,String gender,int tel,String nation){
		super(name,num,gender,tel,nation);
	}
	Course tcourse;
	String competent;
	public String toString(){
		return "\r\n"+"授课教师信息："+"\r\n"+super.toString()+"|职称："+competent+"|";
	}
	public Course getTcourse() {
		return tcourse;
	}
	public void setTcourse(Course cour1) {
		this.tcourse = cour1;
	}
	public String getCompetent() {
		return competent;
	}
	public void setCompetent(String competent) {
		this.competent = competent;
	}
	
	}


