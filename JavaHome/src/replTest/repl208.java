package replTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class repl208 {
	
	public static void display() throws IOException {
		String filePath1=System.getProperty("user.dir")+"/configs/configurations.properties";
		FileInputStream fis=new FileInputStream(filePath1);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		//String browser=prop.getProperty("browser");
		//String url=prop.getProperty("url");
		
		//System.out.println(browser);
		//System.out.println(url);
	}

	public static void main(String[] args) {
		
		try {
			display();
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("java.io.FileNotFoundException:  (No such file or directory)");
		
		}
		

	}

}
