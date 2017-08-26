package net.sf.jdec.commonutil;

import net.sf.jdec.config.VariableConfigurationResolver;


/***
 * 
 * @author sbelur
 *
 */

/***
 * This class should be used to init all the basic tasks
 * for jdec to work properly. 
 * 
 * TODO: Move all launch tasks like config calls
 * validation calls over here.
 */
public class StartupHelper {
	
	//private static final String VAR_XML_PATH="E:\\work\\workspace\\springboot\\tools\\jedc\\src\\main\\java\\variables.xml";
	
	private static final String VAR_XML_PATH="variables.xml";
	
	public StartupHelper(){
		
	}
	
	public  void start(){
		
		new VariableConfigurationResolver(VAR_XML_PATH).read();
	}
	
	
}

