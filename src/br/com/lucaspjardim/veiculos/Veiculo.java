package br.com.lucaspjardim.veiculos;

/**
 * Author: Lucas Jardim
 */
public abstract class Veiculo {
    private String nome;
    private int ano;

    public Veiculo(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public abstract void exibir();
}
