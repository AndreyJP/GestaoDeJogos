package main;

import jogos.Ranking;
import model.Jogador;
import torneio.Estatistica;
import torneio.TorneioPrincipal;

public class Main {
    public static void main(String[] args) {

        Ranking ranking = new Ranking();

        Jogador jogador1 = new Jogador("Maria", (int) (Math.random() * 1000));
        Jogador jogador2 = new Jogador("João", (int) (Math.random() * 1000));
        Jogador jogador3 = new Jogador("José", (int) (Math.random() * 1000));

        System.out.println(jogador1);
        System.out.println(jogador2);
        System.out.println(jogador3);

        ranking.adicionarJogador(jogador1);
        ranking.adicionarJogador(jogador2);
        ranking.adicionarJogador(jogador3);

        ranking.exibirRanking();

        // Torneio
        TorneioPrincipal torneioPrincipal = new TorneioPrincipal("Torneio LDS I - 15/03");
        torneioPrincipal.adicionarJogador(jogador1);
        torneioPrincipal.adicionarJogador(jogador2);
        torneioPrincipal.adicionarJogador(jogador1);

        torneioPrincipal.exibirJogadores();

        // Estatísticas
        Estatistica estatistica = new Estatistica(torneioPrincipal);
        estatistica.registrarPontuacao(jogador1, 100);
        estatistica.registrarPontuacao(jogador2, 80);
        estatistica.registrarPontuacao(jogador1, 15);
        estatistica.registrarPontuacao(jogador3, 75);

        estatistica.exibirPontuacoes();
        estatistica.exibirVencedorTorneio();

    }
}
