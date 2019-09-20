package usalampada;

public class Lampada {
    private boolean Status;
    public void Ligar(){
        this.Status = true;
    }
    public void Desligar(){
        this.Status = false;
    }
    public String Observar(){
        if(Status){
            return "A lâmpada está ligada.";
        }
        else{
            return "A lâmpada está desligada.";
        }
    }
}
