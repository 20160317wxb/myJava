/*
 * 设计一个能随机产生100个大写英文字母的方法，输出各个元音字母出现的次数
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class aeiou {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[]=new char[1000];
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<1000;i++){
			int a=(int) (Math.random()*26);//随机生成1~26之间数字
			c[i]=(char) (a+65);//从0开始+65转换为大写字母
			if(c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'){
				if(map.containsKey(c[i])){
					map.put(c[i], map.get(c[i])+1);
				}else{
					map.put(c[i], 1);
				}
			}
		}
		for(Entry<Character, Integer> e:map.entrySet()){
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
	}

}
