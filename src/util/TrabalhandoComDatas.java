package util;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TrabalhandoComDatas {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date (0L);
		
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		
		System.out.println(y1);
		System.out.println(y2);

	}

}
