import java.util.Scanner;

public class App {

    static void print(String tulis) {
        System.out.print(tulis);
    }

    static void println(String tulis) {
        System.out.println(tulis);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int pilih_suhu1, pilih_suhu2;
        double suhuAwal;
        String ulang = "y";

        do {
            System.out.println("=================================================");
            println("Selamat datang di program konversi suhu JAVA");
            System.out.println("=================================================");
            println("Pilih suhu yang ingin anda konversikan");
            println("1.Celcius");
            println("2.Fahrenheit");
            println("3.Kelvin");
            println("4.Reamur");
            println("5.Rankine");
            pilih_suhu1 = sc.nextInt();

            System.out.println();

            print("Masukkan suhu yang ingin anda hitung = ");
            suhuAwal = sc.nextDouble();

            switch (pilih_suhu1) {
                case 1:
                    println("Pilih ingin mengkonversi Celcius dengan suhu mana?");
                    println("1. Celcius to Fahrenheit");
                    println("2. Celcius to Kelvin");
                    println("3. Celcius to Reamur");
                    println("4. Celcius to Rankine");
                    pilih_suhu2 = sc.nextInt();

                    System.out.println("=================================================");

                    switch (pilih_suhu2) {
                        case 1:
                            System.out.println(celtofah(suhuAwal));
                            break;

                        case 2:
                            System.out.println(celtokel(suhuAwal));
                            break;

                        case 3:
                            System.out.println(celtore(suhuAwal));
                            break;

                        case 4:
                            System.out.println(celtoran(suhuAwal));
                            break;

                        default:
                            println("Anda memasukkan perintah yang salah");
                            break;
                    }
                    break;

                case 2:
                    println("Pilih ingin mengkonversi Fahrenheit dengan suhu mana?");
                    println("1. Fahrenheit to Celcius");
                    println("2. Fahrenheit to Kelvin");
                    println("3. Fahrenheit to Reamur");
                    println("4. Fahrenheit to Rankine");
                    pilih_suhu2 = sc.nextInt();

                    System.out.println("=================================================");

                    switch (pilih_suhu2) {

                        case 1:
                            System.out.println(fahtocel(suhuAwal));
                            break;

                        case 2:
                            System.out.println(fahtokel(suhuAwal));
                            break;

                        case 3:
                            System.out.println(fahtore(suhuAwal));
                            break;

                        case 4:
                            System.out.println(fahtoran(suhuAwal));
                            break;

                        default:
                            println("Perintah yang anda masukkan salah");
                            break;
                    }
                    break;

                case 3:
                    println("Pilih ingin mengkonversi Kelvin dengan suhu mana?");
                    println("1. Kelvin to Celcius");
                    println("2. Kelvin to Fahrenheit");
                    println("3. Kelvin to Reamur");
                    println("4. Kelvin to Rankine");
                    pilih_suhu2 = sc.nextInt();

                    System.out.println("=================================================");

                    switch (pilih_suhu2) {

                        case 1:
                            System.out.println(keltocel(suhuAwal));
                            break;

                        case 2:
                            System.out.println(keltofah(suhuAwal));
                            break;

                        case 3:
                            System.out.println(keltore(suhuAwal));
                            break;

                        case 4:
                            System.out.println(keltoran(suhuAwal));
                            break;

                        default:
                            println("Anda memasukkan perintah yang salah");
                            break;

                    }
                    break;

                case 4:
                    println("Pilih ingin mengkonversi Reamur dengan suhu mana?");
                    println("1. Reamur to Celcius");
                    println("2. Reamur to Fahrenheit");
                    println("3. Reamur to Kelvin");
                    println("4. Reamur to Rankine");
                    pilih_suhu2 = sc.nextInt();

                    System.out.println("=================================================");

                    switch (pilih_suhu2) {

                        case 1:
                            System.out.println(retocel(suhuAwal));
                            break;

                        case 2:
                            System.out.println(retofah(suhuAwal));
                            break;

                        case 3:
                            System.out.println(retokel(suhuAwal));
                            break;

                        case 4:
                            System.out.println(retoran(suhuAwal));
                            break;

                        default:
                            println("Anda memasukkan perintah yang salah");
                            break;
                    }
                    break;

                case 5:
                    println("Pilih ingin mengkonversi Rankine dengan suhu mana?");
                    println("1. Rankine to Celcius");
                    println("2. Rankine to Fahrenheit");
                    println("3. Rankine to Kelvin");
                    println("4. Rankine to Reamur");
                    pilih_suhu2 = sc.nextInt();

                    System.out.println("=================================================");

                    switch (pilih_suhu2) {
                        case 1:
                            System.out.println(rantocel(suhuAwal));
                            break;

                        case 2:
                            System.out.println(rantofah(suhuAwal));
                            break;

                        case 3:
                            System.out.println(rantokel(suhuAwal));
                            break;

                        case 4:
                            System.out.println(rantore(suhuAwal));
                            break;

                        default:
                            println("Anda memasukkan perintah yang salah");
                            break;
                    }

                    break;

                default:
                    println("Anda memasukkan perintah yang salah");
                    break;
            }
            System.out.println();
            println("Apakah ingin melakukannya lagi (y/t)");
            ulang = sc.next();
        } while (ulang.equals("y"));
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
