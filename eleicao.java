package eleicao;

import java.util.Scanner;
import java.util.Random;

public class eleicao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//declarando random
		Random random = new Random();
		
		//declarando variaveis 
		int PT = 13, PDT = 12, PL = 22, PSDB = 45, vn = 5, vb = 6, PTv = 0, PDTv = 0, PLv = 0, PSDBv = 0, vnv = 0,vbv = 0, v, vtotal;
		
		//exibcao texto
		System.out.println("(13) PT\n(12) PDT\n(22) PL\n(45) PSDB\nVoto nulo(5)\nvoto em branco(6)");
		System.out.println("voto para a(o) Candidata(o): ");
		
		//atribuicao de valor
		v = leia.nextInt();
		leia.close();
		
		//criando switch
		switch (v) {
		case 13:
			System.out.println("voto para PT");
			break;
		case 12:
			System.out.println("voto para PDT");
			break;
		case 22:
			System.out.println("voto para PL");
			break;
		case 45:
			System.out.println("voto para no PSDB");
			break;
		case 5:
			System.out.println("voto nulo");
			break;
		case 6:
			System.out.println("voto em branco");
			break;
		}
		//laco de repeticao
		for (v = 0;; v++) {
			v = random.nextInt(50);
			
			//condicao
			if (v == 13) {
				System.out.println("votou no PT");
				PTv = PTv + 1;
			}
			if (v == 12) {
				System.out.println("votou no PDT");
				PDTv = PDTv + 1;
			}
			if (v == 22) {
				System.out.println("votou no PL");
				PLv = PLv + 1;
			}
			if (v == 45) {
				System.out.println("votou no PSDB");
				PSDBv = PSDBv + 1;
			}
			if (v == 5) {
				System.out.println("votou nulo");
				vnv = vnv + 1;
			}
			if (v == 6) {
				System.out.println("votou em branco");
				vbv = vbv + 1;
			}
			//soma de votos
			vtotal = PTv + PDTv + PLv + PSDBv + vnv + vbv;
			if (vtotal == 100)
				break;
		}
		//exibcao de texto
		System.out.println("total de votos:" + vtotal);
		System.out.println("total PT:" + PTv);
		System.out.println("total PDT:" + PDTv);
		System.out.println("total no PL:" + PLv);
		System.out.println("total no PSDB:" + PSDBv);
		System.out.println("total votos nulos:" + vnv);
		System.out.println("total votos em branco:" + vbv);

	}
}
