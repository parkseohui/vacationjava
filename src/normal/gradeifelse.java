package normal;

import java.util.Scanner;

public class gradeifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("�������Է��ϼ���");
int point=input.nextInt();
char grade;

if(90<=point)
	grade='a';
else if(80<=point)
	grade='b';
else if(70<=point)
	grade='c';
else
	grade='f';
System.out.println("����"+grade);
	}

}
