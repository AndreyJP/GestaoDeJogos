package model;

public class Jogador {
    private String nome;
    private int pontuacao;

    public Jogador(String nome, int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return String.format("Jogador: %s | Pontuação: %d", this.nome, this.pontuacao);
    }
}
