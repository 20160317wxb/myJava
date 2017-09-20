/*
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第3个月后每个月又生一对兔子，
 * 假如兔子不死，问每个月的兔子总数为多少？
 */
import java.util.Scanner;

public class Rabbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入月份");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();//月份
		int s1=1,s2=1,s;//总数
		System.out.println("第1个月有1对兔子");
		System.out.println("第2个月有1对兔子");
		//相当于 1,1,2,3,5,6,8,13找规律，输出第i个数
		for(int i=3;i<=m;i++){
			s=s2;
			s2=s1+s2;
			s1=s;
			System.out.println("第"+i+"个月有"+s2+"对兔子");
		}
	}

}
