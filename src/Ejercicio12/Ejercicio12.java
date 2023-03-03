package Ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        // Declaracion de las variables
        double HorasTrabajadas, PorcentajeRetencion, ValorHora, SalarioBruto, SalarioNeto;
        // Metodo Scanner para entrada
        Scanner entrada = new Scanner(System.in);
        // Ingresar horas trabajadas
        System.out.println("Ingrese las horas trabajadas: ");
        HorasTrabajadas  = entrada.nextDouble(); // Leer las horas
        ValorHora = 5000;
        PorcentajeRetencion = 12.5;
        SalarioBruto = ValorHora * HorasTrabajadas;
        SalarioNeto =  SalarioBruto * ((100- PorcentajeRetencion)/100);
        // Salidas pedidas
        System.out.println("El porcentaje de Retención en la fuente es: " + PorcentajeRetencion);
        System.out.println("El salario bruto es: " + SalarioBruto);
        System.out.println("El salario neto es: " + SalarioNeto);

    }
}