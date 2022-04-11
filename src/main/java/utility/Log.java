package utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;


public class Log {
	public static Logger log= LogManager.getLogger(Log.class.getName());
	@Test
	public static void main(String args[]) {
		try {
			log.info("this is info");
			log.error("this is error hai ji");
			log.fatal("this is fatal");
			log.warn("hello iam warn");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void startT(String sTestName) {
		log.info("========="+sTestName+"=======");
	}
	public void endT(String sTestName) {
		log.info("========="+sTestName+"=======");
	}
	public void info(String sTestName) {
		log.info(sTestName);
	}
	public void error(String sTestName) {
		log.error(sTestName);
	}
	public void warn(String sTestName) {
		log.warn(sTestName);
	}
	public void fatal(String sTestName) {
		log.fatal(sTestName);
	}
	public void debug(String sTestName) {
		log.debug(sTestName);
	}

}
