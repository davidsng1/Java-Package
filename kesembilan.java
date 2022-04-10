public class kesembilan {

    public static void main(String[] args){

        //mempelajari operator logika

        boolean a,b,c;

        //Tanda OR (||)
        System.out.println("----OR----");
        a = false;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);

        a = true;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);

        a = false;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);

        a = true;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);


         //Tanda AND (&&)
         System.out.println("----AND----");
         a = false;
         b = false;
         c = (a && b);
         System.out.println(a + " && " + b + " = " + c);
 
         a = true;
         b = false;
         c = (a && b);
         System.out.println(a + " && " + b + " = " + c);
 
         a = false;
         b = true;
         c = (a && b);
         System.out.println(a + " && " + b + " = " + c);
 
         a = true;
         b = true;
         c = (a && b);
         System.out.println(a + " && " + b + " = " + c);

          //Tanda XOR (^)
        System.out.println("----XOR----");
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        // Tanda Negasi (!)
        System.out.println("----Negasi----");
        a = false;
        b = !a;
        System.out.println(a + " --> ! = " + b);

        a = true;
        b = !a;
        System.out.println(a + " --> ! = " + b);
    }

    
}
