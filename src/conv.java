public class conv {
    public static void main(String[] args) {
        
    }
    // konversi suhu celcius
    static double celtofah(double suhu) {
        double hasil = 1.8 * suhu + 32;
        return hasil;
    }

    static double celtokel(double suhu) {
        double hasil = suhu + 273.15;
        return hasil;
    }

    static double celtore(double suhu) {
        double hasil = 0.8 * suhu;
        return hasil;
    }

    static double celtoran(double suhu) {
        double hasil = (suhu + 273.15) * 1.8;
        return hasil;
    }

    // koonversi suhu fahrenheit
    static double fahtocel(double suhu) {
        double hasil = (suhu - 32) * 0.56;
        return hasil;
    }

    static double fahtokel(double suhu) {
        double hasil = (suhu + 459.67) * 0.56;
        return hasil;
    }

    static double fahtore(double suhu) {
        double hasil = 0.44 * (suhu - 32);
        return hasil;
    }

    static double fahtoran(double suhu) {
        double hasil = suhu + 459.67;
        return hasil;
    }

    // konversi suhu kelvin
    static double keltocel(double suhu) {
        double hasil = suhu - 273.15;
        return hasil;
    }

    static double keltofah(double suhu) {
        double hasil = (suhu * 1.8) - 459.67;
        return hasil;
    }

    static double keltore(double suhu) {
        double hasil = 0.8 * (suhu - 273);
        return hasil;
    }

    static double keltoran(double suhu) {
        double hasil = suhu * 1.8;
        return hasil;
    }

    // konversi suhu reamur
    static double retocel(double suhu) {
        double hasil = suhu / 0.8;
        return hasil;
    }

    static double retofah(double suhu) {
        double hasil = (suhu * 2.25) + 32;
        return hasil;
    }

    static double retokel(double suhu) {
        double hasil = (suhu * 0.8) + 273.15;
        return hasil;
    }

    static double retoran(double suhu) {
        double hasil = (suhu * 2.25) + 491.67;
        return hasil;
    }

    // konversi suhu rankine
    static double rantocel(double suhu) {
        double hasil = (suhu - 491.67) * 0.56;
        return hasil;
    }

    static double rantofah(double suhu) {
        double hasil = suhu - 459.67;
        return hasil;
    }

    static double rantokel(double suhu) {
        double hasil = suhu * 0.56;
        return hasil;
    }

    static double rantore(double suhu) {
        double hasil = (suhu / 1.8 + 273.15) * 0.8;
        return hasil;
    }
}
