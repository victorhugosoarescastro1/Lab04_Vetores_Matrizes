package br.principal;

import br.model.VetorUtils;
import java.util.Arrays;

public class TesteCalculadoraVetores {

    public static void main(String[] args) {
        System.out.println("Calculadora de Vetores\n");
        double[] v1 = {1.0, 2.0, 3.0};
        double[] v2 = {4.0, 5.0, 6.0};

        System.out.println("Vetor 1: " + Arrays.toString(v1));
        System.out.println("Vetor 2: " + Arrays.toString(v2));
        System.out.println();

        testarOperacoesVetoriais(v1, v2);

        testarValidacoes();
    }
    private static void testarOperacoesVetoriais(double[] v1, double[] v2) {
        System.out.println("Operações Matemáticas");

        try {
            double[] resultadoSoma = VetorUtils.soma(v1, v2);
            System.out.println("Soma: " + Arrays.toString(resultadoSoma));

            double[] resultadoSubtracao = VetorUtils.subtracao(v1, v2);
            System.out.println("Subtração: " + Arrays.toString(resultadoSubtracao));

            double produtoEscalar = VetorUtils.produtoEscalar(v1, v2);
            System.out.println("Produto Escalar: " + produtoEscalar);

        } catch (Exception e) {
            System.err.println("Erro inesperado nas operações: " + e.getMessage());
        }

        System.out.println();
    }
    private static void testarValidacoes() {
        System.out.println("Validando para visualizar se está tudo certo");

        double[] v3 = {7.0, 8.0};
        double[] v4 = {1.0, 2.0, 3.0};

        System.out.println("Testando exceção com vetores de tamanhos diferentes...");
        System.out.println("Vetor 3: " + Arrays.toString(v3) + " (tamanho: " + v3.length + ")");
        System.out.println("Vetor 4: " + Arrays.toString(v4) + " (tamanho: " + v4.length + ")");

        try {
            VetorUtils.soma(v3, v4);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao tentar somar vetores: " + e.getMessage());
        }

        try {
            VetorUtils.subtracao(v3, v4);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao tentar subtrair vetores: " + e.getMessage());
        }

        try {
            VetorUtils.produtoEscalar(v3, v4);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao calcular produto escalar: " + e.getMessage());
        }

        System.out.println("\nTestando com vetores nulos...");
        try {
            VetorUtils.soma(null, v4);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro com vetor nulo: " + e.getMessage());
        }

        System.out.println("\n Chegou ao fim :)");
    }
}