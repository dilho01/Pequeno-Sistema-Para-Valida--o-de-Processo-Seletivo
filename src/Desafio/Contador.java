package Desafio;

import java.util.Scanner;

public class Contador {
    private static int parametroDois;
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o primeiro numero:");
        int parametroUm = scanner.nextInt();
        System.out.println("digite o segunto numero:");
        int paranmetroDois = scanner.nextInt();
        try {
			
            ParametrosInvalidosException.contar(parametroUm, parametroDois);
		
		}catch ( exception);
	
    } static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
	}
 }
     
