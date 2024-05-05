package entities;

public class Celular implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet{
	
	

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo pagina");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atalizando Pagina");
		
	}

	@Override
	public void ligar() {
		System.out.println("Fazendo ligacao");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo telefone");
		
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Iniciando correio de voz");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando musica");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando musica");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando musica");
		
	}

}
