package com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoum;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.EsqLotofacilDao;

@Component
public class CercaEsqUm {
	@Autowired
	private EsqLotofacilDao numerosCercadoDao;

	public void cerca4(int numIniciaCom1, int numTerminaCom2) {

        List<EsqUm> listEsqUm = new ArrayList<EsqUm>();

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

						EsqUm numerosCercados = new EsqUm();
						numerosCercados.setNumEsqUm(numeros);
						listEsqUm.add(numerosCercados);
					}
				}
			}
		}
        numerosCercadoDao.gravarEsqUm(listEsqUm);
	}

	public void cerca3(int tresInicio, int tresTermino) {

        List<EsqUm> listEsqUm = new ArrayList<EsqUm>();

		int sessenta = 25;
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

					EsqUm numerosCercados = new EsqUm();
					numerosCercados.setNumEsqUm(numeros);
                    listEsqUm.add(numerosCercados);

				}
			}
		}
		numerosCercadoDao.gravarEsqUm(listEsqUm);
	}

	public void cerca2(int numIniciaCom, int numTerminaCom) {

        List<EsqUm> listEsqUm = new ArrayList<EsqUm>();

		int sessenta = 25;
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

				EsqUm numerosCercados = new EsqUm();
				numerosCercados.setNumEsqUm(numeros);
                listEsqUm.add(numerosCercados);
			}
		}
		numerosCercadoDao.gravarEsqUm(listEsqUm);
	}
}
