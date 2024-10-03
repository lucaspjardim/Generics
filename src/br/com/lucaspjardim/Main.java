package br.com.lucaspjardim;

import br.com.lucaspjardim.service.ListaVeiculos;
import br.com.lucaspjardim.veiculos.Caminhao;
import br.com.lucaspjardim.veiculos.Carro;
import br.com.lucaspjardim.veiculos.Moto;
import br.com.lucaspjardim.veiculos.Veiculo;

/**
 * Author: Lucas Jardim
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaVeiculos<Veiculo> listaVeiculos = new ListaVeiculos<>();

        listaVeiculos.adicionar(new Carro("Toyota Corolla", 2021));
        listaVeiculos.adicionar(new Moto("Yamaha YZF-R3", 2018));
        listaVeiculos.adicionar(new Caminhao("Volvo FH", 2022));

        listaVeiculos.exibirVeiculos();
    }
}