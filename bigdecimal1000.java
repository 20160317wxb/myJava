import java.math.BigDecimal;

/*
 * 1000!(1!+2!+…+1000！)
 */
public class bigdecimal1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("1000!=");
		BigDecimal a=new BigDecimal(1);
		
		for(int i=1;i<=1000;i++){
			BigDecimal b=new BigDecimal(i);
			a=a.multiply(b);
		}
		System.out.println(a);
	}

}
