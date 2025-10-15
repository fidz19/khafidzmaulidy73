/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarkalkulator;

/**
 *
 * @author User-23
 */
public class Belajarkalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        penjumlahan jumlah = new penjumlahan (5,10,"Hasil Penjumlahan= ");
        pengurangan kurang = new pengurangan (5,10,"Hasil pengurangan= ");
        perkalian kali = new perkalian (5,10,"Hasil perkalian= ");
        pembagian bagi = new pembagian (5,10,"Hasil pembagian= ");
        kuadrat kuadrat = new kuadrat (5,10,"Hasil kuadrat= ");
        akar root = new akar (5,10,"Hasil akar= ");
    }   
}

class penjumlahan {
    public penjumlahan(int a, int b, String keterangan){
        System.out.println(keterangan);
        
        int c;
        c = a+b;
        System.out.println(c);
    }
}

class pengurangan {
    public pengurangan(int a, int b, String keterangan){
        System.out.println(keterangan);
        
        int c;
        c = a-b;
        System.out.println(c);
    }
}

class perkalian {
    public perkalian(int a, int b, String keterangan){
        System.out.println(keterangan);
        
        int c;
        c = a*b;
        System.out.println(c);
    }
}

class pembagian {
    public pembagian(int a, int b, String keterangan){
        System.out.println(keterangan);
        
        int c;
        c = a/b;
        System.out.println(c);
    }
}

class kuadrat {
    public kuadrat(int a, int b, String keterangan){
        System.out.println(keterangan);
        
        int c;
        c = a*a;
        System.out.println(c);
        int d;
        d = b*b;
        System.out.println(d);
    }
}

class akar {
    public akar(int a, int b, String keterangan){
        System.out.println(keterangan);
        
        double c;
        c = Math.sqrt (a);
        System.out.println(c);
        
        double d;
        d = Math.sqrt (b);
        System.out.println(d);
    }
}