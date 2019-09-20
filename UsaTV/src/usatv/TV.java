package usatv;

public class TV {
    private boolean Ligado;
    private int Canal;
    private int Volume;
    
    public String Ligar(){
        this.Ligado = true;
        return "Você ligou a TV!";
    }
    public String Desligar(){
        this.Ligado = false;
        return "Você desligou a TV!";
    }
    
    public String AumentarVolume(int volume){
        if(this.Ligado){
        int atual = this.Volume;
        int aumentar = atual += volume;
        if(aumentar <= 100){
            this.Volume = aumentar;
            return "Volume alterado para " + this.Volume;
       }
        else
            return "Volume não pode ultrapassar 100! Valor atual: " + this.Volume;
        }
        else
            return "A TV está desligada!";
    }
    public String DiminuirVolume(int volume){
        if(this.Ligado){
        int atual = this.Volume;
        int diminuir = atual -= volume;
        if(diminuir >= 0){
            this.Volume = diminuir;
            return "Volume alterado para " + this.Volume;
       }
        else
            return "Volume não pode ser menor que 0! Valor atual: " + this.Volume;
        }
        else
            return "A TV está desligada!";
    }
    
    public String TrocarCanal(int canal){
        if(this.Ligado){
        if(canal <= 999){
            this.Canal = canal;
            return "Canal alterado para " + this.Canal;
       }
        else
            return "Canal não pode ser maior que 999 ou menor que 0! Canal atual: " + this.Canal;
        }
        else
            return "A TV está desligada!";
    }
    
    public String Mostrar(){
        if(this.Ligado)
            return "Ligada: " + Ligado + ", Volume: " + Volume + ", Canal: " + Canal;
        else
            return "A TV está desligada!";
    }
}
