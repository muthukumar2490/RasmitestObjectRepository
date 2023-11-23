package testObjectRepository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readPropertyFile {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\KANNA\\eclipse-workspace\\testObjectRepository\\src\\file.property"; 
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		

		
		
	}

}
