package Registros;

import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class RegistroObito extends RegistroClassePai {
	
	private String cor;
	private String tituloEleitor;
	private String rua;
	private String dataFalecimentoExtenso;
	private String dataFalecimentoInteiro;
	private String horaFalecimentoExtenso;
	private String localFalecimento;
	private String causaMorte;
	private String sepultamento;
	private String cemiterio;
	private String declarante;
	private String nomeMedico;
	private String crmMedico;
	
	Scanner ler = new Scanner(System.in);
	Scanner lerInteiro = new Scanner(System.in);
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
		
	public String getTituloEleitor() {
		return tituloEleitor;
	}
	public void setTituloEleitor(String tituloEleitor) {
		this.tituloEleitor = tituloEleitor;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getDataFalecimentoExtenso() {
		return dataFalecimentoExtenso;
	}
	public void setDataFalecimentoExtenso(String dataFalecimentoExtenso) {
		this.dataFalecimentoExtenso = dataFalecimentoExtenso;
	}
	public String getDataFalecimentoInteiro() {
		return dataFalecimentoInteiro;
	}
	public void setDataFalecimentoInteiro(String dataFalecimentoInteiro) {
		this.dataFalecimentoInteiro = dataFalecimentoInteiro;
	}
	public String getHoraFalecimentoExtenso() {
		return horaFalecimentoExtenso;
	}
	public void setHoraFalecimentoExtenso(String horaFalecimentoExtenso) {
		this.horaFalecimentoExtenso = horaFalecimentoExtenso;
	}
	public String getLocalFalecimento() {
		return localFalecimento;
	}
	public void setLocalFalecimento(String localFalecimento) {
		this.localFalecimento = localFalecimento;
	}
	public String getCausaMorte() {
		return causaMorte;
	}
	public void setCausaMorte(String causaMorte) {
		this.causaMorte = causaMorte;
	}
	public String getSepultamento() {
		return sepultamento;
	}
	public void setSepultamento(String sepultamento) {
		this.sepultamento = sepultamento;
	}
	public String getCemiterio() {
		return cemiterio;
	}
	public void setCemiterio(String cemiterio) {
		this.cemiterio = cemiterio;
	}
	public String getDeclarante() {
		return declarante;
	}
	public void setDeclarante(String declarante) {
		this.declarante = declarante;
	}
	public String getNomeMedico() {
		return nomeMedico;
	}
	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}
	public String getCrmMedico() {
		return crmMedico;
	}
	public void setCrmMedico(String crmMedico) {
		this.crmMedico = crmMedico;
	}
	
	//Registro de Obito
		public void DadosRegistroObito(){ 
			
			RegistroObito dadosObito = new RegistroObito();
			RegistroClassePai chamaRegistro = new RegistroClassePai();
			
			System.out.println("\n***************REGISTRO DE OBITO***************\n");

		     System.out.println("Nome:");
		     dadosObito.setNome(ler.nextLine());
		     
		     System.out.println("Matricula:");
		     dadosObito.setMatricula(ler.nextLine());
		     
		     System.out.println("Numero do livro:");
		     dadosObito.setLivro(ler.nextLine());
		     	     
		     System.out.println("Numero da Folha:");
		     dadosObito.setFolha(ler.nextLine());
		     
		     System.out.println("Termo");
		     dadosObito.setTermo(ler.nextLine());	
		     
		     System.out.println("Cor");
		     dadosObito.setCor(ler.nextLine());
		    
	         System.out.print("Estado Civil: ");
	         dadosObito.setEstadoCivil(ler.nextLine());
	         
	         System.out.println("Naturalidade");
	         dadosObito.setNaturalidade(ler.nextLine());
	         
	         System.out.println("RG");
	         dadosObito.setRg(ler.nextLine());
	         
	         System.out.println("Titulo de Eleitor");
	         dadosObito.setTituloEleitor(ler.nextLine());
	         
	 	     System.out.println("Pai");
	 		 dadosObito.setNomepai(ler.nextLine());
			
		 	 System.out.println("Mãe");
			 dadosObito.setNomeMae(ler.nextLine());
			
	         System.out.println("Rua");
	         dadosObito.setRua(ler.nextLine());
	         
	         System.out.println("Cidade");
	         dadosObito.setCidade(ler.nextLine());
	         
	         System.out.print("Estado: ");
	         dadosObito.setEstado(ler.nextLine());
	         
	         System.out.println("Data do Falecimento:");
	         dadosObito.setDataFalecimentoExtenso(ler.nextLine());
	         
	         System.out.println("Hora do Falecimento:");
	         dadosObito.setHoraFalecimentoExtenso(ler.nextLine());
	         
	         System.out.println("Data do Falecimento:");
	         dadosObito.setDataFalecimentoInteiro(lerInteiro.nextLine());
	         
	         System.out.println("Local de Falecimento:");
	         dadosObito.setLocalFalecimento(ler.nextLine());
	         
	         System.out.println("Causa da Morte:");
	         dadosObito.setCausaMorte(ler.nextLine());
	         
	         System.out.println("Seputamento ou Cremação:");
	         dadosObito.setSepultamento(ler.nextLine());
	         
	         System.out.println("Cemiteiro:");
	         dadosObito.setCemiterio(ler.nextLine());
	         
	         System.out.println("Declerante:");
	         dadosObito.setDeclarante(ler.nextLine());
	         
	         System.out.println("Nome do Medico:");
	         dadosObito.setNomeMedico(ler.nextLine());
	         
	         System.out.println("CRM do Medico:");
	         dadosObito.setCrmMedico(ler.nextLine());
	         
	 		 System.out.print("Oberservação: ");
	 		 dadosObito.setObservacoes(ler.nextLine());
			
	         System.out.print("CidadeRegistro: ");
	         dadosObito.setCidadeRegistro(ler.nextLine());
			
			 System.out.print("Data do Registro: ");
			 dadosObito.setDataRegistroExtenso(ler.nextLine());
	         
	         
	         
	         

}
}
