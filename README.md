# JavaProject2
Java课程作业第二次实验

## 计G201 张丽蓉 2020322068

## 一、实验目的
1. 通过实例化对象调用方法的过程，再次学习理解子类继承父类的原理与实现
2. 通过构造方法的重载以及实例化多个不同参数变量的对象，学习理解子类继承父类的原理与实现
3. 在实例化对象时，通过使用super()方法，理解super()调用父类有参构造方法的作用
4. 在输出结果信息时，学会使用Object父类的toString()方法
## 二、实验要求
1. 拥有一个具有共同属性的实体父类SchoolPerson,分别具有各自属性和方法的子类Student类和Teacher类
2. 编写Course实体类以及模拟系统操作的主类Test类
3. 主类通过实例化Student、Teacher、Course类的实体，完成学生选课并输出信息、学生退课并输出信息的模拟操作
## 三、实验过程
1. 创建父类SchoolPerson并满足以下要求：
- 具有（姓名）name、（编号）num、（性别）gender、（电话）tel、（民族）nation属性
- 重载构造方法SchoolPerson，参数列表为全部属性
- 重写toString（）方法，输出属性信息
2. 创建子类Student类并满足以下要求：
- 具有从父类继承来的（姓名）name、（编号）num、（性别）gender、（电话）tel、（民族）nation属性，以及新属性（课程）scourse、（成绩）grade
- 编写setter、getter方法
- 拥有super()方法调用父类有参数的构造方法
- 重写toString（）方法，输出属性信息
3. 创建子类Teacher类并满足以下要求：
- 具有从父类继承来的（姓名）name、（编号）num、（性别）gender、（电话）tel、（民族）nation属性，以及新属性（课程）tcourse、（职称）competent
- 拥有super()方法调用父类有参数的构造方法
- 编写setter、getter方法
- 重写toString（）方法，输出属性信息
4. 创建Course类并满足以下要求：
- 具有（课程名称）name、（课程编号）num、（上课地点）location、（授课教师）teacher、（上课时间）time、（学分）credit属性
- 分别拥有无参和有参的构造方法
- 编写setter、getter方法
- 重写toString（）方法，输出属性信息
5. 创建Test主类并满足以下要求：
- 在main（）方法中实例化Teacher、Student、Course实体类，并赋值
- 分别拥有无参和有参的构造方法
- 编写setter、getter方法
- 重写toString（）方法，输出属性信息
2. 完成附加要求：
- 将多个类放置在不同的包中。
- 每个类中定义不少于两个构造方法，定义不少于两个属性，且多样化属性类型和修饰符。
- 在类中定义get和set方法操作属性。
- 在CPU类中定义的setSpeed（int）方法设置逻辑判断，speed需大于0。
## 三、核心代码
1. 方法一
pc类中的赋值方法
```
public void setCpu(CPU c){
		this.cpu=c;
	}
public void setHardDisk(HardDisk h){
		this.HD=h;
	}
```
2. 方法二
cpu类的两个构造方法
```
public CPU(){
		super();
		//第一个构造方法
	}
	CPU(int speed,double price){
		//第二个构造方法
	}
```
3. 方法三
pc类中的show（）方法
```
public void show(){
	System.out.println("CPU的速度为："+cpu.getSpeed()+"
			;硬盘的容量为："+HD.getAmount());
	}
```
4. 方法四
CPU类中进行简单逻辑判断speed是否大于0的方法

```
public void setSpeed(int m){
		if(m<0){
			this.speed=0;
		}else{
			this.speed=m;
		}
	}
```
5. 方法五
主类中实例化其他类对象

```
CPU cpu=new CPU();             
cpu.setSpeed(2200);            
HardDisk disk=new HardDisk();  
disk.setAmount(200);           
PC pc=new PC();                
pc.setCpu(cpu);                
pc.setHardDisk(disk);          
pc.show();                     
```
## 四、实验结果

运行程序成功，输出语句———CPU的速度为：2200;硬盘的容量为：200

![图片文件](http://note.youdao.com/yws/public/resource/1702e58cbd09251464ea013ed8cbb85d/xmlnote/WEBRESOURCE99148ae5dc3d90a8ed2f3a6eb4c37f59/10)
## 五、实验感想
通过本次实验，我掌握了JAVA编程的基本规则语法，对类与对象的概念，以及构造方法的使用，进行了深层次的学习，还通过修改属性修饰符为private或protected体会到了不同包下不同修饰符的权限设置。同时，我通过GitHub提交实验报告的任务，接触到了如何使用MarkDown语法书写ReadMe文档以及其它关于GitHub的使用问题，基本完成了本次实验的内容。
