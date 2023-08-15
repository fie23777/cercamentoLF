package com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadocinco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.EsqLotofacilDao;

@Component
public class CercaEsqCinco {
	@Autowired
	private EsqLotofacilDao numerosCercadoDao;

	public void cerca4(int numIniciaCom1, int numTerminaCom2) {
		int sessenta = 25;
		int um1 = sessenta - 3;
		int dois2 = sessenta - 2;
		int tres3 = sessenta - 1;
		int quatro4 = numTerminaCom2;
		int[] resulMega = new int[26];

		for (int i = numIniciaCom1; i <= um1; i++) {
			int cont = i + 1;
			for (int j = cont; j <= dois2; j++) {
				cont = j + 1;
				for (int n = cont; n <= tres3; n++) {
					cont = n + 1;
					for (int m = cont; m <= quatro4; m++) {
						String um = String.valueOf(resulMega[1] = i);
						String dois = String.valueOf(resulMega[2] = j);
						String tres = String.valueOf(resulMega[3] = n);
						String quatro = String.valueOf(resulMega[4] = m);

						String numeros = um + "-" + dois + "-" + tres + "-" + quatro;

						System.out.println(numeros);

						EsqCinco numerosCercados = new EsqCinco();
						numerosCercados.setNumEsqCinco(numeros);

						numerosCercadoDao.gravarEsqCinco(numerosCercados);
					}
				}
			}
		}
	}

	public void cerca3(int tresInicio, int tresTermino) {
		int sessenta = 25;
		int valor = 0;
		int um1 = sessenta - 2;
		int dois2 = sessenta - 1;
		int tres3 = tresTermino;
		int[] resulMega = new int[26];

		for (int i = tresInicio; i <= um1; i++) {
			int cont = i + 1;
			for (int j = cont; j <= dois2; j++) {
				cont = j + 1;
				for (int n = cont; n <= tres3; n++) {
					String um = String.valueOf(resulMega[1] = i);
					String dois = String.valueOf(resulMega[2] = j);
					String tres = String.valueOf(resulMega[3] = n);

					String numeros = um + "-" + dois + "-" + tres;

					System.out.println(numeros);

					EsqCinco numerosCercados = new EsqCinco();
					numerosCercados.setNumEsqCinco(numeros);

					numerosCercadoDao.gravarEsqCinco(numerosCercados);
				}
			}
		}
		System.out.println("Qauntidades de combinação " + valor);
	}

	public void cerca2(int numIniciaCom, int numTerminaCom) {
		int sessenta = 25;
		int valor = 0;
		int um1 = sessenta - 1;
		int dois2 = numTerminaCom; // terminar neste número
		int[] resulMega = new int[26];

		for (int i = numIniciaCom; i <= um1; i++) {
			int cont = i + 1;
			for (int j = cont; j <= dois2; j++) {
				String um = String.valueOf(resulMega[1] = i);
				String dois = String.valueOf(resulMega[2] = j);

				String numeros = um + "-" + dois;

				System.out.println(numeros);

				EsqCinco numerosCercados = new EsqCinco();
				numerosCercados.setNumEsqCinco(numeros);

				numerosCercadoDao.gravarEsqCinco(numerosCercados);
			}
		}
		System.out.println("Qauntidades de combinação " + valor);
	}
}
