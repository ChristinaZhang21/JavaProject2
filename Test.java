package com.shxy.java;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1=new Student("����",2020322,"Ů",1393939399,"��");
		Course cour1=new Course("��ѧ����",001,"����ʦ","ͼ306","��һ06��",3.0);
		Course nocourse=new Course();
		Teacher tch=new Teacher("����ʦ",0202333,"Ů",1306893522,"����");
		tch.setCompetent("����");
		tch.setTcourse(cour1);
		stu1.setScourse(cour1);
		//stu1.setScourse(nocourse);
		if (stu1.getScourse().num==0){
			System.out.println("��ѧ��δѡ�λ����˿Σ�");
			System.out.println(stu1);
			System.out.println("��ѡ����Ϣ");
	
		}else{
			System.out.println("��ѧ����ѡ�Σ�");
			System.out.println(stu1);
			System.out.println(cour1);
			System.out.println(tch);
		}

	}

}
