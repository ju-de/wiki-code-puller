import java.util.Scanner;

public class WikiCodePuller{

	public static void main(String[] args){
		String line = "";

		try{
			Scanner sc = new Scanner(System.in);
			File file = new File("XSS Filter Evasion Cheat Sheet.txt");

			in = new Scanner(file());
		}

		boolean isCode = false;

		while(in.hasNextLine()){
			line = line+in.nextLine();
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