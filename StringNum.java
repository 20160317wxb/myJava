import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class StringNum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("d:\\1.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String str1=null;
		String str2=new String();
		while((str1=br.readLine())!=null){
			str2+=str1;
		}
		Map<String, Integer> map=new HashMap<String, Integer>();
		for(int i=1;i<str2.length()-2;i+=2){
			String s =str2.substring(i, i+2);
			if(map.containsKey(s)){
				map.put(s, map.get(s)+1);
			}else{
				map.put(s, 1);
			}
		}
		for(Entry<String, Integer> e:map.entrySet()){
			System.out.println(e.getKey()+":"+e.getValue());
		}
	}

}
