package br.model;

public class VetorUtils {

    private VetorUtils() {
    }
    public static double[] soma(double[] vetorA, double[] vetorB) {
        if (vetorA == null || vetorB == null)
            throw new IllegalArgumentException("Os vetores não podem ser nulos.");

        if (vetorA.length != vetorB.length)
            throw new IllegalArgumentException("Os vetores devem ter o mesmo comprimento.");

        double[] resultado = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++)
            resultado[i] = vetorA[i] + vetorB[i];

        return resultado;
    }
    public static double[] subtracao(double[] vetorA, double[] vetorB) {
        if (vetorA == null || vetorB == null)
            throw new IllegalArgumentException("Os vetores não podem ser nulos.");

        if (vetorA.length != vetorB.length)
            throw new IllegalArgumentException("Os vetores devem ter o mesmo comprimento.");

        double[] resultado = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++)
            resultado[i] = vetorA[i] - vetorB[i];

        return resultado;
    }
    public static double produtoEscalar(double[] vetorA, double[] vetorB) {
        if (vetorA == null || vetorB == null)
            throw new IllegalArgumentException("Vetores nulos não são permitidos.");

        if (vetorA.length != vetorB.length)
            throw new IllegalArgumentException("Vetores com valores diferentes não são permitidos, deverão ser iguais.");

        double resultado = 0.0;

        for (int i = 0; i < vetorA.length; i++)
            resultado += vetorA[i] * vetorB[i];

        return resultado;
    }
}
