import java.io.File;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WikiCodePuller{
	public static void main(String[] args){
		String line = "";
		File file = new File("xss.txt");

		//read file
		try{
			Scanner sc = new Scanner(file);
			
			while(sc.hasNextLine()){
				line = line + sc.nextLine();
			}
			sc.close();
		}catch(Exception e){
			e.printStackTrace();
		}

		//System.out.println(line);

		//extract code snippets
		Pattern p = Pattern.compile("<pre>(.+?)</pre>");
		Matcher m = p.matcher(line);
		List<String> xss = new ArrayList<String>();

		while(m.find()){
			xss.add(m.group());
		}
		
		for(int i = 0; i<xss.size(); i++){
			xss.set(i, xss.get(i).replaceAll("<pre>",""));
			xss.set(i, xss.get(i).replaceAll("</pre>",""));
		}
		
		for(int i = 0; i<xss.size(); i++){
			System.out.println(xss.get(i));
		}
	}
}