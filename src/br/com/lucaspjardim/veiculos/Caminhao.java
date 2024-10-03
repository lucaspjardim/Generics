package br.com.lucaspjardim.veiculos;

/**
 * Author: Lucas Jardim
 */
public class Caminhao extends Veiculo {
    public Caminhao(String nome, int ano) {
        super(nome, ano);
    }

    @Override
    public void exibir() {
        System.out.println("Caminhao: " +getNome() + " Ano: " + getAno());
    }
}
