package com.shxy.java;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1=new Student("莉莉",2020322,"女",1393939399,"汉");
		Course cour1=new Course("大学物理",001,"李老师","图306","周一06节",3.0);
		Course nocourse=new Course();
		Teacher tch=new Teacher("李老师",0202333,"女",1306893522,"蒙族");
		tch.setCompetent("教授");
		tch.setTcourse(cour1);
		stu1.setScourse(cour1);
		//stu1.setScourse(nocourse);
		if (stu1.getScourse().num==0){
			System.out.println("该学生未选课或已退课！");
			System.out.println(stu1);
			System.out.println("无选课信息");
	
		}else{
			System.out.println("该学生已选课！");
			System.out.println(stu1);
			System.out.println(cour1);
			System.out.println(tch);
		}

	}

}
