package File_handleing;
import java.io.*;
import java .util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Collectors;

public class File_Operation {

	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		File f= new File("./A.txt");
		f.createNewFile();  // Function creates a file
		Path path=  Paths.get("./A.txt");
		List<String> titles= Files.lines(path).collect(Collectors.toList());
		
		
		FileWriter fw= new FileWriter("A.txt");
		BufferedWriter bf= new BufferedWriter(fw);
		bf.write("hello samir now you are in mumbai");
		bf.close();
		
		String search;
		System.out.println("\n enter the to search");
		search=sc.next();
		
		displayResults(search,titles);
		sc.close();
		
	}
	
	private static void displayResults(String search_name,List<String> titles) {
		
		boolean infile= titles.stream().anyMatch(p->p.equalsIgnoreCase(search_name));
		if(infile)
		{
			System.out.println("\n word is present in file "+search_name);
		}
		else {
			System.out.println("\n word is not present in file"+search_name);
		}
	}

}
