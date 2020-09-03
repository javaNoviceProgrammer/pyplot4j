package pyplot4j.util;

import java.io.IOException;
import java.util.Scanner;


public class TerminalExecutor {

	private TerminalExecutor() {

	}

	public static void execute(String toolname, String filename, String... args) {
		// build the command
		StringBuilder sb = new StringBuilder() ;
		sb.append(toolname).append(" ") ;
		if(args != null && args.length > 0) {
			for(int i=0; i<args.length; i++)
				sb.append(args[i] + " ") ;
		}
		sb.append(filename) ;
		// execute on the terminal (command line)
		Runtime rt = Runtime.getRuntime() ;
		try {
			Process process = rt.exec(sb.toString()) ;
			Thread thread1 = new Thread(() -> {
				Scanner result = new Scanner(process.getInputStream()) ;
				while(result.hasNext()) {
					System.out.println(result.nextLine());
				}
				result.close();
			}) ;
			thread1.start();
			Thread thread2 = new Thread(() -> {
				String line = "" ;
				Scanner error = new Scanner(process.getErrorStream()) ;
				while(error.hasNext()) {
					line = error.nextLine() ;
					if(line.contains("error"))
						System.err.println(line);
					else
						System.out.println(line);
				}
				error.close();
			}) ;
			thread2.start();
			Thread.sleep(100L);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}



}
