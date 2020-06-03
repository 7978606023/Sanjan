package com.wbl.stream;

import java.text.SimpleDateFormat;
import javax.swing.text.DateFormatter;

public class Day { 
 public static final ThreadLocal<DateFormatter> 
formatter = ThreadLocal.withInitial(() ->  new 
DateFormatter(new SimpleDateFormat("dd-MMM-yyyy")));
}
