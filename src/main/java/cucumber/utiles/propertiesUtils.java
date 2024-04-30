package cucumber.utiles;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class propertiesUtils {
	private static Properties prop;

	public static String getProperties(String key) {
		if(prop == null)
		{
			prop = new Properties();
		}
		
		String env = System.getProperty("evn", "Stage");
		try {
			System.out.println(System.getProperty("user.dir")+"/src/test/resources/"+env+"application.properties");
			prop.load(new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/"+env+"/application.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(key);

	}
}
