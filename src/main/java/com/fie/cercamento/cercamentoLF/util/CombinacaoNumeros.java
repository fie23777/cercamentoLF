package com.fie.cercamento.cercamentoLF.util;

import java.util.ArrayList;
import java.util.List;

public class CombinacaoNumeros {

    public static void gerarCombinacoes(int[] numeros, int combinacaoTamanho, int inicio, List<Integer> combinacaoAtual) {
        if (combinacaoAtual.size() == combinacaoTamanho) {
            System.out.println(combinacaoAtual);
            return;
        }

        for (int i = inicio; i < numeros.length; i++) {
            combinacaoAtual.add(numeros[i]);
            gerarCombinacoes(numeros, combinacaoTamanho, i + 1, combinacaoAtual);
            combinacaoAtual.remove(combinacaoAtual.size() - 1); // Remove o último elemento
        }
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};
        int combinacaoTamanho = 5;

        gerarCombinacoes(numeros, combinacaoTamanho, 0, new ArrayList<>());
    }
}