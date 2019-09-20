package usatv;

public class UsaTV {

    public static void main(String[] args) {
        TV tv1 = new TV();
        System.out.println(tv1.Ligar());
        System.out.println(tv1.AumentarVolume(19));
        System.out.println(tv1.TrocarCanal(300));
        System.out.println(tv1.Mostrar());
        System.out.println(tv1.DiminuirVolume(4));
        System.out.println(tv1.TrocarCanal(250));
        System.out.println(tv1.Mostrar());
        System.out.println(tv1.Desligar());
        
        System.out.println(tv1.TrocarCanal(101));
    }
    
}
