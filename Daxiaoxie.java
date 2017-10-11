/**
 * 将一个字符串中的小写字母转为大写，大写转为小写，其他不变
 */

import java.util.Scanner;

public class Test4 {
	
	public static String Change(String str){
		String s1=new String();
		for(int i=0;i<str.length();i++){
			String s=str.substring(i,i+1);
			if(s.equals(s.toLowerCase())){
				s1+=s.toUpperCase();
				//System.out.println("小写");
			}else{
				if(s.equals(s.toUpperCase())){
					//System.out.println("大写");
					s1+=s.toLowerCase();
				}
			}
		}
		return s1;
	}
	
	public static void main(String[] args) {
		System.out.println("input string");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		str=Change(str);
		System.out.println(str);
	}
}
