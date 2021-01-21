package br.com.tokiomarine.seguradora.aceitacao.rest.client.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class DateUtil {

	private DateUtil() {}

	private static SimpleDateFormat dataSemHora = new SimpleDateFormat("dd/MM/yyyy");
	private static SimpleDateFormat dataCompleta = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat ano = new SimpleDateFormat("yyyy");
	private static SimpleDateFormat mes = new SimpleDateFormat("MM");

	public synchronized static Date trunc(Long time) {
		try {
			if(time == null) return null;
			
			Date date = new Date(time);
			
			return dataSemHora.parse(dataSemHora.format(date));
		
		} catch (Exception ex) {
			throw new RuntimeException("Erro ao tentar truncar data");
		}
	}
	
	public static String cast(Date date, String format) {		
		if(date == null) return null;
		
		SimpleDateFormat sdf = new SimpleDateFormat(format);

		return sdf.format(date);
	}
	
	public static Date cast(String date, String format) {
		
		if(date == null) return null;
		
		try {		
			SimpleDateFormat sdf = new SimpleDateFormat(format);

			return sdf.parse(date);
			
		} catch (ParseException e) {
			return null;
		}
	}
	
	public static synchronized String formataSemHora(Calendar cal) {

		if (cal == null) { return ""; }

		return dataSemHora.format(cal.getTime());
	}
	
	public static synchronized String formataSemHora(Date cal) {

		if (cal == null) { return ""; }

		return dataSemHora.format(cal.getTime());
	}

	public static Long minutosEmMilisegundos(Integer minutos) {

		return 60L * 1000 * minutos;

	}

	public static synchronized String formataComMes(Date date) {

		if (date == null) { return ""; }

		return mes.format(date);
	}

	public static synchronized String formataComAno(Date date) {

		if (date == null) { return ""; }

		return ano.format(date);
	}

	public static synchronized String formataCompleta(Date date) {

		if (date == null) { return ""; }

		return dataCompleta.format(date);
	}

	public static synchronized String dataDeInicioDoServidor() {

		java.lang.management.RuntimeMXBean rb = java.lang.management.ManagementFactory.getRuntimeMXBean();

		return dataCompleta.format(rb.getStartTime());
	}

	public static Boolean isValidDate(final String data){		
		try {
			dataSemHora.parse(data);
			
		} catch (ParseException e) {			
			e.printStackTrace();
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	} 
	
	public static Date parseData(final String data){
		try {
			return dataSemHora.parse(data);
			
		} catch (ParseException e) {			
			e.printStackTrace();
			return null;
		}		
	}
}
