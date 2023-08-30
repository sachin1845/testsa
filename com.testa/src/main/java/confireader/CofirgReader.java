package confireader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CofirgReader {
	
	private Properties prop;
	private FileInputStream ip;
	public Properties initLangProp(String language) throws IOException
	{
		
	
		
		System.getProperty("language is:  "+language);
		prop=new Properties();
		try
		{
		switch(language.toLowerCase())
		{
		case "english":
		ip=new FileInputStream("./src/main/resources/lang.english.properties");
		break;
		case "french":
			ip=new FileInputStream("./src/main/resources/lang.french.properties");
			break;
		case "russian":
		ip=new FileInputStream("./src/main/resources/lang.french.properties");
		break;
		
		default:
			System.out.println("lang not found..."+ language);
			break;
		}
		prop.load(ip);
	}
		catch(Exception e)
		{
		}
		return prop;
	}

		}



