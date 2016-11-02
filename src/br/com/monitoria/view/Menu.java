package br.com.monitoria.view;

import java.util.Scanner;

import br.com.monitoria.controller.CadastroVeiculo;
import br.com.monitoria.model.Carro;
import br.com.monitoria.model.Veiculo;

public class Menu {

	public static void main(String[] args) {

		CadastroVeiculo veiculos = new CadastroVeiculo();

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o codigo");
		String codigo = input.nextLine();

		System.out.println("Insira placa");
		String placa = input.nextLine();

		System.out.println("Digite o modelo");
		String modelo = input.nextLine();

		Veiculo v = new Carro(codigo, placa, modelo);

		veiculos.cadastrar(v);
	}

}
