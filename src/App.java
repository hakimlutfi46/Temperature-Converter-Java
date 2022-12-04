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
            System.out.println("------------------------------------------------");
            println("Selamat datang di program konversi suhu JAVA");
            System.out.println("------------------------------------------------");
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
                            System.out.println(conv.celtofah(suhuAwal));
                            break;

                        case 2:
                            System.out.println(conv.celtokel(suhuAwal));
                            break;

                        case 3:
                            System.out.println(conv.celtore(suhuAwal));
                            break;

                        case 4:
                            System.out.println(conv.celtoran(suhuAwal));
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
                            System.out.println(conv.fahtocel(suhuAwal));
                            break;

                        case 2:
                            System.out.println(conv.fahtokel(suhuAwal));
                            break;

                        case 3:
                            System.out.println(conv.fahtore(suhuAwal));
                            break;

                        case 4:
                            System.out.println(conv.fahtoran(suhuAwal));
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
                            System.out.println(conv.keltocel(suhuAwal));
                            break;

                        case 2:
                            System.out.println(conv.keltofah(suhuAwal));
                            break;

                        case 3:
                            System.out.println(conv.keltore(suhuAwal));
                            break;

                        case 4:
                            System.out.println(conv.keltoran(suhuAwal));
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
                            System.out.println(conv.retocel(suhuAwal));
                            break;

                        case 2:
                            System.out.println(conv.retofah(suhuAwal));
                            break;

                        case 3:
                            System.out.println(conv.retokel(suhuAwal));
                            break;

                        case 4:
                            System.out.println(conv.retoran(suhuAwal));
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
                            System.out.println(conv.rantocel(suhuAwal));
                            break;

                        case 2:
                            System.out.println(conv.rantofah(suhuAwal));
                            break;

                        case 3:
                            System.out.println(conv.rantokel(suhuAwal));
                            break;

                        case 4:
                            System.out.println(conv.rantore(suhuAwal));
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
}
