package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Grade {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String name;
	private Date date;
	private double nota1;
	private double nota2;
	private double nota3;
	private int registration;
	
	public Grade() {
	}
	
	public Grade(String name, Date date, double nota1, double nota2, double nota3, int registration) {
		this.name = name;
		this.date = date;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.registration = registration;
	}

	public static SimpleDateFormat getSdf() {
		return sdf;
	}

	public static void setSdf(SimpleDateFormat sdf) {
		Grade.sdf = sdf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public int getRegistration() {
		return registration;
	}

	public void setRegistration(int registration) {
		this.registration = registration;
	}

	public double average() {
		return ((nota1 + nota2 + nota3) /3);
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: " + name + " | Data: " + sdf.format(getDate()) + "\n");
		sb.append("Matricula: " + registration +"\n");
		sb.append("Grade1: " + String.format("%.2f", nota1) 
		+ "| Grade2: " +String.format("%.2f", nota2) +" | Grade3: " 
		+ String.format("%.2f", nota3) +"\n");
		sb.append("Media:" + String.format("%.2f", average()));
		return sb.toString();
	}
	
	
	
}
