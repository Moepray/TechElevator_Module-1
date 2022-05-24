package com.techelevator;


import com.techelevator.search.SearchDomain;
import com.techelevator.search.SearchDomainException;
import com.techelevator.search.SearchEngine;
import com.techelevator.util.TELog;
import com.techelevator.util.TELogException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
	//hello3
	public static void main(String[] args) {

		try {

			// Step Two: Create TELog, and log the start of the application.
			TELog.log("Search application started");


			// Step Four: Instantiate a Search Domain
			//
			SearchDomain sd = new SearchDomain("exercise\\data");
			TELog.log("Indexed files:\n" + sd.toString());

//			 Step Six: Single word search

			//you can reuse this method, or type in whatever word you're looking for
			anyWordSearch("telephone line");
			anyWordSearch("Larry");
			anyWordSearch("squirrel");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//word search method
	public static void anyWordSearch(String word) throws Exception {
		SearchEngine se = new SearchEngine(new SearchDomain("exercise\\data"));
		se.indexFiles();
		List<String> searchList = se.search(word);
		for (String filesFound : searchList) {
			System.out.println("Word: '" + word + "' found in.. " + filesFound);
		}
	}

}