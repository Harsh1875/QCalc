package com.crio.qcalc;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(QcalcApplication.class, args);
		System.out.println("Hello World!");

		StandardCalculator calc = new StandardCalculator();
		calc.multiply(-Double.MAX_VALUE,5);
		System.out.println(calc.getResult());
		calc.printResult();
		
	}

}
