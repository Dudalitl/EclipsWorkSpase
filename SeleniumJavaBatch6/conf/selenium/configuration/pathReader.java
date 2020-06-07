package selenium.configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class pathReader {
	
	public static Properties prop;
	
	public static void reader(String filePath) {
		try {
			FileInputStream fis=new FileInputStream(filePath);
			prop=new Properties();
			prop.load(fis);
			fis.close();
			} catch (FileNotFoundException e) {
			e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
	public static String getProp(String key) {
		return prop.getProperty(key);
	}

}
