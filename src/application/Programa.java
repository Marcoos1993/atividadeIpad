package application;

import entities.Celular;

public class Programa {

	public static void main(String[] args) {
		
		Celular celular = new Celular();
		
		celular.tocar();
		celular.pausar();
		celular.selecionarMusica();
		
		celular.ligar();
		celular.atender();
		celular.iniciarCorreioDeVoz();
		
		celular.exibirPagina();
		celular.adicionarNovaAba();
		celular.atualizarPagina();
	}

}
