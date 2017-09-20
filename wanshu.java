/*
 * 一个数如果恰好等于它的因子之和，这个数就称为“完数”。例如6的因子为1、2、3，而6=1+2+3。因此6是“完数”。编写一个小应用程序求1000之内的所有完数
 */
public class wanshu {
	public static void main(String[] args) {
		System.out.println("1000以内的完数有：");
		for(int i=1;i<1000;i++){
			int a=0;
			for(int j=1;j<=i/2;j++){
				if(i%j==0){//查找i的因子，并相加
					a+=j;
				}
			}
			if(a==i){
				System.out.print(i+"\t");
			}
		}
	}
}
