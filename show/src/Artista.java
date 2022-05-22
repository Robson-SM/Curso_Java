public class Artista{
    String nome;
    float cache;

    public Artista() {}

    //construtor que recebe um tipo abstrato
    public Artista (String nome){
      this.nome = nome;

    }
    public Artista (float cache){
       this.cache = cache;

    }

    public Artista (String nome, float cache){
        this.nome = nome;
        this.cache = cache;
    }


    }

