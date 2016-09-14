package CadastroDados;
import java.util.Scanner;

public class DadosCartorio extends Pessoa {
	
	Scanner ler = new Scanner(System.in);
	
	private String cnpj;
	private String cnsServentia;
	private String titularCartorio;
	
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getCnsServentia() {
		return cnsServentia;
	}
	public void setCnsServentia(String cnsServentia) {
		this.cnsServentia = cnsServentia;
	}
	public String getTitularCartorio() {
		return titularCartorio;
	}
	public void setTitularCartorio(String titularCartorio) {
		this.titularCartorio = titularCartorio;
	}
	
	public void DadosCartorio(){
		
		DadosCartorio dados = new DadosCartorio();
		
		System.out.println("\n***************DADOS DO CARTÓRIO***************\n");
		
		System.out.print("Nome do Cartório: ");
		dados.setNome(ler.nextLine());
		
		System.out.print("Endereço: ");
		dados.setEndereco(ler.nextLine());
		
		System.out.print("Número: ");
		dados.setNumero(ler.nextInt());
		
		System.out.print("Complemento: ");
		dados.setComplemento(ler.nextLine());
		
		System.out.print("Bairro: ");
		dados.setBairro(ler.nextLine());
		
		System.out.print("Cidade: ");
		dados.setCidade(ler.nextLine());
		
		System.out.print("Estado: ");
		dados.setEstado(ler.nextLine());
		
		System.out.print("Telefone fixo: ");
		dados.setTelefoneFixo(ler.nextLine());
		
		System.out.print("E-mail: ");
		dados.setEmail(ler.nextLine());
		
		System.out.print("CEP: ");
		dados.setCep(ler.nextLine());
		
		System.out.print("Comarca: ");
		dados.setComarca(ler.nextLine());
		
		System.out.print("Distrito: ");
		dados.setDistrito(ler.nextLine());
		
		System.out.print("CNPJ: ");
		dados.setCnpj(ler.nextLine());
		
		System.out.print("CNS Serventia: ");
		dados.setCnsServentia(ler.nextLine());
		
		System.out.print("Titular do Cartório: ");
		dados.setTitularCartorio(ler.nextLine());
	
		
	}
	
	
	
	

}
