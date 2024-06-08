public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligado);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status ->" + "Tv ligada?" + smartTv.ligado);
        smartTv.desligar();
        System.out.println("Novo Status ->" + "Tv ligada?" + smartTv.ligado);
        System.out.println("Volume Atual: " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Novo volume: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Novo volume: " + smartTv.volume);
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(10);
        System.out.println("Novo Canal: " + smartTv.canal);
    }

}