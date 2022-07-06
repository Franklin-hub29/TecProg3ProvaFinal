package br.edu.uivas.databese;

import java.util.ArrayList;
import java.util.List;

import br.edu.inivas.processdata.ProcessData;

public class Database {
	
	private static List<ProcessData>processs = new ArrayList<>();
	
	
	public static  void addDatas(ProcessData datas) {
		processs.add(datas);
		
	}

}
