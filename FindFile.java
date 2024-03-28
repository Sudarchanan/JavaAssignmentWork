package fileQuiz;

import java.io.File;
import java.util.Scanner;

public class FindFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter file to Find : ");
		String fileToFind = sc.next();
		
		String fd = "D:\\kvaluvent\\IOStreams";
		File file = new File(fd +"\\"+fileToFind );
		File fileDirectory = new File(fd);
		
		if (file.exists() ) {
			System.out.println("File Found");
		}
		else if(fileDirectory.isDirectory()) {
			File[] files = fileDirectory.listFiles();
			for(File f: files) {
				System.out.println(f.getName());
			}
		}else {
			System.out.println("File Not Found");
		}
		

	}

}
