/*
 * @author: Diego André Rosales Valenzuela
 * @date: 14/08/2023
 * 
 */

package Eras_Tour;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int opcion = menu();
        
        while (opcion!=6){
            if (opcion == 1){
                System.out.println("Ingrese su nombre: ");
                String nombre = sc.nextLine();
                System.out.println("Ingrese su email: ");
                String email = sc.nextLine();
                System.out.println("Ingrese la cantidad de boletos: ");
                int cantBoleto = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingrese su presupuesto máximo: ");
                int saldoMax = sc.nextInt();
                sc.nextLine();

                Comprador comprador = new Comprador(nombre, email, cantBoleto, saldoMax);
                System.out.println(comprador);
                
                opcion = menu();
            }


        }
    
    }









    public static int menu(){
		Scanner sc = new Scanner(System.in);
		String opString = ""; //Opción sin validar
		boolean bueno = false;
		int opcion = 0; //opcion para validar

		while (!bueno){
			System.out.println("Menú");
			System.out.println("1. Nuevo comprador");
			System.out.println("2. Nueva solicitud de boletos");
			System.out.println("3. Consultar disponibilidad total");
			System.out.println("4. Consultar disponibilidad individual");
			System.out.println("5. Reporte de caja");
			System.out.println("6. Salir");
			System.out.println("\nSeleccione la opción que desea: ");
			opString = sc.nextLine();
			
			try{
				opcion = Integer.parseInt(opString);
				if (opcion<1 || opcion>6) //Debe ser una opción válida
					System.out.println("Debe ingresar una de las opciones del menú");
				else
					bueno = true;
			}
			catch(Exception e){
				System.out.println("Debe ingresar un número entero\n");
			}
		}
		return opcion;
	}











    
}
