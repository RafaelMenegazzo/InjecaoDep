package Main;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;


import BO.EnderecoBo;
import BO.UsuarioBo;
import BO.CachorroBo;
import BO.CanilBo;


import DTO.Endereco;
import DTO.Usuario;
import DTO.TipoUsuario;
import DTO.Cachorro;
import DTO.Pais;
import DTO.Canil;


public class main {
	public static void main(String[] args) {
		
		LocalDate DataNascimento = LocalDate.of(2000, 10, 25);
		Scanner entrada = new Scanner(System.in);
		EnderecoBo enderecoBO = new EnderecoBo();
		Usuario us = new Usuario();
		UsuarioBo usBO = new UsuarioBo();
		Pais pai = new Pais();
		Pais mae = new Pais();
		Cachorro dog = new Cachorro();
		Endereco end = new Endereco();
		
		
		CachorroBo dogBO = new CachorroBo();
		Canil canil = new Canil();
		CanilBo canilBO = new CanilBo();
		
		
		int menu = 0;
		int menu_interno = 0;
		int terminar = 0;
		boolean executado = false;
		
		System.out.println("############################");
		System.out.println("    BEM-VINDO AO SISTEMA    ");
		System.out.println("############################");
		
		do {
			
			System.out.println("############################");
			System.out.println("         1 - Inserir        ");
			System.out.println("         2 - Alterar        ");
			System.out.println("         3 - Excluir        ");
			System.out.println("############################");
			
			menu = entrada.nextInt();
			
			System.out.println("############################");
			System.out.println("         1 - Cachorro       ");
			System.out.println("         2 - Endereco       ");
			System.out.println("         3 - Usuario        ");
			System.out.println("  4 - Canil(alterar/excluir)");
			System.out.println("############################");
			
			
			menu_interno = entrada.nextInt();
			while(menu_interno < 1 || menu_interno > 4) {
				System.out.println("Digite novamente");
				menu = entrada.nextInt();
			}
			
			
			switch(menu) {
			
			
			case 1:
				
				
				if(menu_interno == 1) {
					entrada.nextLine();
					
					
				    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
				    
				    System.out.println("Digite o nome do cachorro: ");
				    dog.setNome(entrada.nextLine());
				
				    System.out.println("Digite o sexo: ");
				    dog.setSexo(entrada.nextLine());
				    
				    System.out.println("Digite a cor: ");
				    dog.setCor(entrada.nextLine());
				    
				    System.out.println("Digite o tipo de pelo: ");
				    dog.setTipo_pelo(entrada.nextLine());
				    
				    System.out.println("Digite a raça: ");
				    dog.setRaca(entrada.nextLine());
				    
				    System.out.println("Digite a data de nascimento (dd-MM-yyyy): ");
				    String dataNascimentoInput = entrada.nextLine();
				    LocalDate dataNascimento = LocalDate.parse(dataNascimentoInput, formatter); 
				    dog.setData_nascimento(dataNascimento);
				    
				    System.out.println("Digite o nome do pai: ");
				    pai.setNome(entrada.nextLine());
				    dog.setPai(pai);
				    
				    System.out.println("Digite o nome da mãe: ");
				    mae.setNome(entrada.nextLine());
				    dog.setMae(mae);
				    
				    System.out.println("Digite o nome do dono: ");
				    dog.setDono(entrada.nextLine());
				    
				    entrada.nextLine();
				    
				    System.out.println("Digite o peso: ");
				    dog.setPeso(entrada.nextDouble());
				    System.out.println("Digite o tamanho: ");
				    dog.setTamanho(entrada.nextDouble());
				    
				    
				    do {
				    	 System.out.println("Digite o chip(Valor Unico): ");
						    dog.setChip(entrada.nextInt());
						    
						    
						    if(dogBO.inserir(dog)) {
								System.out.println("sucesso");
								executado = true;
							} else {
								System.out.println("Se eu te falar, vc não acredita");
								executado = false;
							}
				    	
				    } while(executado != true);
					
					
				} else if(menu_interno == 2) {
					entrada.nextLine();
					
					System.out.println("Digite a rua");
					end.setRua(entrada.nextLine());
					System.out.println("Digite o bairro");
					end.setBairro(entrada.nextLine());
					System.out.println("Digite a Cidade");
					end.setCidade(entrada.nextLine());
					System.out.println("Digite o UF");
					end.setUf(entrada.nextLine());
					
					while(end.getUf().length() != 2) {
						System.out.println("Utilize apenas a sigla do estado EX: SC");
						end.setUf(entrada.nextLine());
					}
					
					entrada.nextLine();
					System.out.println("Digite o número");
					end.setNum(entrada.nextInt());
					
					if(enderecoBO.inserir(end)) {
						System.out.println("Endereço inserido com sucesso;");
					} else {
						System.out.println("Erro!");
					}
					
					System.out.println("Esse endereço é de um canil?");
					System.out.println("1 - sim | 2 - não");
					menu_interno = entrada.nextInt();
					
					if(menu_interno == 1) {
						entrada.nextLine();
						System.out.println("Nome Fantasia");
						canil.setNome_fantasia(entrada.nextLine());
						System.out.println("O CNPJ");
						canil.setCnpj(entrada.nextLine());
						System.out.println("O nome do Cachorro no canil");
						canil.setCachorro(entrada.nextLine());
						System.out.println("Digite o nome do proprietário");
						canil.setProprietario(entrada.nextLine());
						canil.setEndereco(end);
						
						if(canilBO.inserir(canil)) {
							System.out.println("Canil cadastrado com sucesso");
						} else {
							System.out.println("Erro!");
						}
						
					}
					
				} else if(menu_interno == 3) {
					
					entrada.nextLine();
					System.out.println("Informe o login");
					us.setLogin(entrada.nextLine());
					System.out.println("informe sua senha");
					us.setSenha(entrada.nextLine());
					
					entrada.nextLine();
					System.out.println("Qual é o tipo de usuário? 1 - ADMIN, 2 - CLIENTE, 3 - PROPRIETARIO");
					menu_interno = entrada.nextInt();
					TipoUsuario tp;
					
					if(menu_interno == 1) {
						tp = TipoUsuario.ADMIN;
						
					} else if(menu_interno == 2) {
						tp = TipoUsuario.ClIENTE;
						
					} else {
						tp = TipoUsuario.PROPRIETARIO;
					}
					us.setTipo_usuario(tp.ordinal());
					
					if(usBO.inserir(us)) {
						System.out.println("Usuario cadastradado com sucesso");
					} else {
						System.out.println("Erro!");
					}
					
					
				} 
				break;
				
			case 2:
				
				if(menu_interno == 1) {
					
					System.out.println(dogBO.PesquisarTodos());
					
					System.out.println("Digite o id do cachorro que queira alterar;");
					dog.setId_dog(entrada.nextInt());
					
					entrada.nextLine();
					
					
				    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
				    
				    System.out.println("Digite o nome do cachorro: ");
				    dog.setNome(entrada.nextLine());
				
				    System.out.println("Digite o sexo: ");
				    dog.setSexo(entrada.nextLine());
				    
				    System.out.println("Digite a cor: ");
				    dog.setCor(entrada.nextLine());
				    
				    System.out.println("Digite o tipo de pelo: ");
				    dog.setTipo_pelo(entrada.nextLine());
				    
				    System.out.println("Digite a raça: ");
				    dog.setRaca(entrada.nextLine());
				    
				    System.out.println("Digite a data de nascimento (dd-MM-yyyy): ");
				    String dataNascimentoInput = entrada.nextLine();
				    LocalDate dataNascimento = LocalDate.parse(dataNascimentoInput, formatter); 
				    dog.setData_nascimento(dataNascimento);
				    
				    System.out.println("Digite o nome do pai: ");
				    pai.setNome(entrada.nextLine());
				    dog.setPai(pai);
				    
				    System.out.println("Digite o nome da mãe: ");
				    mae.setNome(entrada.nextLine());
				    dog.setMae(mae);
				    
				    System.out.println("Digite o nome do dono: ");
				    dog.setDono(entrada.nextLine());
				 
				    
				    System.out.println("Digite o peso: ");
				    dog.setPeso(entrada.nextDouble());
				    System.out.println("Digite o tamanho: ");
				    dog.setTamanho(entrada.nextDouble());
				    
				    
				    do {
				    	 System.out.println("Digite o chip(Valor Unico): ");
						    dog.setChip(entrada.nextInt());
						    
						    
						    if(dogBO.alterar(dog)) {
								System.out.println("sucesso");
								executado = true;
							} else {
								System.out.println("Se eu te falar, vc não acredita");
								executado = false;
							}
				    	
				    } while(executado != true);
					
					
				} else if(menu_interno == 2) {
					System.out.println(enderecoBO.pesquisarTodos());
					System.out.println("Digite o id do endereco que queira alterar;");
					end.setCod(entrada.nextInt());
					
					entrada.nextLine();
					
					System.out.println("Digite a rua");
					end.setRua(entrada.nextLine());
					System.out.println("Digite o bairro");
					end.setBairro(entrada.nextLine());
					System.out.println("Digite a Cidade");
					end.setCidade(entrada.nextLine());
					System.out.println("Digite o UF");
					end.setUf(entrada.nextLine());
					
					while(end.getUf().length() != 2) {
						System.out.println("Utilize apenas a sigla do estado EX: SC");
						end.setUf(entrada.nextLine());
					}
					
					entrada.nextLine();
					System.out.println("Digite o número");
					end.setNum(entrada.nextInt());
					
					if(enderecoBO.alterar(end)) {
						System.out.println("Endereço alterado com sucesso;");
					} else {
						System.out.println("Erro!");
					}
					
				}else if(menu_interno == 3) {
					System.out.println(usBO.pesquisarTodos());
					System.out.println("Digite o id do usuario para alterar os dados");
					us.setId_usuario(entrada.nextInt());
					
					entrada.nextLine();
					System.out.println("Informe o login");
					us.setLogin(entrada.nextLine());
					System.out.println("informe sua senha");
					us.setSenha(entrada.nextLine());
					
					System.out.println("Qual é o tipo de usuário? 1 - ADMIN, 2 - CLIENTE, 3 - PROPRIETARIO");
					menu_interno = entrada.nextInt();
					TipoUsuario tp;
					
					if(menu_interno == 1) {
						tp = TipoUsuario.ADMIN;
						
					} else if(menu_interno == 2) {
						tp = TipoUsuario.ClIENTE;
						
					} else {
						tp = TipoUsuario.PROPRIETARIO;
					}
					us.setTipo_usuario(tp.ordinal());
					
					if(usBO.altera(us)) {
						System.out.println("Usuario alterado com sucesso");
					} else {
						System.out.println("Erro!");
					}
					
				} else {
					System.out.println(canilBO.pesquisarTodos());
					System.out.println("Digite o id do canil para alterar");
					canil.setId_canil(entrada.nextInt());
					
					entrada.nextLine();
					System.out.println("Nome Fantasia");
					canil.setNome_fantasia(entrada.nextLine());
					System.out.println("O CNPJ");
					canil.setCnpj(entrada.nextLine());
					System.out.println("O nome do Cachorro no canil");
					canil.setCachorro(entrada.nextLine());
					System.out.println("Digite o nome do proprietário");
					canil.setProprietario(entrada.nextLine());
					canil.setEndereco(end);
					
					if(canilBO.inserir(canil)) {
						System.out.println("Canil alterado com sucesso");
					} else {
						System.out.println("Erro!");
					}
					
					
					
				}
				
				
				break;
				
			case 3:
				
				if(menu_interno == 1 && us.getTipo_usuario() == 0) {
					System.out.println(dogBO.PesquisarTodos());
					
					System.out.println("Digite o id do cachorro que queira alterar;");
					dog.setId_dog(entrada.nextInt());
					
					if(dogBO.excluir(dog.getId_dog())) {
						System.out.println("sucesso");
			
					} else {
						System.out.println("Se eu te falar, vc não acredita");
						
					}
					
				} else if(menu_interno == 2 && us.getTipo_usuario() == 0) {
					
					System.out.println(enderecoBO.pesquisarTodos());
					System.out.println("Digite o id do endereco que queira alterar;");
					end.setCod(entrada.nextInt());
					

					if(enderecoBO.excluir(end.getCod())) {
						System.out.println("sucesso");
			
					} else {
						System.out.println("Se eu te falar, vc não acredita");
						
					}
					
					
				} else if(menu_interno == 3 && us.getTipo_usuario() == 0) {
					System.out.println(usBO.pesquisarTodos());
					System.out.println("Digite o id do usuario para alterar os dados");
					us.setId_usuario(entrada.nextInt());
					
					if(usBO.excluir(us.getId_usuario())) {
						System.out.println("sucesso");
			
					} else {
						System.out.println("Se eu te falar, vc não acredita");
						
					}
					
					
				} else if(menu_interno == 4 && us.getTipo_usuario() == 0) {
					
					System.out.println(canilBO.pesquisarTodos());
					System.out.println("Digite o id do canil para alterar");
					canil.setId_canil(entrada.nextInt());
					
					if(canilBO.excluir(canil.getId_canil())) {
						System.out.println("sucesso");
			
					} else {
						System.out.println("Se eu te falar, vc não acredita");
						
					}
					
				}
				
				break;

			default:
				System.out.println("Opções inválidas");
				
		}
			
			System.out.print("Deseja continuar? Sim = 0 | Não = -1 ");
			terminar = entrada.nextInt();
			
			
			
		} while(terminar == 0);
	}

}
