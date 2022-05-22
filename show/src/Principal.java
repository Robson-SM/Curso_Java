public class Principal {
    public static void main(String[] args) {
        Show show = new Show(new Artista("Michael Jackson", 10000));
        System.out.println(show.artista.nome);

    }


}
