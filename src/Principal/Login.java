package Principal;

import java.util.Scanner;

public class Login {
	
	private String usuario;
	private String senha;
	
	//Métodos Getters e Setters 
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	//Metodo Login e Verificação 
	public void validacaoLogin(String usuario,String senha){
			
		Login login = new Login();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("**********CAMPO DE LOGIN**********\n");
		
		System.out.print("Usuário: ");
		login.setUsuario(ler.nextLine());
			
		System.out.print("Senha: ");
		login.setSenha(ler.nextLine());
			
		if((login.getUsuario().equals("admin")) && (login.getSenha().equals("123"))){
			
			Menu listaMenu = new Menu();
			listaMenu.listaMenu();
			
			
		}else{
			
			System.out.print("\nUsuário e/ou Senha incorretos.");
		}
	}//fim validação login
	
}//fim da classe login


