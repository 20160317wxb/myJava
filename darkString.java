import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class darkString {
	public static void main(String[] args) {
		System.out.println("请输入一个字符串");
		String str=new String();
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		Set<Character> set=new HashSet<Character>();
		for(char c:str.toCharArray()){
			set.add(c);
		}
		int count=set.size();
		Map<String, Integer> map=new HashMap<String, Integer>();
		for(int i=0;i<str.length()-count+1;i++){
			boolean flag=true;
			String s=str.substring(i,i+count);
			for(char c:set){
				if(!s.contains(c+"")){
					flag=false;
				}
			}
			
			
			if(flag){
				if(map.containsKey(s)){
					map.put(s, map.get(s)+1);
				}else{
					map.put(s,1);
				}
			}
		}
		if(map.entrySet().size()==0){
			System.out.println("这是一个暗黑字符串");
		}else{
			System.out.println("这是一个纯净字符串");
			for(Entry<String, Integer> e:map.entrySet()){
				System.out.println(e.getKey()+":"+e.getValue());
			}
		}
	}
}
