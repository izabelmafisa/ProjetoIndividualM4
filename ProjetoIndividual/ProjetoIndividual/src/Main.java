public class Main {
    public static void main(String[] args) {
       Filme nfilme = new Filme ("tim tim","2017","terror",91,"",new String[]{"Mario"},"paulo","pedro");
        System.out.printf(nfilme.getElenco()[0] + nfilme.getTipo() );

       }
}