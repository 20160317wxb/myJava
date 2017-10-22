import java.util.Scanner;

/**
 * 把一个字符串的大写字母放到字符串的后面，各个字符的相对位置不变。
 * @author DELL
 *
 */
public class Test11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input");
		String str=sc.next();
		String str1=new String();
		String str2=new String();
		for(int i=0;i<str.length();i++){
			String s=str.substring(i,i+1);
			if(s.toUpperCase().equals(s)){
				str1+=s;
			}else{
				str2+=s;
			}
		}
		str=str2+str1;
		System.out.println(str);
	}
}
