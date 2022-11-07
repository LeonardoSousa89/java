package app.system;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import app.system.entities.Cliente;
import app.system.error.PersonalException;
import app.system.loja.Produtos;
import app.system.loja.estoque.Mercadorias;

public class Principal {

	public static void main(String[] args) {
		
		/*	
		 * apoio
		 * 	
		 * ctrl + shift + l
		 * ctrl + shift + f11
		 * ctrl + shift + f
		 * ctrl + page down 
		 * ctrl + page up
		 * ctrl + m
		 * ctrl + o
		 * ctrl + 3 depois digite a palavra RUN     ou    alt + shift + x e depois j
		 * 
		 */
		
		int chave = 1234;
		long resp = 1;
		int categoria = 0;
		int subcategoria = 00;
		Scanner input = new Scanner(System.in);

		Set<Cliente> cli = new HashSet<>();
		Set<Produtos> prodt = new HashSet<>();
		Set<Double> tot = new HashSet<>();

		try {

			System.out.println("sistema");
			System.out.println();

			System.out.println("insira a chave de permissão:");
			int novaChave = input.nextInt();
			if (novaChave != chave) {
				while (novaChave != chave) {

					System.out.println();
					System.out.println("permissão negada!");
					System.out.println("insira uma chave válida!");

					System.out.println();

					System.out.println("insira a chave de permissão:");
					novaChave = input.nextInt();
				}
			}

			System.out.println("nome:");
			String nome = input.next();

			System.out.println("telefone:");
			String telefone = input.next();

			System.out.println("cep:");
			String cep = input.next();

			cli.add(new Cliente(nome, telefone, cep));

			System.out.println();
			System.out.println("Loja");
			System.out.println();
			System.out.println("escolha uma categoria:");
			categoria = input.nextInt();

			switch (categoria) {
			case 1:

				System.out.println("categoria: higiene");
				System.out.println();

				System.out.println("=============================================");
				System.out.println("|                                |			|");
				System.out.println("|   1 - sabonete 50g 			 |  3,65R$  |");
				System.out.println("|   2 - shampoo 90g  			 |  17,68   |");
				System.out.println("|   3 - papel higiênico novo     |  1,09R$  |");
				System.out.println("|                                     		|");
				System.out.println("=============================================");

				System.out.println();
				System.out.println("escolha uma subcategoria:");
				subcategoria = input.nextInt();
							switch (subcategoria) {
							case 1:
			
								Mercadorias hig = new Mercadorias();
								Produtos prod = new Produtos();
			
								prod.setItem(hig.getItem1());
								prod.setCodigo(12502);
								prod.setPreco(3.65);
								System.out.println("insira a quantidade:");
								int qtde = input.nextInt();
								prod.setQtde(qtde);
								
								prodt.add(prod);
								tot.add(prod.total(qtde, 3.65));
								break;
			
							case 2:
			
								hig = new Mercadorias();
								prod = new Produtos();
			
								prod.setItem(hig.getItem2());
								prod.setCodigo(12014);
								prod.setPreco(17.68);
								System.out.println("insira a quantidade:");
								qtde = input.nextInt();
								prod.setQtde(qtde);
			
								prodt.add(prod);
								tot.add(prod.total(qtde, 17.68));
			
								break;
			
							case 3:
			
								hig = new Mercadorias();
								prod = new Produtos();
			
								prod.setItem(hig.getItem3());
								prod.setCodigo(19984);
								prod.setPreco(1.09);
								System.out.println("insira a quantidade:");
								qtde = input.nextInt();
								prod.setQtde(qtde);
			
								prodt.add(prod);
								tot.add(prod.total(qtde, 1.09));
			
								break;
			
							default:
								break;
							}

				System.out.println("continuar comprando? (1/0):");
				System.out.println("escolha 1 para sim");
				System.out.println("escolha 0 para não");
				long resposta = input.nextLong();
				while (resposta == resp) {

					System.out.println("categoria: higiene");
					System.out.println();

					System.out.println("=============================================");
					System.out.println("|                                |			|");
					System.out.println("|   1 - sabonete 50g 			 |  3,65R$  |");
					System.out.println("|   2 - shampoo 90g  			 |  17,68   |");
					System.out.println("|   3 - papel higiênico novo     |  1,09R$  |");
					System.out.println("|                                     		|");
					System.out.println("=============================================");

					System.out.println();
					System.out.println("escolha uma subcategoria:");
					subcategoria = input.nextInt();
							switch (subcategoria) {
							case 1:
		
								Mercadorias hig = new Mercadorias();
								Produtos prod = new Produtos();
		
								prod.setItem(hig.getItem1());
								prod.setCodigo(12502);
								prod.setPreco(3.65);
								System.out.println("insira a quantidade:");
								int qtde = input.nextInt();
								prod.setQtde(qtde);
								prodt.add(prod);
								tot.add(prod.total(qtde, 3.65));
		
								break;
		
							case 2:
		
								hig = new Mercadorias();
								prod = new Produtos();
		
								prod.setItem(hig.getItem2());
								prod.setCodigo(12014);
								prod.setPreco(17.68);
								System.out.println("insira a quantidade:");
								qtde = input.nextInt();
								prod.setQtde(qtde);
		
								prodt.add(prod);
								tot.add(prod.total(qtde, 17.68));
		
								break;
		
							case 3:
		
								hig = new Mercadorias();
								prod = new Produtos();
		
								prod.setItem(hig.getItem3());
								prod.setCodigo(19984);
								prod.setPreco(1.09);
								System.out.println("insira a quantidade:");
								qtde = input.nextInt();
								prod.setQtde(qtde);
		
								prodt.add(prod);
								tot.add(prod.total(qtde, 1.09));
							default:
								break;
							}
					System.out.println("continuar comprando? (1/0):");
					System.out.println("escolha 1 para sim");
					System.out.println("escolha 0 para não");
					resposta = input.nextLong();
				}
				break;
			case 2:
				
				System.out.println("categoria: limpeza");
				System.out.println();
				
				System.out.println("=============================================");
				System.out.println("|                                |			|");
				System.out.println("|   1 - detergente atol 90ml 	 |  0,97R$  |");
				System.out.println("|   2 - sabão pó ala 90g 		 |  6,99R$  |");
				System.out.println("|   3 -limpa aluminio 60ml       |  1,09R$  |");
				System.out.println("|                                     		|");
				System.out.println("=============================================");
				
				System.out.println();
				System.out.println("escolha uma subcategoria:");
				subcategoria = input.nextInt();
								switch (subcategoria) {
								case 1:
				
									Mercadorias lim = new Mercadorias();
									Produtos prod = new Produtos();
				
									prod.setItem(lim.getItem4());
									prod.setCodigo(10742);
									prod.setPreco(0.97);
									System.out.println("insira a quantidade:");
									int qtde = input.nextInt();
									prod.setQtde(qtde);
				
									prodt.add(prod);
									tot.add(prod.total(qtde, 0.97));
									break;
				
								case 2:
				
									lim = new Mercadorias();
									prod = new Produtos();
				
									prod.setItem(lim.getItem5());
									prod.setCodigo(17784);
									prod.setPreco(6.99);
									System.out.println("insira a quantidade:");
									qtde = input.nextInt();
									prod.setQtde(qtde);
				
									prodt.add(prod);
									tot.add(prod.total(qtde, 6.99));
				
									break;
				
								case 3:
				
									lim = new Mercadorias();
									prod = new Produtos();
				
									prod.setItem(lim.getItem6());
									prod.setCodigo(19984);
									prod.setPreco(1.09);
									System.out.println("insira a quantidade:");
									qtde = input.nextInt();
									prod.setQtde(qtde);
				
									prodt.add(prod);
									tot.add(prod.total(qtde, 1.09));
				
									break;
				
								default:
									break;
						}
								
					System.out.println("continuar comprando? (1/0):");
					System.out.println("escolha 1 para sim");
					System.out.println("escolha 0 para não");
					resposta = input.nextLong();

							while (resposta == resp) {

								System.out.println("categoria: limpeza");
								System.out.println();
								
								System.out.println("=============================================");
								System.out.println("|                                |			|");
								System.out.println("|   1 - detergente atol 90ml 	 |  0,97R$  |");
								System.out.println("|   2 - sabão pó ala 90g 		 |  6,99R$  |");
								System.out.println("|   3 -limpa aluminio 60ml       |  1,09R$  |");
								System.out.println("|                                     		|");
								System.out.println("=============================================");
								
								System.out.println();
								System.out.println("escolha uma subcategoria:");
								subcategoria = input.nextInt();

									switch (subcategoria) {
									case 1:
					
										Mercadorias lim = new Mercadorias();
										Produtos prod = new Produtos();
					
										prod.setItem(lim.getItem4());
										prod.setCodigo(10742);
										prod.setPreco(0.97);
										System.out.println("insira a quantidade:");
										int qtde = input.nextInt();
										prod.setQtde(qtde);
					
										prodt.add(prod);
										tot.add(prod.total(qtde, 0.97));
										break;
					
									case 2:
					
										lim = new Mercadorias();
										prod = new Produtos();
					
										prod.setItem(lim.getItem5());
										prod.setCodigo(17784);
										prod.setPreco(6.99);
										System.out.println("insira a quantidade:");
										qtde = input.nextInt();
										prod.setQtde(qtde);
					
										prodt.add(prod);
										tot.add(prod.total(qtde, 6.99));
					
										break;
					
									case 3:
					
										lim = new Mercadorias();
										prod = new Produtos();
					
										prod.setItem(lim.getItem6());
										prod.setCodigo(19984);
										prod.setPreco(1.09);
										System.out.println("insira a quantidade:");
										qtde = input.nextInt();
										prod.setQtde(qtde);
					
										prodt.add(prod);
										tot.add(prod.total(qtde, 1.09));
					
										break;
					
									default:
										break;
							}
					System.out.println("continuar comprando? (1/0):");
					System.out.println("escolha 1 para sim");
					System.out.println("escolha 0 para não");
					resposta = input.nextLong();
					}
					
				break;
			case 3:
				/*aqui*/
				
				System.out.println("categoria: laticinios");
				System.out.println();
				
				System.out.println("=============================================");
				System.out.println("|                                |			|");
				System.out.println("|   1 - leite em pó ninho LT 1kg |  24,97R$ |");
				System.out.println("|   2 - achocolatado nescau 800g |  6,99R$  |");
				System.out.println("|   3 - aveia dr.oetker 135g     |  4,73R$  |");
				System.out.println("|                                     		|");
				System.out.println("=============================================");
				
				System.out.println();
				System.out.println("escolha uma subcategoria:");
				subcategoria = input.nextInt();
								switch (subcategoria) {
								case 1:
				
									Mercadorias lat = new Mercadorias();
									Produtos prod = new Produtos();
				
									prod.setItem(lat.getItem7());
									prod.setCodigo(11024);
									prod.setPreco(24.97);
									System.out.println("insira a quantidade:");
									int qtde = input.nextInt();
									prod.setQtde(qtde);
				
									prodt.add(prod);
									tot.add(prod.total(qtde, 24.97));
									break;
				
								case 2:
				
									lat = new Mercadorias();
									prod = new Produtos();
				
									prod.setItem(lat.getItem8());
									prod.setCodigo(15268);
									prod.setPreco(6.99);
									System.out.println("insira a quantidade:");
									qtde = input.nextInt();
									prod.setQtde(qtde);
				
									prodt.add(prod);
									tot.add(prod.total(qtde, 6.99));
				
									break;
				
								case 3:
				
									lat = new Mercadorias();
									prod = new Produtos();
				
									prod.setItem(lat.getItem9());
									prod.setCodigo(15574);
									prod.setPreco(4.73);
									System.out.println("insira a quantidade:");
									qtde = input.nextInt();
									prod.setQtde(qtde);
				
									prodt.add(prod);
									tot.add(prod.total(qtde, 4.73));
				
									break;
				
								default:
									break;
						}
								
					System.out.println("continuar comprando? (1/0):");
					System.out.println("escolha 1 para sim");
					System.out.println("escolha 0 para não");
					resposta = input.nextLong();

							while (resposta == resp) {

								System.out.println("categoria: laticinios");
								System.out.println();
								
								System.out.println("=============================================");
								System.out.println("|                                |			|");
								System.out.println("|   1 - leite em pó ninho LT 1kg |  24,97R$  |");
								System.out.println("|   2 - achocolatado nescau 800g |  6,99R$  |");
								System.out.println("|   3 - aveia dr.oetker 135g     |  4,73R$  |");
								System.out.println("|                                     		|");
								System.out.println("=============================================");
								
								System.out.println();
								System.out.println("escolha uma subcategoria:");
								subcategoria = input.nextInt();
												switch (subcategoria) {
												case 1:
								
													Mercadorias lat = new Mercadorias();
													Produtos prod = new Produtos();
								
													prod.setItem(lat.getItem7());
													prod.setCodigo(11024);
													prod.setPreco(24.97);
													System.out.println("insira a quantidade:");
													int qtde = input.nextInt();
													prod.setQtde(qtde);
								
													prodt.add(prod);
													tot.add(prod.total(qtde, 24.97));
													break;
								
												case 2:
								
													lat = new Mercadorias();
													prod = new Produtos();
								
													prod.setItem(lat.getItem8());
													prod.setCodigo(15268);
													prod.setPreco(6.99);
													System.out.println("insira a quantidade:");
													qtde = input.nextInt();
													prod.setQtde(qtde);
								
													prodt.add(prod);
													tot.add(prod.total(qtde, 6.99));
								
													break;
								
												case 3:
								
													lat = new Mercadorias();
													prod = new Produtos();
								
													prod.setItem(lat.getItem9());
													prod.setCodigo(15574);
													prod.setPreco(4.73);
													System.out.println("insira a quantidade:");
													qtde = input.nextInt();
													prod.setQtde(qtde);
								
													prodt.add(prod);
													tot.add(prod.total(qtde, 4.73));
					
										break;
					
									default:
										break;
							}
					System.out.println("continuar comprando? (1/0):");
					System.out.println("escolha 1 para sim");
					System.out.println("escolha 0 para não");
					resposta = input.nextLong();
				
							}
				/*aqui*/
				
				
				break;
			case 4:
				System.out.println("categoria: mesa e banho");
				Mercadorias meb = new Mercadorias();
				System.out.println(meb.getItem10());
				System.out.println(meb.getItem11());
				System.out.println(meb.getItem12());
				break;
			case 5:
				System.out.println("categoria: cereais");
				Mercadorias cer = new Mercadorias();
				System.out.println(cer.getItem13());
				System.out.println(cer.getItem14());
				System.out.println(cer.getItem15());
				break;
			case 6:
				System.out.println("categoria: biscoitos e guloseimas");
				Mercadorias bigu = new Mercadorias();
				System.out.println(bigu.getItem16());
				System.out.println(bigu.getItem17());
				System.out.println(bigu.getItem18());
				break;
			case 7:
				System.out.println("categoria: moda");
				Mercadorias mod = new Mercadorias();
				System.out.println(mod.getItem19());
				System.out.println(mod.getItem20());
				System.out.println(mod.getItem21());
				break;
			case 8:
				System.out.println("categoria: eletro e eletrônicos");
				Mercadorias elet = new Mercadorias();
				System.out.println(elet.getItem22());
				System.out.println(elet.getItem23());
				System.out.println(elet.getItem24());
				break;
			default:
				break;
			}

			System.out.println("deseja entrar com um novo cliente? (1/0)");
			System.out.println("escolha 1 para sim");
			System.out.println("escolha 0 para não");
			long resposta = input.nextLong();

			{
				if (resposta == resp) {
					while (resposta == resp) {

						System.out.println("nome:");
						nome = input.next();

						System.out.println("telefone:");
						telefone = input.next();

						System.out.println("cep:");
						cep = input.next();

						cli.add(new Cliente(nome, telefone, cep));

						System.out.println();
						System.out.println("Loja");
						System.out.println();
						System.out.println("escolha uma categoria:");
						categoria = input.nextInt();

						switch (categoria) {
						case 1:

						System.out.println("categoria: higiene");
						System.out.println();

						System.out.println("=============================================");
						System.out.println("|                                |			|");
						System.out.println("|   1 - sabonete 50g 			 |  3,65R$  |");
						System.out.println("|   2 - shampoo 90g  			 |  17,68   |");
						System.out.println("|   3 - papel higiênico novo     |  1,09R$  |");
						System.out.println("|                                     		|");
						System.out.println("=============================================");	

						System.out.println();
						System.out.println("escolha uma subcategoria:");
						subcategoria = input.nextInt();
									switch (subcategoria) {
									case 1:
					
										Mercadorias hig = new Mercadorias();
										Produtos prod = new Produtos();
					
										prod.setItem(hig.getItem1());
										prod.setCodigo(12502);
										prod.setPreco(3.65);
										System.out.println("insira a quantidade:");
										int qtde = input.nextInt();
										prod.setQtde(qtde);
					
										prodt.add(prod);
										tot.add(prod.total(qtde, 3.65));
										break;
					
									case 2:
					
										hig = new Mercadorias();
										prod = new Produtos();
					
										prod.setItem(hig.getItem2());
										prod.setCodigo(12014);
										prod.setPreco(17.68);
										System.out.println("insira a quantidade:");
										qtde = input.nextInt();
										prod.setQtde(qtde);
					
										prodt.add(prod);
										tot.add(prod.total(qtde, 17.68));
					
										break;
					
									case 3:
					
										hig = new Mercadorias();
										prod = new Produtos();
					
										prod.setItem(hig.getItem3());
										prod.setCodigo(19984);
										prod.setPreco(1.09);
										System.out.println("insira a quantidade:");
										qtde = input.nextInt();
										prod.setQtde(qtde);
					
										prodt.add(prod);
										tot.add(prod.total(qtde, 1.09));
					
										break;
					
									default:
										break;
									}
		
						System.out.println("continuar comprando? (1/0):");
						System.out.println("escolha 1 para sim");
						System.out.println("escolha 0 para não");
						resposta = input.nextLong();
						while (resposta == resp) {
		
							System.out.println("categoria: higiene");
							System.out.println();

							System.out.println("=============================================");
						 	System.out.println("|                                |			|");
							System.out.println("|   1 - sabonete 50g 			 |  3,65R$  |");
							System.out.println("|   2 - shampoo 90g  			 |  17,68   |");
							System.out.println("|   3 - papel higiênico novo     |  1,09R$  |");
							System.out.println("|                                     		|");
							System.out.println("=============================================");

							System.out.println();
							System.out.println("escolha uma subcategoria:");
							subcategoria = input.nextInt();
									switch (subcategoria) {
									case 1:
				
										Mercadorias hig = new Mercadorias();
										Produtos prod = new Produtos();
				
										prod.setItem(hig.getItem1());
										prod.setCodigo(12502);
										prod.setPreco(3.65);
										System.out.println("insira a quantidade:");
										int qtde = input.nextInt();
										prod.setQtde(qtde);
										prodt.add(prod);
										tot.add(prod.total(qtde, 3.65));
				
										break;
				
									case 2:
				
										hig = new Mercadorias();
										prod = new Produtos();
				
										prod.setItem(hig.getItem2());
										prod.setCodigo(12014);
										prod.setPreco(17.68);
										System.out.println("insira a quantidade:");
										qtde = input.nextInt();
										prod.setQtde(qtde);
				
										prodt.add(prod);
										tot.add(prod.total(qtde, 17.68));
				
										break;
				
									case 3:
				
										hig = new Mercadorias();
										prod = new Produtos();
				
										prod.setItem(hig.getItem3());
										prod.setCodigo(19984);
										prod.setPreco(1.09);
										System.out.println("insira a quantidade:");
										qtde = input.nextInt();
										prod.setQtde(qtde);
				
										prodt.add(prod);
										tot.add(prod.total(qtde, 1.09));
									default:
										break;
									}
							System.out.println("continuar comprando? (1/0):");
							System.out.println("escolha 1 para sim");
							System.out.println("escolha 0 para não");
							resposta = input.nextLong();

							}

							break;
						case 2:
				
							System.out.println("categoria: limpeza");
							System.out.println();
							
							System.out.println("=============================================");
							System.out.println("|                                |			|");
							System.out.println("|   1 - detergente atol 90ml 	 |  0,97R$  |");
							System.out.println("|   2 - sabão pó ala 90g 		 |  6,99R$  |");
							System.out.println("|   3 -limpa aluminio 60ml       |  1,09R$  |");
							System.out.println("|                                     		|");
							System.out.println("=============================================");
							
							System.out.println();
							System.out.println("escolha uma subcategoria:");
							subcategoria = input.nextInt();
											switch (subcategoria) {
											case 1:
							
												Mercadorias lim = new Mercadorias();
												Produtos prod = new Produtos();
							
												prod.setItem(lim.getItem4());
												prod.setCodigo(10742);
												prod.setPreco(0.97);
												System.out.println("insira a quantidade:");
												int qtde = input.nextInt();
												prod.setQtde(qtde);
							
												prodt.add(prod);
												tot.add(prod.total(qtde, 0.97));
												break;
							
											case 2:
							
												lim = new Mercadorias();
												prod = new Produtos();
							
												prod.setItem(lim.getItem5());
												prod.setCodigo(17784);
												prod.setPreco(6.99);
												System.out.println("insira a quantidade:");
												qtde = input.nextInt();
												prod.setQtde(qtde);
							
												prodt.add(prod);
												tot.add(prod.total(qtde, 6.99));
							
												break;
							
											case 3:
							
												lim = new Mercadorias();
												prod = new Produtos();
							
												prod.setItem(lim.getItem6());
												prod.setCodigo(19984);
												prod.setPreco(1.09);
												System.out.println("insira a quantidade:");
												qtde = input.nextInt();
												prod.setQtde(qtde);
							
												prodt.add(prod);
												tot.add(prod.total(qtde, 1.09));
							
												break;
							
											default:
												break;
									}
											
								System.out.println("continuar comprando? (1/0):");
								System.out.println("escolha 1 para sim");
								System.out.println("escolha 0 para não");
								resposta = input.nextLong();
											while (resposta == resp) {
												System.out.println("categoria: limpeza");
												System.out.println();
												
												System.out.println("=============================================");
												System.out.println("|                                |			|");
												System.out.println("|   1 - detergente atol 90ml 	 |  0,97R$  |");
												System.out.println("|   2 - sabão pó ala 90g 		 |  6,99R$  |");
												System.out.println("|   3 -limpa aluminio 60ml       |  1,09R$  |");
												System.out.println("|                                     		|");
												System.out.println("=============================================");
												
												System.out.println();
												System.out.println("escolha uma subcategoria:");
												subcategoria = input.nextInt();

												switch (subcategoria) {
												case 1:
								
													Mercadorias lim = new Mercadorias();
													Produtos prod = new Produtos();
								
													prod.setItem(lim.getItem4());
													prod.setCodigo(10742);
													prod.setPreco(0.97);
													System.out.println("insira a quantidade:");
													int qtde = input.nextInt();
													prod.setQtde(qtde);
								
													prodt.add(prod);
													tot.add(prod.total(qtde, 0.97));
													break;
								
												case 2:
								
													lim = new Mercadorias();
													prod = new Produtos();
								
													prod.setItem(lim.getItem5());
													prod.setCodigo(17784);
													prod.setPreco(6.99);
													System.out.println("insira a quantidade:");
													qtde = input.nextInt();
													prod.setQtde(qtde);
								
													prodt.add(prod);
													tot.add(prod.total(qtde, 6.99));
								
													break;
								
												case 3:
								
													lim = new Mercadorias();
													prod = new Produtos();
								
													prod.setItem(lim.getItem6());
													prod.setCodigo(19984);
													prod.setPreco(1.09);
													System.out.println("insira a quantidade:");
													qtde = input.nextInt();
													prod.setQtde(qtde);
								
													prodt.add(prod);
													tot.add(prod.total(qtde, 1.09));
								
													break;
								
												default:
													break;
										}
								System.out.println("continuar comprando? (1/0):");
								System.out.println("escolha 1 para sim");
								System.out.println("escolha 0 para não");
								resposta = input.nextLong();
							
							}
							
							break;
						case 3:
							
							/*aqui*/
								
							
							System.out.println("categoria: laticinios");
							System.out.println();
							
							System.out.println("=============================================");
							System.out.println("|                                |			|");
							System.out.println("|   1 - leite em pó ninho LT 1kg |  24,97R$  |");
							System.out.println("|   2 - achocolatado nescau 800g |  6,99R$  |");
							System.out.println("|   3 - aveia dr.oetker 135g     |  4,73R$  |");
							System.out.println("|                                     		|");
							System.out.println("=============================================");
							
							System.out.println();
							System.out.println("escolha uma subcategoria:");
							subcategoria = input.nextInt();
											switch (subcategoria) {
											case 1:
							
												Mercadorias lat = new Mercadorias();
												Produtos prod = new Produtos();
							
												prod.setItem(lat.getItem7());
												prod.setCodigo(11024);
												prod.setPreco(24.97);
												System.out.println("insira a quantidade:");
												int qtde = input.nextInt();
												prod.setQtde(qtde);
							
												prodt.add(prod);
												tot.add(prod.total(qtde, 24.97));
												break;
							
											case 2:
							
												lat = new Mercadorias();
												prod = new Produtos();
							
												prod.setItem(lat.getItem8());
												prod.setCodigo(15268);
												prod.setPreco(6.99);
												System.out.println("insira a quantidade:");
												qtde = input.nextInt();
												prod.setQtde(qtde);
							
												prodt.add(prod);
												tot.add(prod.total(qtde, 6.99));
							
												break;
							
											case 3:
							
												lat = new Mercadorias();
												prod = new Produtos();
							
												prod.setItem(lat.getItem9());
												prod.setCodigo(15574);
												prod.setPreco(4.73);
												System.out.println("insira a quantidade:");
												qtde = input.nextInt();
												prod.setQtde(qtde);
							
												prodt.add(prod);
												tot.add(prod.total(qtde, 4.73));
							
												break;
							
											default:
												break;
									}
											
								System.out.println("continuar comprando? (1/0):");
								System.out.println("escolha 1 para sim");
								System.out.println("escolha 0 para não");
								resposta = input.nextLong();

										while (resposta == resp) {

											System.out.println("categoria: laticinios");
											System.out.println();
											
											System.out.println("=============================================");
											System.out.println("|                                |			|");
											System.out.println("|   1 - leite em pó ninho LT 1kg |  24,97R$  |");
											System.out.println("|   2 - achocolatado nescau 800g |  6,99R$  |");
											System.out.println("|   3 - aveia dr.oetker 135g     |  4,73R$  |");
											System.out.println("|                                     		|");
											System.out.println("=============================================");
											
											System.out.println();
											System.out.println("escolha uma subcategoria:");
											subcategoria = input.nextInt();
															switch (subcategoria) {
															case 1:
											
																Mercadorias lat = new Mercadorias();
																Produtos prod = new Produtos();
											
																prod.setItem(lat.getItem7());
																prod.setCodigo(11024);
																prod.setPreco(24.97);
																System.out.println("insira a quantidade:");
																int qtde = input.nextInt();
																prod.setQtde(qtde);
											
																prodt.add(prod);
																tot.add(prod.total(qtde, 24.97));
																break;
											
															case 2:
											
																lat = new Mercadorias();
																prod = new Produtos();
											
																prod.setItem(lat.getItem8());
																prod.setCodigo(15268);
																prod.setPreco(6.99);
																System.out.println("insira a quantidade:");
																qtde = input.nextInt();
																prod.setQtde(qtde);
											
																prodt.add(prod);
																tot.add(prod.total(qtde, 6.99));
											
																break;
											
															case 3:
											
																lat = new Mercadorias();
																prod = new Produtos();
											
																prod.setItem(lat.getItem9());
																prod.setCodigo(15574);
																prod.setPreco(4.73);
																System.out.println("insira a quantidade:");
																qtde = input.nextInt();
																prod.setQtde(qtde);
											
																prodt.add(prod);
																tot.add(prod.total(qtde, 4.73));
								
													break;
								
												default:
													break;
										}
								System.out.println("continuar comprando? (1/0):");
								System.out.println("escolha 1 para sim");
								System.out.println("escolha 0 para não");
								resposta = input.nextLong();
							
										}
							
							
							/*aqui*/
							
							break;
						case 4:
							System.out.println("categoria: mesa e banho");
							Mercadorias meb = new Mercadorias();
							System.out.println(meb.getItem10());
							System.out.println(meb.getItem11());
							System.out.println(meb.getItem12());
							break;
						case 5:
							System.out.println("categoria: cereais");
							Mercadorias cer = new Mercadorias();
							System.out.println(cer.getItem13());
							System.out.println(cer.getItem14());
							System.out.println(cer.getItem15());
							break;
						case 6:
							System.out.println("categoria: biscoitos e guloseimas");
							Mercadorias bigu = new Mercadorias();
							System.out.println(bigu.getItem16());
							System.out.println(bigu.getItem17());
							System.out.println(bigu.getItem18());
							break;
						case 7:
							System.out.println("categoria: moda");
							Mercadorias mod = new Mercadorias();
							System.out.println(mod.getItem19());
							System.out.println(mod.getItem20());
							System.out.println(mod.getItem21());
							break;
						case 8:
							System.out.println("categoria: eletro e eletrônicos");
							Mercadorias elet = new Mercadorias();
							System.out.println(elet.getItem22());
							System.out.println(elet.getItem23());
							System.out.println(elet.getItem24());
							break;
						default:
							break;
						}

						System.out.println("deseja entrar com un novo cliente? (1/0)");
						System.out.println("escolha 1 para sim");
						System.out.println("escolha 0 para não");
						resposta = input.nextLong();
					}
				}

				System.out.println("Obrigado pela preferência! volte sempre!");
				input.close();
			}

		} catch (PersonalException e) {
			System.out.println("error:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("error:" + e.getMessage());
		}

		System.out.println();

		/* elemento para inserção de dados em um arquivo
		try {
			

			Scanner entrada = new Scanner(System.in);
			PrintStream arquivo = new PrintStream("C:/Users/Mendes/Desktop/java/src/revisao/arquivo/arquivo.txt");
			while(entrada.hasNext()) {
				arquivo.println(entrada.nextLine());
			}
			
		}catch(PersonalException e) {
			System.out.println("error:" + e.getMessage());
		}catch(Exception e) {
			System.out.println("error:" + e.getMessage());
		}*/
		
		
		/*schema de exibicao 1 gera loop
		for (Cliente dados : cli) {
			for (Produtos dados2 : prodt) {
				for (Double dados3 : tot) {
					System.out.println("CLIENTE:" + dados.toString() +","+ "CARRINHO:" + dados2.toString() +","
							+ "total a pagar:" + dados3 + "R$");
				}
			}

		}
		 */
		
		
		
		
		
		/*
		 * schema de exibicao 2 gera desorganização
		
		for (Cliente dados : cli) {
			System.out.println("CLIENTE:" + dados.toString());
		}
		
		for (Produtos dados2 : prodt) {
				System.out.println("CARRINHO:" + dados2.toString());
		}
		
		for (Double dados3 : tot) {
					System.out.println("total a pagar:" + dados3 + "R$");
		 }
		*/
		
		
		
		
		/*schema de exibição 3 gera arrays desorganizados
			System.out.println("CLIENTE:" + cli + ","+ "ITEMS" + prodt + "," + "total a pagar:" + tot);
		*/
		System.out.println("CLIENTE:" + cli + ","+ "ITEMS" + prodt + "," + "total a pagar:" + tot);
		
		
	}
}
