package utilidades;

import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtilities {

	public static Date getDateFromDayMonthYear(int dia, int mes, int agno) {
		Date date;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);//mes - 1 porque este constructor define enero como 0
		date = calendario.getTime(); //devuelve un objeto clase DATE
		return date;
	}
	
}
