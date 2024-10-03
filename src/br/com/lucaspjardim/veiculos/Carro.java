package br.com.lucaspjardim.veiculos;

/**
 * Author: Lucas Jardim
 */
public class Carro extends  Veiculo{
    public Carro(String nome, int ano) {
        super(nome, ano);
    }

    @Override
    public void exibir() {
        System.out.println(("Carro: "+ getNome() + " Ano: " +getAno()));
    }
}
