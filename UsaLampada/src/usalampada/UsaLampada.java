package usalampada;


public class UsaLampada {

    public static void main(String[] args) {
       Lampada lampada1 = new Lampada();
       lampada1.Ligar();
       Lampada lampada2 = new Lampada();
       lampada2.Desligar();
       
       System.out.println(lampada1.Observar());
       System.out.println(lampada2.Observar());
    }
    
}
