import java.util.Scanner;


public class YangHui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入行数");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][];
		for(int i=0;i<arr.length;i++){
			arr[i]=new int[i+1];//初始化容量
			for(int j=0;j<=i;j++){
				if(i==j||j==0){
					arr[i][j]=1;
				}else{
					arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
				}
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
