package confi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	public static String verifyConfi(){
		String path=System.getProperty("user.dir")+"\\src\\test\\java\\confi\\config.properties";
		System.out.println(path);
		File profile=new File(path);
		FileInputStream inStream = null;
		Properties pro=new Properties();
		try {
			inStream = new FileInputStream(profile);
			pro.load(inStream);
		} catch (IOException e) {

			e.printStackTrace();
		}
		return pro.getProperty("browser");
	}

}
