package org.yantra.genericUtility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class JavaUtility {
	WebDriver driver;
	/**
	 * This class contains java reusable methods
	 * @author Manigandan Palluru
	 *
	 */

		/**
		 * This method is used to generate Random Number
		 * @return
		 */

		public int getRandomNumber() 
		{
			return new Random().nextInt(1000);
		}
		/**
		 * This method is used to convert the String to Long data type
		 * @param stringData
		 * @return
		 */
		public long convertStringToLong(String stringData)
		{
			return Long.parseLong(stringData);
		}
		/**
		 * This method is used to get current date in specified strategy
		 * @param strategy
		 * @return
		 */
		public String getCurrentDate(String strategy)
		{
			return new SimpleDateFormat(strategy).format(new Date());
		}
		/**
		 * This method is used to split the String based on Strategy
		 * @param value
		 * @param strategy
		 * @return
		 */
		public String[] SplitString(String value, String strategy)
		{

			return value.split(strategy);
		}
		/**
		 * This method is used to print the value in Console 
		 * @param statement
		 */
		public void printStatement(String statement)
		{
			System.out.println(statement);

		}
		
		public int convertMonthfromStringtoInt(String strategy,String monthName)
		{
		return DateTimeFormatter.ofPattern(strategy).withLocale(Locale.ENGLISH).parse(monthName).get(ChronoField.MONTH_OF_YEAR);
		}
	}
