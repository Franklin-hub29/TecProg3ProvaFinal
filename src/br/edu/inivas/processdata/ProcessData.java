package br.edu.inivas.processdata;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ProcessData {
	
	public static void processFile(String filePath) {
		String path = System.getenv("filePath");
		File completePath = new File(path);
		List<String> fileContent = new ArrayList();
		String names = "";
		
	}

}
