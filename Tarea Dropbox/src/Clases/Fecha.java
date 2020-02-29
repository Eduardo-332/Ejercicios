package Clases;


public class Fecha {
	private int day;
	private int month;
	private int year;
	
	public Fecha(String fecha) {
		String partes [] = fecha.split("-"); 
		this.day = Integer.parseInt(partes [0]);
		this.month = Integer.parseInt(partes [1]);
		this.year = Integer.parseInt(partes [2]);
		
	}

//	public Fecha(int day, int month, int year) {
//		super();
//		this.day = day;
//		this.month = month;
//		this.year = year;
//	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String toString() {
		return "Fecha: " + day + "/" + month + "/" + year;
	} 
	
	public boolean verificarfecha() {
		
		if (day > 31 || day < 1)
			return false ;
		
		if (month > 12 || month < 1) 
			return false;
		
		if (year > 4000 || year < 1900 )
			return false;
		
		
		return true;
	}
	

}
