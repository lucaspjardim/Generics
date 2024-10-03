package br.com.lucaspjardim.veiculos;

/**
 * Author: Lucas Jardim
 */
public class Moto extends Veiculo{
    public Moto(String nome, int ano) {
        super(nome, ano);
    }

    @Override
    public void exibir() {
        System.out.println("Moto: " + getNome() + " Ano: " +getAno());
    }
}
