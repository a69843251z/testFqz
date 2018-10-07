import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class test {
	public static void main(String[] args) {
		PropertyConfigurator.configure("D:\\EclipseProject\\SeleniumFqz\\tool\\log4j.properties");
		Logger logger = Logger.getLogger(test.class);
		logger.info("abc");
	}

}
