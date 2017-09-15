import java.util.Scanner;


public class Transform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="零壹贰叁肆伍陆柒捌玖";
		String str2="分角元拾佰仟万拾佰仟亿";
		System.out.println("请输入金额：");
		double d;
		Scanner sc=new Scanner(System.in);
		d=sc.nextDouble()*100;
		int a=(int)d;
		String s=Integer.toString(a);
		for(int i=0;i<s.length();i++){
			System.out.print(str1.charAt(Integer.parseInt(s.charAt(i)+""))+""+str2.charAt(s.length()-1-i));	
		}
	}

}
