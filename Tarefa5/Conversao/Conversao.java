public class Conversao {
    static double f = 0;
    static double c = 0;
    static double k = 0;
    
    public static double CelsiusFarnheit (double c) {
        f = 9 * (c/5) + 32;
        return f;
    }
    
    public static double CelsiusKelvin (double c) {
        k = c + 273.15;
        return k;
    }
    
    public static double FarnheitCelsius (double f) {
        c = (5.0/9.0) * (f-32);
        return c;
    }
    
    public static double FarnheitKelvin (double f) {
        k = (5.0/9.0) * (f - 32) + 273.15;
        return k;
    }
    
    public static double KelvinCelsius (double k) {
        c = k - 273.15;
        return c;
    }
    
    public static double KelvinFarnheit (double k) {
        f = (9.0/5.0) * (k - 273.15) + 32;
        return f;
    }
}
