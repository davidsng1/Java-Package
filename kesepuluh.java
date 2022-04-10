public class kesepuluh {

    public static void main(String[] args){

        // Operator Bitwise

        byte a = 5;
        byte b,c;
        String a_bits,b_bits,c_bits;
        
        //Operator Shift Left
        System.out.println("===SHIFT LEFT===");
        a_bits = String.format("%8s", Integer.toBinaryString(a));
        System.out.printf(" %s = %d \n ",a_bits,a);
        b = (byte)(a << 1);
        b_bits = String.format("%8s", Integer.toBinaryString(b));
        System.out.printf(" %s = %d \n ", b_bits,b);

        //Operator Shift Right
        System.out.println("===SHIFT RIGHT===");
        a_bits = String.format("%8s", Integer.toBinaryString(a));
        System.out.printf(" %s = %d \n ",a_bits,a);
        b = (byte)(a >> 1);
        b_bits = String.format("%8s", Integer.toBinaryString(b));
        System.out.printf(" %s = %d \n ", b_bits,b);

        //Operator OR
        System.out.println("===OR===");
        a = 12;
        a_bits = String.format("%8s", Integer.toBinaryString(a));
        System.out.printf(" %s = %d \n ",a_bits,a);
        b = 10;
        b_bits = String.format("%8s", Integer.toBinaryString(b));
        System.out.printf(" %s = %d \n ", b_bits,b);
        c = (byte)(a | b);
        c_bits = String.format("%8s", Integer.toBinaryString(c));
        System.out.printf(" %s = %d \n ",c_bits,c);

        //Operator AND
        System.out.println("===AND===");
        a = 12;
        a_bits = String.format("%8s", Integer.toBinaryString(a));
        System.out.printf(" %s = %d \n ",a_bits,a);
        b = 10;
        b_bits = String.format("%8s", Integer.toBinaryString(b));
        System.out.printf(" %s = %d \n ", b_bits,b);
        c = (byte)(a & b);
        c_bits = String.format("%8s", Integer.toBinaryString(c));
        System.out.printf(" %s = %d \n ",c_bits,c);

        //Operator XOR
        System.out.println("===XOR===");
        a = 12;
        a_bits = String.format("%8s", Integer.toBinaryString(a));
        System.out.printf(" %s = %d \n ",a_bits,a);
        b = 10;
        b_bits = String.format("%8s", Integer.toBinaryString(b));
        System.out.printf(" %s = %d \n ", b_bits,b);
        c = (byte)(a ^ b);
        c_bits = String.format("%8s", Integer.toBinaryString(c));
        System.out.printf(" %s = %d \n ",c_bits,c);
    }
    
}
