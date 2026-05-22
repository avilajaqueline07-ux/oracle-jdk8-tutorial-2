package com.example;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
    	
    	// Crear un objeto Manzana sin especificar ninguna propiedad de la Manzana
    	// Se utiliza el constructor sin parametros
    	
    	Manzana manzana1 = new Manzana();
    	
    	/* ¿Como imprimir en la consola el objeto referenciado por la variable 
    	 * manzana1? */
    	System.out.println("------- Imprimiendo manzana1 ------- ");
    	System.out.println(manzana1.toString());
    	
    	// Si quisiera crear un objeto Manzana y solamente especificar la variedad de la 
    	// Manzana, me daria error porque yo no tengo un constructor que reciba un solo
    	// parametro
    	
    	Manzana manzana2 = new Manzana("Golden");
    	
    	System.out.println("------- Imprimiendo manzana2 ------- ");
    	System.out.println(manzana2);
    	
    	/* ¿Como comparar dos objetos Manzana para saber si son iguales o no? 
    	 * 
    	 * Vamos a crear dos objetos Manzana que sean de la misma variedad y precio */
    	
    	Manzana manzana3 = new Manzana("reineta", new BigDecimal(2.0));
    	Manzana manzana4 = new Manzana("reineta", new BigDecimal(2.0));
    	
    	
    	
    	
    	
      	
    }
}
