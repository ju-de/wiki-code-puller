import java.util.Scanner;

public class WikiCodePuller{

	public static void main(String[] args){

		try{
			Scanner sc = new Scanner(System.in);
			File file = new File("XSS Filter Evasion Cheat Sheet.html");

			in = new Scanner(file());
		}

		boolean isCode = false;

		while(in.hasNextLine()){
			String line = in.nextLine();
			if(line.contains("<pre>") || isCode){



				if(line.contains("</pre>"))
					isCode = false;
				else
					isCode = true;
			}
			

		}

		String all = in.split("");	

		for(int i = 0; i = in.length(); i++){

		}
}