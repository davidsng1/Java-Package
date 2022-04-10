public class kedelapan {

    public static void main(String[] args){
        
        // Operator Komperasi Sama Dengan
        System.out.println("----Sama Dengan----");
        int a,b;
        boolean hasilKomparasi;

        a = 10;
        b = 20;
        hasilKomparasi = (a == b);
        System.out.printf("%d = %d --> %s \n",a,b, hasilKomparasi );
        
        a = 20;
        b = 20;
        hasilKomparasi = (a == b);
        System.out.printf("%d = %d --> %s \n",a,b, hasilKomparasi );

        // operator Komperasi Tidak Sama Dengan
        System.out.println("----Tidak Sama Dengan----");

        a = 10;
        b = 20;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n",a,b, hasilKomparasi );
        
        a = 20;
        b = 20;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n",a,b, hasilKomparasi );

        // operator Komperasi Kecil Dari
        System.out.println("----Kecil Dari----");

        a = 10;
        b = 20;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n",a,b, hasilKomparasi );
        
        a = 21;
        b = 20;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n",a,b, hasilKomparasi );

        // operator Komperasi Besar Dari
        System.out.println("----Besar Dari----");

        a = 10;
        b = 20;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n",a,b, hasilKomparasi );
        
        a = 21;
        b = 20;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n",a,b, hasilKomparasi );
        
    }
}