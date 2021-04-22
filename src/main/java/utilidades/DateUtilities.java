package utilidades;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtilities {

	public static Date getDateFromDayMonthYear(int dia, int mes, int agno) {
		Date date;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);//mes - 1 porque este constructor define enero como 0
		date = calendario.getTime(); //devuelve un objeto clase DATE
		return date;
	}
	
	public static Date getAños(int agno) {
		Date date;
				Calendar calen = new GregorianCalendar();
				int an = calen.get(Calendar.YEAR);
				int mes = calen.get(Calendar.MONTH);
				int dia = calen.get(Calendar.DAY_OF_MONTH);
				an = an-agno;
				Calendar calendario = new GregorianCalendar(an, mes, dia);
				date = calendario.getTime();
		return date;
	}
	
}
