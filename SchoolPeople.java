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
		return "|������"+name+
				"| |��ţ�"+num+
				"| |�Ա�"+gender+
				"|	|��ϵ��ʽ��"+tel+"||���壺"+nation+"|";		
	}
}
class Course{
	//�γ̣���š��γ����ơ��Ͽεص㡢ʱ�䡢�ڿν�ʦ��������
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
		return "��ѡ�γ���Ϣ��"+"\r\n"+"|�γ�����"+name+
				"| |�γ̱�ţ�"+num+"| |�Ͽεص㣺"
				+teacher+"| |�ڿν�ʦ��"+location+
				"| |�Ͽ�ʱ�䣺"+time+"| |ѧ�֣�"+credit+"|";		
	}
}
class Student extends SchoolPeople{
	Course scourse;
	double grade;	

	Student(String name,int num,String gender,int tel,String nation){
		super(name,num,gender,tel,nation);
	}
	public String toString(){
		return "ѧ����Ϣ��"+"\r\n"+super.toString()+"\r\n";
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
		return "\r\n"+"�ڿν�ʦ��Ϣ��"+"\r\n"+super.toString()+"|ְ�ƣ�"+competent+"|";
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


