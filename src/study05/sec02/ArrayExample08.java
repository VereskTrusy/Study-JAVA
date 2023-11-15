package study05.sec02;

import java.util.Scanner;

public class ArrayExample08 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample08 obj = new ArrayExample08();
		obj.method1();
	}

	private void method1() {
		Student s1 = new Student();
		s1.name = "미연";
		s1.kor = 10;
		s1.eng = 20;
		s1.math = 30;
		s1.sum = s1.kor + s1.eng + s1.math;
		s1.avg = s1.sum / 3.0;
		s1.rank = 1;
		
		Student s2 = new Student();
		s2.name = "소연";
		s2.kor = 30;
		s2.eng = 40;
		s2.math = 50;
		s2.sum = s2.kor + s2.eng + s2.math;
		s2.avg = s2.sum / 3.0;
		s2.rank = 1;
		
		Student s3 = new Student();
		s3.name = "지연";
		s3.kor = 60;
		s3.eng = 70;
		s3.math = 80;
		s3.sum = s3.kor + s3.eng + s3.math;
		s3.avg = s3.sum / 3.0;
		s3.rank = 1;
		
//		System.out.println(s1.toString());
//		System.out.println(s2.toString());
//		System.out.println(s3.toString());
		
		Student[] students = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
//		for(int i = 0; i < students.length; i++) {
//			Student s = students[i];
//			System.out.println(s.name + "\t 수학 : " + s.math);
//		}
//		
//		for(int i = 0; i < students.length; i++) {
//			Student s = students[i];
//			System.out.println(s.name + "\t 평균 : " + s.avg);
//		}
		
		// 정렬
		for(Student student1 : students) {
			for(Student student2 : students) {
				if(student1.sum < student2.sum) {
					student1.rank++;
				}
			}
		}
		
		for(Student student : students) {
			System.out.println(student);
		}
		
	}
}// class end


class Student{
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	int rank;
	
	// 단축키 : alt + shift + s > get toString
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg="
				+ avg + ", rank=" + rank + "]";
	}
}
