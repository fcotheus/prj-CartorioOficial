package Registros;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class RegistroNascimento extends RegistroClassePai{
	
	private String horaNascimento;
	private String CidadeRegistro;
	private String localNascimento;
	private String nomeAvoMascPaterno;
	private String nomeAvoFemPaterno;
	private String nomeAvoMascMaterno;
	private String nomeAvoFemMaterno;
	private String gemeos;
	private String nomeGemeo;
	private String matriculaGemea;
	private String numDecNascVivo;
	
	Scanner ler = new Scanner(System.in);
	Scanner lerInteiro = new Scanner(System.in);
	
	
	
	public String getHoraNascimento() {
		return horaNascimento;
	}




	public void setHoraNascimento(String horaNascimento) {
		this.horaNascimento = horaNascimento;
	}




	public String getCidadeRegistro() {
		return CidadeRegistro;
	}




	public void setCidadeRegistro(String cidadeRegistro) {
		CidadeRegistro = cidadeRegistro;
	}




	public String getLocalNascimento() {
		return localNascimento;
	}




	public void setLocalNascimento(String localNascimento) {
		this.localNascimento = localNascimento;
	}




	public String getNomeAvoMascPaterno() {
		return nomeAvoMascPaterno;
	}




	public void setNomeAvoMascPaterno(String nomeAvoMascPaterno) {
		this.nomeAvoMascPaterno = nomeAvoMascPaterno;
	}




	public String getNomeAvoFemPaterno() {
		return nomeAvoFemPaterno;
	}




	public void setNomeAvoFemPaterno(String nomeAvoFemPaterno) {
		this.nomeAvoFemPaterno = nomeAvoFemPaterno;
	}




	public String getNomeAvoMascMaterno() {
		return nomeAvoMascMaterno;
	}




	public void setNomeAvoMascMaterno(String nomeAvoMascMaterno) {
		this.nomeAvoMascMaterno = nomeAvoMascMaterno;
	}




	public String getNomeAvoFemMaterno() {
		return nomeAvoFemMaterno;
	}




	public void setNomeAvoFemMaterno(String nomeAvoFemMaterno) {
		this.nomeAvoFemMaterno = nomeAvoFemMaterno;
	}




	public String getGemeos() {
		return gemeos;
	}




	public void setGemeos(String gemeos) {
		this.gemeos = gemeos;
	}




	public String getNomeGemeo() {
		return nomeGemeo;
	}




	public void setNomeGemeo(String nomeGemeo) {
		this.nomeGemeo = nomeGemeo;
	}




	public String getMatriculaGemea() {
		return matriculaGemea;
	}




	public void setMatriculaGemea(String matriculaGemea) {
		this.matriculaGemea = matriculaGemea;
	}




	public String getNumDecNascVivo() {
		return numDecNascVivo;
	}




	public void setNumDecNascVivo(String numDecNascVivo) {
		this.numDecNascVivo = numDecNascVivo;
	}



//Registro de Nascimento
	public void DadosRegistroNascimento(){ 
		
		RegistroNascimento dadosNasc = new RegistroNascimento();
		RegistroClassePai chamaRegistro = new RegistroClassePai();
		
		System.out.println("\n***************REGISTRO DE NASCIMENTO***************\n");
		
	     System.out.println("Nome:");
	     dadosNasc.setNome(ler.nextLine());
	     
	     System.out.println("Matricula:");
	     dadosNasc.setMatricula(ler.nextLine());
	     
	     System.out.println("Numero do livro:");
	     dadosNasc.setLivro(ler.nextLine());
	     	     
	     System.out.println("Numero da Folha:");
	     dadosNasc.setFolha(ler.nextLine());
	     
	     System.out.println("Termo");
	     dadosNasc.setTermo(ler.nextLine());
	     
	     System.out.println("Data do Nascimento:");
	     dadosNasc.setDataNacExtenso(lerInteiro.nextLine());
	     
		 System.out.print("HoraNascimento: ");
		 dadosNasc.setHoraNascimento(ler.nextLine());
		
	     System.out.println("Cidade de Nascimento");
	     dadosNasc.setCidade(ler.nextLine());
		
         System.out.print("Estado: ");
		 dadosNasc.setEstado(ler.nextLine());
		
	    System.out.print("LocalNascimento: ");
		dadosNasc.setLocalNascimento(ler.nextLine());
		
		System.out.println("Sexo:");
		dadosNasc.setSexo(ler.nextLine());
		
		System.out.println("Pai");
		dadosNasc.setNomepai(ler.nextLine());
		
		System.out.println("Mãe");
		dadosNasc.setNomeMae(ler.nextLine());
		
		System.out.print("NomeAvoMascPaterno: ");
		dadosNasc.setNomeAvoMascPaterno(ler.nextLine());
		
		System.out.print("NomeAvoFemPaterno: ");
		dadosNasc.setNomeAvoFemPaterno(ler.nextLine());
		
		System.out.print("NomeAvoMascMaterno: ");
		dadosNasc.setNomeAvoMascMaterno(ler.nextLine());
		
		System.out.print("NomeAvoFemMaterno: ");
		dadosNasc.setNomeAvoFemMaterno(ler.nextLine());
		
		System.out.println("Gemeos");
		dadosNasc.setGemeos(ler.nextLine());
		
		System.out.print("NomeGemeo: ");
		dadosNasc.setNomeGemeo(ler.nextLine());
		
	    System.out.print("MatriculaGemea: ");
		dadosNasc.setMatriculaGemea(ler.nextLine());
		
		System.out.println("Data do Registro");
		dadosNasc.setDataRegistroExtenso(ler.nextLine());
				
		System.out.print("NumDecNascVivo: ");
		dadosNasc.setNumDecNascVivo(ler.nextLine());
		
		System.out.print("Oberservação: ");
		dadosNasc.setObservacoes(ler.nextLine());
		
        System.out.print("CidadeRegistro: ");
		dadosNasc.setCidadeRegistro(ler.nextLine());
		
		System.out.print("Data do Registro: ");
		dadosNasc.setDataRegistroExtenso(ler.nextLine());
		
	}
}
