// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
        
        
        
        System.out.println("Radha food park");
        System.out.println("hyderbad");
        System.out.println("91+ 7207035395");

        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("items"+"\t\t "+ "price"+" \t   " + "quantity"+" \t       " + "total");
        
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        
        String p1 = "chiken";
        String p2 = "briyani";
        String p3 = "fish";
        String p4 = "drinks";
        String p5 = "ice cream";
        
        double p1_price = 300;
        double p2_price = 399;
        double p3_price = 200;
        double p4_price = 234;
        double p5_price = 355;
        
        int p1_qnt = 2;
        int p2_qnt = 3;
        int p3_qnt = 4;
        int p4_qnt = 3;
        int p5_qnt = 2;
        
        double p1_total = p1_price * p1_qnt;
        double p2_total = p2_price * p2_qnt;
        double p3_total = p3_price * p3_qnt;
        double p4_total = p4_price * p4_qnt;
        double p5_total = p5_price * p5_qnt;
          
        System.out.println(p1 + "\t\t" + p1_price + "\t\t" + p1_qnt + "\t\t" + p1_total);
        System.out.println(p2 + "\t\t" + p2_price + "\t\t" + p2_qnt + "\t\t" + p2_total);
        System.out.println(p3 + "\t\t" + p3_price + "\t\t" + p3_qnt + "\t\t" + p3_total);
        System.out.println(p4 + "\t\t" + p4_price + "\t\t" + p4_qnt + "\t\t" + p4_total);
        System.out.println(p5 + "\t" + p5_price + "\t\t" + p5_qnt + "\t\t" + p5_total);
         System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        
        // total price 
        
        double total_price = p1_total+p2_total+p3_total+p4_total+p5_total;
        System.out.println("price" +" \t\t\t\t\t        " +total_price);
        // tax section
        
         double cgst = 9.0 / 100 * total_price;
         double sgst = 9.0/100* total_price;
         double total_tax = cgst+sgst ;
         
        System.out.println("CGST (9%)" +" \t\t\t\t\t" +cgst);
        System.out.println("SGST (9%)" +" \t\t\t\t\t" +sgst);
        System.out.println("tax (18%)" +" \t\t\t\t\t" +total_tax);
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("final price" +" \t\t\t\t\t"+(total_price + total_tax));
        
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"); 
        System.out.println( "\t\t\t"+" thank you visti again");
        
    }
}