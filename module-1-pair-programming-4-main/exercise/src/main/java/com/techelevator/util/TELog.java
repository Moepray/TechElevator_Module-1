package com.techelevator.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class TELog {

	//this was part of the bonus
	//printerwriter is now static

	private static PrintWriter printWriter = null;


	public static void log(String message) throws FileNotFoundException {

		//if the printerwriter is null, it assigns a folder for us

		try {
			if(printWriter==null) {
				//Mohammed's file
//				printWriter = new PrintWriter(new FileOutputStream("pop your code in here and then comment mine out"));

				//Bradley's file
				printWriter = new PrintWriter(new FileOutputStream("C:\\Users\\bradl\\OneDrive\\Desktop\\Merit America\\Paired Programming\\module-1-pair-programming-4\\exercise\\logs\\search.log"));
			}
			// this logs the time with the message
			printWriter.println("Time of log : "+LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME) +"\n" + message +"\n");
			printWriter.flush();

		}
		catch (TELogException teLogException) {
			teLogException.getLocalizedMessage();
		}

	}
	}
