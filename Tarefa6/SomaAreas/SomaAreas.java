class SomaAreas {
    public static double somaAreas (Superficie[] superficies) {
        double soma = 0;
        for (Superficie superficie : superficies) {
            soma += superficie.calculaArea();
        }
        return soma;
    }
}
