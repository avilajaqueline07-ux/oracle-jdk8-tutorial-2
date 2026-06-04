package com.example;

public class App {
	public static void main(String[] args) {
		
		/* Trabajo con arrays de dos dimensiones, 
		 * tambien llamado matriz.
		 * 
		 * Cuando el array es de una sola dimension se le denomina
		 * vector. */
		
		/* ¿Como declarar un array de dos dimensiones (matriz) ? */
		
		/* A modo de ejemplo, vamos a crear un array bidimensional
		 * de 3 filas y 3 columnas con numeros enteros.
		 * 
		 * Posteriormente recorreremos dicha matriz para buscar la 
		 * ocurrencia de un numero y cuando se encuentre imprimir
		 * en la consola la fila y la columna donde ha sido encontrado
		 * dicho numero */
		
	
		/* No tiene que ver con los array de dos dimensiones
		 * , pero vale para recordar: Que cuando se declara un array
		 * y en mismo momento se le asigna valores, se obtiene un array
		 * de tamaño fijo
		 *  */
		String[] nombres = {"Elida", "Gina"};
		
		// nombres[2] = "Miguel";
		
		int[][] matrizEnteros = {
				
				{1, 2, 3, 10, 100, 200},
				{4, 5, 6, 20},
				{7, 8, 9 },
				{4, 5, 6, 20, 400},
				{7, 8, 9, 30}
					
		};
		
		/* Ejemplo: Recorrer la matriz anterior para buscar la ocurrencia
		 * del numero 5 y mostrar la fila y la columna en las cuales ha
		 * sido encontrado.
		 * 
		 * Para recorrer una matriz se utilizan sentecias for anidadas,
		 * una para las filas y otra para las columnas */
		
//		for (int fila = 0; fila <= 3 - 1; fila++ ) 
//			for (int columna = 0; columna <= 3 - 1; columna++ ) {
//				
//			}
		
		/* El codigo anterior no es correcto y se ha comentado
		 * porque solamente serviria para tratar una matriz
		 * cuadrada de 3 x 3, es decir 3 filas y 3 columnas.
		 * 
		 * Si ampliamos o disminuimos el numero de filas o de columnas
		 * ya el codigo no vale para nada */
		
		int totalFilas = matrizEnteros.length;
		
		System.out.println("Total de filas: " + totalFilas);
		
		for (int fila = 0; fila <= totalFilas - 1; fila++) 
			for (int columna = 0; columna <= 
			           matrizEnteros[fila].length - 1; columna++) {
				
			}
		
		
		
	}
}



















