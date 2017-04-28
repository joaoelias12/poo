import java.util.Random;
import java.util.Scanner; 

public class Trabalhojogodematematica {

	public static void main(String[] args) {
		double resposta = 0;
		int c = 0;
		int opcao = 0;
		int f = 0;
		Scanner leitor = new Scanner(System.in);
		Random gerador = new Random();

		while (opcao != 2){
			System.out.println("MATH-QUOTES - THE GAME");
			System.out.println("1. Novo jogo");
			System.out.println("2. Sair");
			System.out.println("3. Best Scores");
			System.out.println("4. Reportar bug");
			System.out.println("5. Créditos");
			opcao = leitor.nextInt();
			if(opcao == 3){
			   System.out.println("BEST SCORES");
				
			}
			if (opcao == 5){
				System.out.println("ZERK GAMES CORPORATION LTDA. 2017");
				System.out.println("Este jogo foi produzido por João Marcos");
				System.out.println("Versão Alpha 1.01a");
			}
			if (opcao == 1){
				int nivel = 0;
				int vidas = 3;
				boolean vitoria = false;

				while (vidas > 0 & !vitoria){


					for(int rodada = 1; rodada < 4; rodada++){
						nivel = 1; 
						if (vidas < 1){
							System.out.println("Você perdeu");

							break;
						}
						int a = 0;
						int b = 0; 

						a = gerador.nextInt(10);
						b = gerador.nextInt(10);
						System.out.println("Nível:"+nivel);
						System.out.println("Vidas:"+vidas);
						System.out.println("Rodada numero:" +rodada);
						System.out.println(a + "+" + b);
						resposta = leitor.nextInt();
						c = a + b;
						if(c != resposta){
							vidas--;
							System.out.println("Hahahaha achei que você era bom! -1 HP | Vidas restantes:"+vidas);



						}else{
							System.out.println("Excelente!Certa resposta, aguarde a próxima rodada +10 SCORE");
						}

						if (rodada == 3){

							nivel = 2;
							int d;
							int e;
							for(int rodada2 = 1; rodada2 < 4; rodada2++){
								if (vidas < 1){
									System.out.println("Você perdeu");

									break;}
								d = gerador.nextInt(10);
								e = gerador.nextInt(10);
								System.out.println("Nível:"+nivel);
								System.out.println("Vidas:"+vidas);
								System.out.println("Rodada numero:" +rodada2);
								System.out.println(d + "*" + e);
								resposta = leitor.nextInt();
								f = d * e;
								if (f != resposta){
									vidas--;
									System.out.println("Decisão errada cowboy!-1 HP| Vidas restantes:"+vidas);

								}else{
									System.out.println("Meu respeito deve ser dado, resposta certa! +10 SCORE");
								}
								if (rodada2 == 3){
									nivel = 3;
									int g;
									int h;
									int i;
									int rodada3 = 0;
									
									for (rodada3 = 1; rodada3 < 4; rodada3++){


										g = gerador.nextInt(10);
										h = gerador.nextInt(10);
										if(h == 0){
											h++;
										}
										System.out.println("Parabéns guerreiro, tens chegado longe..! +200 BONUS SCORE ACHIEVMENT");
										System.out.println("Nível:"+nivel);
										System.out.println("Vidas:"+vidas);
										System.out.println("Rodada numero:" +rodada3);
										System.out.println(g + "/" + h);
										resposta = leitor.nextDouble();
										i = g / h;
										System.out.println(i);
										if (i != resposta){
											vidas--;
											System.out.println("É uma pena! | Vidas restantes:"+vidas);

										}else{
											System.out.println("Hum, talvez sorte de iniciante... +15 SCORE");
										}
										if(rodada3 == 3){
											nivel = 4;
											int j = 0;
											int k = 0;
											int l = 0;


											for (int rodada4 = 1; rodada4 < 4; rodada4++){

												j = gerador.nextInt(100);
												k = gerador.nextInt(100);


												System.out.println("ULTIMO NÍVEL - PRESTE MUITO ATENÇÃO AGORA HEIM!");
												System.out.println("BOA SORTE!");
												System.out.println("Nível:"+nivel);
												System.out.println("Vidas:"+vidas);
												System.out.println("Rodada numero:" +rodada4);
												System.out.println(j + "*" + k);
												resposta = leitor.nextDouble();
												l = j * k;
												System.out.println(l);
												if (l != resposta){
													vidas--;
													System.out.println("Resposta errada!Mantenha calma..é a última rodada. -1HP | Vidas restantes:"+vidas);

												}else{

													System.out.println("MM-M-M-MONSTER KILL!!! RESPOSTA CERTA! +20 SCORE");
												
													}
													if(rodada4 == 3){
														vitoria = true;
														System.out.println("******VICTORY!*******");
														System.out.println("YOU ARE THE FIRST PLAYER TO WIN THIS GAME!");
														System.out.println("GAME MADE BY ZERK CORPORATION LTDA. 2017");
														System.out.println("******THANKS FOR PLAYING*******");
														System.out.println("FOR MORE GAMES ACCESS WWWW.ARMORGAMES.COM");
												}


											} 

										}


									}






								}
							}
						}









					}




				}


			     if(vidas < 1){
			    	 System.out.println("VOCÊ PERDEU TUDO KKK!");}

			}

		     

		}

    
     }




	}




