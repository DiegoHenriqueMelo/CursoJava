package edu.diego.cap1.Metodos;

public class Usuario {
    public static void main (String [] args ) throws Exception{
        SmartTv smartTv = new SmartTv();

        System.out.print("A TV está ligada? " + smartTv.ligada);
        System.out.print("Canal atual? " + smartTv.canal);
        System.out.print("Voluem atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.print("A TV está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.print("A TV está ligada? " + smartTv.ligada);
        smartTv.diminuirVolume();
        System.out.print("Voluem atual? " + smartTv.volume);

        smartTv.mudarCanal(12);
        System.out.print("Canal atual? " + smartTv.canal);


    }
}
