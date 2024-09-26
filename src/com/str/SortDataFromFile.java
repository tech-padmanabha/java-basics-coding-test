package com.str;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDataFromFile {
	
	public static void sort(String fileLocation,String destination) {
		File file = new File(fileLocation);
		File file2 = new File(destination);
		List<String> storeList = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String currentLine = br.readLine();
			while(currentLine != null) {
				storeList.add(currentLine);
				currentLine = br.readLine();
			}
			Collections.sort(storeList);
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(file2));
			for(String s:storeList) {
				bw.write(s);
				bw.newLine();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
