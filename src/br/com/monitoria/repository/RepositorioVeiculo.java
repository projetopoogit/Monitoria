package br.com.monitoria.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.monitoria.model.Veiculo;

public class RepositorioVeiculo implements IRepositorioVeiculo {

	private List<Veiculo> listaVeiculos;

	public RepositorioVeiculo() {
		listaVeiculos = new ArrayList<Veiculo>();

	}

	@Override
	public void inserir(Veiculo v) {
		listaVeiculos.add(v);

	}

	@Override
	public Veiculo Pesquisar(String codigo) {
		Veiculo aux = null;

		for (Veiculo v : listaVeiculos) {
			if (v.getCodigo().equals(codigo)) {
				aux = v;
			}

		}

		return aux;
	}

	@Override
	public void remover(String placa) {
		for (Veiculo v : listaVeiculos) {

			if (v.getPlaca().equals(placa)) {
				listaVeiculos.remove(placa);

			}

		}

	}

}
