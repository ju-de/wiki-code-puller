import java.io.File;
import java.util.*;

public class WikiCodePuller{

	public static void main(String[] args){
		String line = "";
		File file = new File("xss.txt");

		try{
			Scanner sc = new Scanner(file);
			
			while(sc.hasNextLine()){
				line = line + sc.nextLine();
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}

		System.out.println(line);

		/*
		Pattern p = Pattern.compile("<tag>(.+?)</tag>");
		Matcher m = p.matcher(line);
		List<String> xss = new ArrayList<String>();

		while(m.find()){
		  matches.add(m.group());
		}*/
	}
}