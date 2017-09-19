/*题目：有五个学生，每个学生有3门课的成绩，从键盘输入以上数据（包括学生号，姓名，三门课成绩），
 * 计算出平均成绩，把原有的数据和计算出的平均分数存放在磁盘文件 "grade.txt "中。 
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Grade {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("D:\\grade.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		for(int i=0;i<5;i++){
			String name=new String();
			String id=new String();
			double grade=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入第"+(i+1)+"个同学的姓名");
			name=sc.next();
			System.out.println("请输入第"+(i+1)+"个同学的学号");
			id=sc.next();
			bw.write("姓名："+name+"\t");
			bw.write("学号："+id+"\t");
			for(int j=0;j<3;j++){
				System.out.println("请输入第"+(j+1)+"门课的成绩");
				double d=sc.nextDouble();
				bw.write("第"+(j+1)+"门课的成绩"+d+"\t");
				grade+=d;
			}
			System.out.println("平均成绩为："+grade/3);
			bw.write("平均成绩为："+Double.toString(grade/3));
			bw.newLine();
		}
		System.out.println("已写入D:/grade.txt");
		bw.close();
		fw.close();
	}
	

}
