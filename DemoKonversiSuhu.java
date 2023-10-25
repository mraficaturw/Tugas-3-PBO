package tugaspbo3_part1;
import java.util.Scanner;
public class DemoKonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        KonversiSuhu2 ks2 = new KonversiSuhu2();

        System.out.print("Masukkan suhu (°C): ");
        int suhuCelsius = input.nextInt();

        float suhuFahrenheit = ks2.celciusToFahrenheit(suhuCelsius);
        float suhuReamur = ks2.celciusToReamur(suhuCelsius);

        System.out.println(suhuCelsius + "°C = " + suhuFahrenheit +  "°F.");
        System.out.println(suhuCelsius  +"°C = " + suhuReamur + "°R. ");

        System.out.print("Masukkan suhu (°F) = ");
        int suhuFahrenheitInput = input.nextInt();

        float suhuReamurFromFahrenheit = ks2.fahrenheitToReamur(suhuFahrenheitInput);

        System.out.println(suhuFahrenheitInput + "°F " + suhuReamurFromFahrenheit + " °R." );

        input.close();
    }
}
