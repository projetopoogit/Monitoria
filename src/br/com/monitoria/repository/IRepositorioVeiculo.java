package br.com.monitoria.repository;

import br.com.monitoria.model.Veiculo;

public interface IRepositorioVeiculo {
	
	public void inserir(Veiculo v);
	
	public Veiculo Pesquisar(String codigo);
	
	public void remover(String placa);

	

}
