package br.ulbra.classe;

import java.util.Scanner;

/**
 *
 * @author Murilo Fernandes Mello 17/03/2022 - 19:02
 */
public class UsaProducao extends Producao {

    public static void main(String[] args) {

        Producao prod = new Producao(0);
        Scanner ler = new Scanner(System.in);
        prod.calcularHMS();
        System.out.println(prod.toString());
        System.out.print("Digite o nome da peça: ");
        prod.setPeca(ler.nextLine());
        System.out.print("Digite o tempo de produção: ");
        prod.setSegundos(ler.nextInt());
        prod.calcularHMS();
        System.out.println(prod.toString());
    }

    public UsaProducao(int hora) {
        super(hora);
    }

}
