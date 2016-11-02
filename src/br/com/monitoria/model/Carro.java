package br.com.monitoria.model;

public class Carro extends Veiculo{

	public Carro(String codigo, String placa, String modelo) {
		super(codigo, placa, modelo);
		
	}

	@Override
	public void acelerar(Veiculo v) {
		System.out.println(v.getModelo());
		
	}

}
