package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Grade;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		List<Grade> list = new ArrayList<>();
		
		boolean inicial = false;
		char c;
		do {
		if(inicial==false) {
			System.out.println("Do you wish inform the Data Student:");
			c = sc.next().charAt(0);
			if(c=='n') {
				System.exit(0);
			}else {
				inicial = true;
			}
		}
				
				System.out.println("Inform the name of Student:");
				String name = sc.next();
				System.out.println("Inform the date birth of student:");
				Date date = sdf.parse(sc.next());
				System.out.println("Inform the registration os student:");
				int regis = sc.nextInt();
				System.out.println("inform the grade 1 of studen:");
				double nota1 = sc.nextDouble();
				System.out.println("inform the grade 2:");
				double nota2 = sc.nextDouble();
				System.out.println("Inform the grade 3:");
				double nota3 = sc.nextDouble();
				Grade grade = new Grade(name, date, nota1, nota2, nota3, regis);
				list.add(grade);
				
				System.out.println("Do you wish Inform another Student:");
				c = sc.next().charAt(0);
			}while(c!='n');
			System.out.println();
			System.out.println(list.toString());
			sc.close();
		}

	}
	

