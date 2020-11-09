import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class FileSize {
	
	/*
	 * directory
	 * |
	 * | file 1 file 2 file 3 dir 1
	 * 						   |
	 * 						   file 4 file 5 dir 2
	 * 										 |
	 * 										 |
	 * 										file 6
	 * 
	 * 
	 */
	
	public static long getSize(File file) {
		long size = 0;
		// if file => get size
		// if directory => get all of the files
		// process all of the files and dir
		
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			//for every one of these files
			List<File> xFiles = new LinkedList<>(Arrays.asList(files));
			for(File f: xFiles) {
				size += getSize(f);
			}
		} else {
			size += file.length();
		}
		
		
		
		return size;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please give me a directory or a file:");
		String str = input.nextLine();
		System.out.println("The size is: " + getSize(str));
		
	}

}

