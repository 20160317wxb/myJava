/*
 * 打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
 */
public class shuixianhua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("100~999之内的水仙花数有：");
		for(int i=100;i<1000;i++){
			int a=i%10;
			int b=i%100/10;
			int c=i/100;
			int sum=a*a*a+b*b*b+c*c*c;
			if(sum==i){
				System.out.print(i+"\t");
			}
		}
	}

}
