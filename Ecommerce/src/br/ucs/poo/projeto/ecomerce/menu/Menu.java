package br.ucs.poo.projeto.ecomerce.menu;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Menu m = new Menu();
		
		m.menuInicial(sc);
		
		sc.close();
	}
	
	public void menuInicial(Scanner sc) {
		int inputLogin;
		
		do {
			System.out.println("__          __  _");
			System.out.println("\\ \\        / / | |");
			System.out.println(" \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___");
			System.out.println("  \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\");
			System.out.println("   \\  /\\  /  __/ | (_| (_) | | | | | |  __/");
			System.out.println("    \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|");
			System.out.println();
			System.out.println("Em desenvolvimento");
			System.out.println("1) Fazer login como Administrador");
			System.out.println("0) Sair");
			System.out.println();
			System.out.println("Digite a opção desejada");
			inputLogin = sc.nextInt();
			sc.nextLine();
				    
			switch(inputLogin) {
				case 0:
					System.out.println("Saindo");
					sc.nextLine();
					System.exit(0);
				case 1:
					this.loginAdmin(sc);				
					break;
				default:
	         		System.out.println("Opção inválida!");
			}
		} while(inputLogin > 0);
	}
	
	public void loginAdmin(Scanner sc) {
		int input = 1;
		
		while(input == 1) {
			System.out.println("Digite a senha");
			String adminPassword = sc.nextLine();
			if(adminPassword.equals("Admin")) {
				System.out.println("Login efetuado com sucesso");
				this.admin(sc);
			} else {
				System.out.println("Senha inválida");
				System.out.println("Gostaria de tentar denovo");
				System.out.println("1) Sim");
				System.out.println("2) Não");
				input = sc.nextInt();
				sc.nextLine();
			}
		}
		
		this.menuInicial(sc);
	}
	
	public void admin(Scanner sc) {
        int inputAdmin;
        
        do {
        	System.out.println("             _           _       ");
            System.out.println("    /\\      | |         (_)      ");
            System.out.println("   /  \\   __| |_ __ ___  _ _ __  ");
            System.out.println("  / /\\ \\ / _` | '_ ` _ \\| | '_ \\ ");
            System.out.println(" / ____ \\ (_| | | | | | | | | | |");
            System.out.println("/_/    \\_\\__,_|_| |_| |_|_|_| |_|");
            System.out.println();
            System.out.println("1) Cadastro de Fornecedor");
            System.out.println("2) Cadastro de Produto");
            System.out.println("3) Manutenção do estoque de Produtos");
            System.out.println("0) Sair");
            inputAdmin = sc.nextInt();
            sc.nextLine();
            
            switch(inputAdmin) {
            	case 0:
            		this.menuInicial(sc);
            		break;
            	case 1:
            		this.cadastroFornecedor(sc);
            		break;
            	case 2:
            		this.cadastroPorduto(sc);
            		break;
            	case 3:
            		break;
            	default:
	         		System.out.println("Opção inválida!");
            }
        } while(inputAdmin > 0);
	}
	
	public void cadastroFornecedor(Scanner sc) {
		int input;
		do {
			System.out.println("-----------------------------------");
			System.out.println("-1)     Adicionar fornecedor      -");
			System.out.println("-2)     Editar fornecedor         -");
			System.out.println("-3)     Excluir fornecedor        -");
			System.out.println("-0)     Voltar                    -");
			System.out.println("-----------------------------------");
			input = sc.nextInt();
			sc.nextLine();
			switch(input) {
				case 0:
					this.admin(sc);
					break;
				case 1:
					this.cadastroFornecedor(sc);
					break;
				case 2:
					this.cadastroFornecedor(sc);
					break;
				case 3:
					this.cadastroFornecedor(sc);
					break;
				default:
	         		System.out.println("Opção inválida!");
			}
		} while(input > 0);
	}
	
	public void cadastroPorduto(Scanner sc) {
		int input;
		do {
			System.out.println("-----------------------------------");
			System.out.println("-1)     Adicionar produto         -");
			System.out.println("-2)     Editar produto            -");
			System.out.println("-3)     Excluir produto           -");
			System.out.println("-4)     Consultar produto         -");
			System.out.println("-0)     Voltar                    -");
			System.out.println("-----------------------------------");
			input = sc.nextInt();
			sc.nextLine();
			switch(input) {
				case 0:
					this.admin(sc);
					break;
				case 1:
					this.cadastroPorduto(sc);
					break;
				case 2:
					this.cadastroPorduto(sc);
					break;
				case 3:
					this.cadastroPorduto(sc);
					break;
				case 4:
					this.cadastroPorduto(sc);
					break;
				default:
	         		System.out.println("Opção inválida!");
			}
		} while(input > 0);
	}
}
