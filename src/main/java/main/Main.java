package main;

import jogos.Ranking;
import model.Jogador;

public class Main {
    public static void main(String[] args) {

        Ranking ranking = new Ranking();

        Jogador jogador1 = new Jogador("Maria", 150);
        Jogador jogador2 = new Jogador("João", 200);
        Jogador jogador3 = new Jogador("José", 500);

        System.out.println(jogador1);
        System.out.println(jogador2);
        System.out.println(jogador3);

        ranking.adicionarJogador(jogador1);
        ranking.adicionarJogador(jogador2);
        ranking.adicionarJogador(jogador3);
    }
}
