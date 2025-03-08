package main;

import model.Jogador;

public class Main {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Maria", 150);
        Jogador jogador2 = new Jogador("João", 200);
        Jogador jogador3 = new Jogador("José", 500);

        System.out.println(jogador1);
        System.out.println(jogador2);
    }
}
