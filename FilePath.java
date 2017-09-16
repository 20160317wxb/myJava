import java.util.Scanner;


public class FilePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileFullName;
		String fileFullPath;
		String fileName;
		String fileExt;
		System.out.println("请输入全路径");
		Scanner sc=new Scanner(System.in);
		fileFullPath=sc.next();
		fileFullName=fileFullPath.substring(fileFullPath.lastIndexOf("\\")+1);
		fileExt=fileFullName.substring(fileFullName.lastIndexOf("."));
		fileName=fileFullName.substring(0, fileFullName.lastIndexOf("."));
		System.out.println("文件全名为："+fileFullName);
		System.out.println("文件名为："+fileName);
		System.out.println("文件扩展名为："+fileExt);
		
		
	}

}
