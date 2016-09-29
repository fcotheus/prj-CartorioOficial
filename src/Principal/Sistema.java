package Principal;

import java.io.IOException;
import java.util.Scanner;

import CadastroDados.Cartorio;
import CadastroDados.JuizCasamento;
import CadastroDados.Tabeliao;


public class Sistema {
	
	private int menu;
	private Cartorio cartorio;
	private Tabeliao tabelioes[];

	
	Scanner ler = new Scanner(System.in);

	public int getMenu() {
		return menu;
	}

	public void setMenu(int menu) {
		this.menu = menu;
	}
	
	public Sistema(int numElementos){
		//l� do arquivo para o objeto cart�rio
		cartorio = new Cartorio();
		tabelioes = new Tabeliao[numElementos];
		//l� do arquivo para o vetor de tabeli�es
	}
	
	
	//insere um dado no tabeli�o
	public boolean inserir(Tabeliao t){
		for(int i = 0; i < tabelioes.length; i++)
			if(tabelioes[i] == null){
				tabelioes[i] = t;
				return true;
			}
			return false;
	}
	
	//Remove um dado do tabeliao
		public boolean remover(){
			for(int i = tabelioes.length-1; i >=0; i--)
				if(pesquisar(i) != null)
					if(tabelioes[i] != null){
						tabelioes[i] = null;
						return true;
					}
					return false;	
		}
		
		//atualiza um dado
		public boolean atualizar(Tabeliao t){
			if(pesquisar(t) == true){ //pessoa existe no vetor
				for(int i = 0; i < tabelioes.length; i++)
					if(pesquisar(i).equals(t)){
						tabelioes[i] = t;
						return true;
					}
				return false;
			}else
				return false;
		}
		
		//Pesquisa se o objeto p existe ou n�o no vetor
		public boolean pesquisar(Tabeliao t){
			for(int i = 0; i < tabelioes.length; i++)
				if(tabelioes[i].equals(t)){
					return true;
				}	
				return false;
		}
		
		//Retorna o dado que estiver no �ndice passado por parametro.
		public Tabeliao pesquisar(int indice){
			return tabelioes[indice];
		}
	
		
	
	//===============================MENU PRINCIPAL============================================
	public void listaMenu() throws IOException{
		
		System.out.println("\n***************MENU***************\n");
		
		System.out.println("[1] -> Pesquisar.");
		System.out.println("[2] -> Cadastrar Dados do Cart�rio.");
		System.out.println("[3] -> Cadastrar Tabeli�es.");
		System.out.println("[4] -> Cadastrar Juiz de Casamentos.");
		System.out.println("[5] -> Abertura de Firma.");
		System.out.println("[6] -> Emitir Registro de Nascimento.");
		System.out.println("[7] -> Emitir Registro de Casamento.");
		System.out.println("[8] -> Emitir Registro de Div�rcio.");
		System.out.println("[9] -> Emitir Registro de �bito.");
		System.out.println("[0] -> Sair do Programa.");

		System.out.print("\nO que deseja fazer? -> "); 
		menu = ler.nextInt();
		
		switch(menu){
			
		case 1:{
			System.out.println("Por enquanto ainda n�o faz nada.");
		} break;
		
		case 2:{
			menuDadosCartorio();
		}break;
		
		case 3:{
			menuDadosTabeliao();
			
		} break;
		
		case 4:{
			menuDadosJuizCasamento();
		} break;
		
		case 5:{
			//menuDadosAberturaFirma();
			//AberturaFirma aberturaFirma = new AberturaFirma();
		} break;
		
		case 6:{
			//menuDadosRegistroNascimento();
			//RegistroNascimento registroNascimento = new RegistroNascimento();
		} break;
		
		case 7:{
			//menuDadosRegistroCasamento();
			//RegistroCasamento registroCasamento = new RegistroCasamento();
		} break;
		
		case 8:{
			//menuDadosRegistroDivorcio();
			//RegistroDivorcio registroDivorcio = new RegistroDivorcio();
		} break;
		
		case 9:{
			//menuDadosRegistroObito();
			//RegistroObito registroObito = new RegistroObito();
		} break;
		
		case 0:{
			System.out.println("Obrigado por usar nosso sistema.");
		} break;
		
		default:{
			System.out.println("Erro!");
		}
		
		}//fim switch
		
	}//fim m�todo listaMenu (menu principal)
	
	
	//===============================MENU CART�RIO============================================
	public void menuDadosCartorio() throws IOException{
		
		System.out.println("\n***************MENU DADOS DO CART�RIO***************\n");
		
		System.out.println("[1] -> Cadastrar Dados do Cart�rio");
		System.out.println("[2] -> Editar Dados do Cart�rio");
		System.out.println("[3] -> Excluir Dados do Cart�rio");
		System.out.println("[0] -> Sair do Programa.");

		System.out.print("\nO que deseja fazer? -> "); 
		menu = ler.nextInt();
		
		switch(menu){
			
		case 1:{
			
			//Cartorio dados = new Cartorio();			
			cartorio.DadosCartorio();
		
		} break;
		
		case 2:{
					}break;
		
		case 3:{
			//Editar Dados do Cart�rio
		}break;

		
		case 0:{
			System.out.println("Obrigado por usar nosso Sistema.");
		}break;
		
		default:{
			System.out.println("Erro!");
		}
		
		}//fim switch
		
		
	}//fim do menu Dados do Cart�rio
	
	//===============================MENU TABELI�O============================================
	public void menuDadosTabeliao() throws IOException{
		
		System.out.println("\n***************MENU DADOS DO TABELI�O***************\n");
		
		System.out.println("[1] -> Pesquisar.");
		System.out.println("[2] -> Cadastrar Dados do Tabeli�o");
		System.out.println("[3] -> Editar Dados do Tabeli�o");
		System.out.println("[4] -> Excluir Dados do Tabeli�o");
		System.out.println("[0] -> Sair do Programa.");

		System.out.print("\nO que deseja fazer? -> "); 
		menu = ler.nextInt();
		
		switch(menu){
			
		case 1:{
			
			System.out.println("Por enquanto ainda n�o faz nada.");
		
		} break;
		
		case 2:{
			Tabeliao dados = new Tabeliao();
			dados.DadosTabeliao();
			tabelioes[0] = dados; 
			
			
			
		}break;////
		
		case 3:{
			//Editar Dados do Tabeliao
		}break;
		
		case 4:{
			//Excluir Dados do Tabeliao
		}break;
		
		case 0:{
			System.out.println("Obrigado por usar nosso Sistema.");
		}break;
		
		default:{
			System.out.println("Erro!");
		}
		
		}//fim switch
		
		
	}//fim do menu Dados do Tabeliao
	
	
	
	//===============================MENU JUIZ CASAMENTO============================================
	public void menuDadosJuizCasamento(){
		
		System.out.println("\n***************MENU DADOS DO JUIZ DE CASAMENTO***************\n");
		
		System.out.println("[1] -> Pesquisar.");
		System.out.println("[2] -> Cadastrar Dados do Juiz de Casamento");
		System.out.println("[3] -> Editar Dados do Juiz de Casamento");
		System.out.println("[4] -> Excluir Dados do Juiz de Casamento");
		System.out.println("[0] -> Sair do Programa.");

		System.out.print("\nO que deseja fazer? -> "); 
		menu = ler.nextInt();
		
		switch(menu){
			
		case 1:{
			
			System.out.println("Por enquanto ainda n�o faz nada.");
		
		} break;
		
		case 2:{
			JuizCasamento dados = new JuizCasamento();
			dados.DadosJuizCasamento();
			
		}break;
		
		case 3:{
			//Editar Dados do Juiz Casamento
		}break;
		
		case 4:{
			//Excluir Dados do Juiz Casamento
		}break;
		
		case 0:{
			System.out.println("Obrigado por usar nosso Sistema.");
		}break;
		
		default:{
			System.out.println("Erro!");
		}
		
		}//fim switch
		
		
	}//fim do menu Dados do Tabeliao

}
