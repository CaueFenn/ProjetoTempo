/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Tempo {
     private int hora;
    private int minuto;
    private int segundo;

    public Tempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public Tempo(){
        this(0,0,0);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
    public int getTempoSegundos(){
    return (getHora() * 60 * 60 + getMinuto() * 60 + getSegundo());
}
    public void IncrementaHora(){
        int hora = getHora() + 1;
        if(hora > 23){
            hora = 0;
        }
        setHora(hora);
    }
    
    public void IncrementaMinuto(){
        int min = getMinuto() + 1;
        if(min > 59){
            IncrementaHora();
            min = 0;
        }
        setMinuto(min);
    }
    
    public void IncrementaSegundo(){
        int seg = getSegundo() + 1;
        if(segundo > 59){
            seg = 0;
            IncrementaMinuto();
        }
        setSegundo(seg);
    }
    public void DecrementaHora(){
         hora = getHora() - 1;
        if(hora < 0){
            hora = 23;
        }
        setHora(hora);
    }
    
    public void DecrementaMinuto(){
        int min = getMinuto() - 1;
        if(min < 0){
            DecrementaHora();
            min = 59;
        }
        setMinuto(min);
    }
    
    public void DecrementaSegundo(){
        int seg = getSegundo() - 1;
        if(segundo < 0){
            seg = 59;
            DecrementaMinuto();
        }
        setSegundo(seg);
    }
    public String mostrarTempo(){
        String saida = "";
         hora = getHora();
         minuto = getMinuto();
         segundo = getSegundo();
        
    }
}
