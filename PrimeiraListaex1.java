/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.primeiralista;

/**
 *
 * @lukinha.gouveia data:10/11/2022 Lista de estrutruras sequencial e
 * condicional ex1 - Faça um algoritmo que receba um numero positivo calcule e
 * mostre: a- numero digitado ao quadrado b- numero digitado ao cubo c- a raiz
 * quadrada do numero digitado d- a raiz cubica do numero digitado
 */
import static java.lang.Math.cbrt;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class PrimeiraLista {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float num, q, c, rq, rc;
        System.out.println("Digite um número: ");
        num = leia.nextFloat();
        if (num > 0) {
            q = num * num;
            c = num * num * num;
            rq = (float) sqrt(num);
            rc = (float) cbrt(num);
            System.out.println("O quadrado do numero é : " + q);
            System.out.println("O cubo do numero é : " + c);
            System.out.println("A raiz quadrada do numero é : " + rq);
            System.out.println("A raiz cubica do numero é : " + rc);
            }
        else
            System.out.println("O número informado é negativo, reinicie o programa!!");
        
    }
}
