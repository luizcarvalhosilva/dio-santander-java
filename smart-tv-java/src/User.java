public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("A Tv está ligada? " + smartTv.start);
        System.out.println("O canal atual é: " + smartTv.channel);
        System.out.println("Volume: " + smartTv.volume);
    }
}
