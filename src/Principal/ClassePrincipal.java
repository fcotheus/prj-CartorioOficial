//eae to testando agora com o fork
package Principal;

import java.util.Scanner;

public class ClassePrincipal {
	
	public static void main(String args[]){
		
		Scanner ler = new Scanner(System.in);
		Login login = new Login();
		
		//Chama o metodo Validação Login
		login.validacaoLogin(null, null);

	}
}
