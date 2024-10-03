package br.com.lucaspjardim.service;

import br.com.lucaspjardim.veiculos.Veiculo;

import java.util.ArrayList;

/**
 * Author: Lucas Jardim
 */
public class ListaVeiculos<TipoVeiculo extends Veiculo> {
    private ArrayList<TipoVeiculo> veiculos = new ArrayList<>();

    public void adicionar(TipoVeiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void exibirVeiculos() {
        for (TipoVeiculo veiculo : veiculos) {
            veiculo.exibir();
        }
    }
}
