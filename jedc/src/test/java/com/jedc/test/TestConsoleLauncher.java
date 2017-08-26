package com.jedc.test;

import net.sf.jdec.config.Configuration;
import net.sf.jdec.main.ConsoleLauncher;

public class TestConsoleLauncher {
	
	public static void main(String[] args) {
		
		String path="D:\\MethodTimeCost.class";
		
		Configuration.setOutputFolderPath("D:\\temp\\output");
		
		Configuration.setClassFilePath(path);
		
		ConsoleLauncher.showSkeletonClass(path);
		
	}

}
