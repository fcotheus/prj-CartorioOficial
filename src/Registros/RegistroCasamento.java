package Registros;

import java.util.Scanner;

public class RegistroCasamento extends RegistroClassePai {
	
	private String nomeNoivo;
	private String nomeNoiva;
	private String empregNoivo;
	private String empregNoiva;
	private String dataRegCasamentoInteiro;
	private String regimeBensCasamento;
	private String novoNomeNoivo;
	private String novoNomeNoiva;
	
	Scanner ler = new Scanner(System.in);
	Scanner lerInteiro = new Scanner(System.in);
	
	public String getNomeNoivo() {
		return nomeNoivo;
	}


	public void setNomeNoivo(String nomeNoivo) {
		this.nomeNoivo = nomeNoivo;
	}


	public String getNomeNoiva() {
		return nomeNoiva;
	}


	public void setNomeNoiva(String nomeNoiva) {
		this.nomeNoiva = nomeNoiva;
	}


	public String getEmpregNoivo() {
		return empregNoivo;
	}


	public void setEmpregNoivo(String empregNoivo) {
		this.empregNoivo = empregNoivo;
	}


	public String getEmpregNoiva() {
		return empregNoiva;
	}


	public void setEmpregNoiva(String empregNoiva) {
		this.empregNoiva = empregNoiva;
	}


	public String getDataRegCasamentoInteiro() {
		return dataRegCasamentoInteiro;
	}


	public void setDataRegCasamentoInteiro(String dataRegCasamentoInteiro) {
		this.dataRegCasamentoInteiro = dataRegCasamentoInteiro;
	}


	public String getRegimeBensCasamento() {
		return regimeBensCasamento;
	}


	public void setRegimeBensCasamento(String regimeBensCasamento) {
		this.regimeBensCasamento = regimeBensCasamento;
	}


	public String getNovoNomeNoivo() {
		return novoNomeNoivo;
	}


	public void setNovoNomeNoivo(String novoNomeNoivo) {
		this.novoNomeNoivo = novoNomeNoivo;
	}


	public String getNovoNomeNoiva() {
		return novoNomeNoiva;
	}


	public void setNovoNomeNoiva(String novoNomeNoiva) {
		this.novoNomeNoiva = novoNomeNoiva;
	}


	public void DadosRegistroCasamento(){
		
	
	

		
		RegistroCasamento dadosCasamento = new RegistroCasamento();
		RegistroClassePai chamaRegistro = new RegistroClassePai();
		
		System.out.println("\n***************REGISTRO DE OBITO***************\n");

	     System.out.println("Nome do noivo:");
	     dadosCasamento.setNomeNoivo(ler.nextLine());
	     
	     System.out.println("Nome da noiva:");
	     dadosCasamento.setNomeNoiva(ler.nextLine());
	     
	     
	     System.out.println("Matricula:");
	     dadosCasamento.setMatricula(ler.nextLine());
	     
	     System.out.println("Numero do livro:");
	     dadosCasamento.setLivro(ler.nextLine());
	     	     
	     System.out.println("Numero da Folha:");
	     dadosCasamento.setFolha(ler.nextLine());
	     
	     System.out.println("Termo");
	     dadosCasamento.setTermo(ler.nextLine());
	     
	     System.out.print("Estado Civil: ");
	     dadosCasamento.setEstadoCivil(ler.nextLine());
	     
	     System.out.println("Emprego Noiva:");
	     dadosCasamento.setEmpregNoiva(ler.nextLine());
	     
	     System.out.println("emprego Noivo:");
	     dadosCasamento.setEmpregNoivo(ler.nextLine());
	     
	     System.out.println("Cidade de Nascimento");
	     dadosCasamento.setCidade(ler.nextLine());
	     
	     System.out.print("Estado: ");
	     dadosCasamento.setEstado(ler.nextLine());
	     
	     System.out.println("Data do Nascimento:");
	     dadosCasamento.setDataNacExtenso(lerInteiro.nextLine());
	     
	     System.out.println("Pai");
	     dadosCasamento.setNomepai(ler.nextLine());
			
		 System.out.println("Mãe");
		 dadosCasamento.setNomeMae(ler.nextLine());
	     
		 System.out.print("Data do Registro: ");
		 dadosCasamento.setDataRegistroExtenso(ler.nextLine());
		 
		 System.out.println("Data:");
		 dadosCasamento.setDataRegCasamentoInteiro(lerInteiro.nextLine());
		 
		 System.out.println("Regime de Bens:");
		 dadosCasamento.setRegimeBensCasamento(ler.nextLine());
		 
		 System.out.println("Novo nome do noivo:");
		 dadosCasamento.setNovoNomeNoivo(ler.nextLine());
		 
		 System.out.println("Novo nome da noiva:");
		 dadosCasamento.setNovoNomeNoiva(ler.nextLine());
		 
		 System.out.print("Oberservação: ");
		 dadosCasamento.setObservacoes(ler.nextLine());
			
	     System.out.print("CidadeRegistro: ");
	     dadosCasamento.setCidadeRegistro(ler.nextLine());
			
		 System.out.print("Data do Registro: ");
		 dadosCasamento.setDataRegistroExtenso(ler.nextLine());
}
}
