package com.test.stream;

import com.wbl.stream.Day;
import java.util.Calendar;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DayTest {
	 @Test
	    public void example(){
	        Calendar cal = Calendar.getInstance();
	        cal.set(Calendar.YEAR, 1970);
	        cal.set(Calendar.MONTH, Calendar.JANUARY);
	        cal.set(Calendar.DAY_OF_MONTH, 1);
	        String formatted = Day.formatter.get().getFormat().format(cal.getTime());
	       Assert.assertEquals("01-Jan-1970", formatted);
	    }
}
