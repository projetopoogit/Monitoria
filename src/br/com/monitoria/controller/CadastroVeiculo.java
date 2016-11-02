package br.com.monitoria.controller;

import br.com.monitoria.model.Veiculo;
import br.com.monitoria.repository.IRepositorioVeiculo;
import br.com.monitoria.repository.RepositorioVeiculo;

public class CadastroVeiculo {

	private IRepositorioVeiculo repositorio;

	public CadastroVeiculo() {
		repositorio = new RepositorioVeiculo();
	}

	public void cadastrar(Veiculo v) {
		if (v != null) {
			repositorio.inserir(v);

		}

	}

	public Veiculo pesquisar(String codigo) {
		if (codigo == null) {
			System.out.println("DIGITE DENOVO");
		}

		return repositorio.Pesquisar(codigo);
	}

	public void remover(String placa) {
		if (placa != null) {
			repositorio.remover(placa);
		}
	}

}
