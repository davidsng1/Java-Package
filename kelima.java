public class kelima{

    public static void main(String[] args){

        //kita akan membahas unary

        //unary + dan -

        int angka = 10;
        System.out.println("Unary dari angka 10 yaitu " + -angka);

        int ang = -100;
        System.out.println("Unary dari angka " + ang + " yaitu " + -ang);

        long bilangan = 126;
        System.out.println("Unary dari angka 126 yaitu " + -bilangan);

        //bagaimana dengan program aritmatika?

        float angka1 = 2;
        float angka2 = 3;
        float angka3 = 7;

        float hasilFloat = angka1 / angka2 * angka3;
        System.out.println("Hasil dari " + angka1 + " / " + angka2 + " x " + angka3 + " = " + hasilFloat );

        float hasilFloat2 = angka1 * angka3 + angka2;
        System.out.println("Hasil dari " + angka1 + " x " + angka3 + " + " + angka2 + " = " + hasilFloat2);

        long d = 4;
        long a = 1;
        long v = 22;
        long i = 9;

        long hasil;

        hasil = d + a + v + i + d;
        System.out.println("David kalau dijumlahkan yaitu " + hasil);

        hasil = d - a - v - i - d;
        System.out.println("David kalau dikurangkan yaitu " + hasil);

        hasil = d * a * v * i * d;
        System.out.println("David kalau dikalikan yaitu " + hasil);

        hasil = d / a / v / i / d;
        System.out.println("David kalau dibagikan yaitu " + hasil);

        hasil = d % a % v % i % d;
        System.out.println("David kalau dimoduluskan " + hasil);

        int g = 5;
        int e = 9;
        int b = 3;
        int t = 8;
        int u = 1;
        int n = 6;

        int hasilInteger;

        hasilInteger = g + e + b + e + t + u + n;
        System.out.println("Gebetan kalau dijumlahkan " + hasilInteger);

        hasilInteger = g * e * b * e * t * u * n;
        System.out.println("Gebetan kalau dikalikan " + hasilInteger);

        //Total baris seluruhnya ada 67 baris. Mantap!!!
    }
}
