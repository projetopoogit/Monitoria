package br.com.monitoria.model;
public class Caminhao extends Veiculo {

	public Caminhao(String codigo, String placa, String modelo) {
		super(codigo, placa, modelo);

	}

	@Override
	public void acelerar(Veiculo v) {
		System.out.println(v.getCodigo());

	}

}
