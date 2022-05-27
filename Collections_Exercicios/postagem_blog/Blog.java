

import java.util.*;

public class Blog {
   private List<Post> postagens;

    public Blog() {
        this.postagens = new ArrayList<>();
    }

    public void adicionarPostagem (Post postagem) throws IllegalArgumentException {
        for(Post post: postagens){
            if (postagem.getAutor().equals(post.getAutor()) && postagem.getTitulo().equals(post.getTitulo())) {
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
        postagens.add(postagem);
   }

   public Set<Autor> obterTodosAutores(){
        Set<Autor> autores = new TreeSet<>();
       for (Post post : postagens) {
               autores.add(post.getAutor());
       }
       return autores;
   }

   public Map<Categorias, Integer> obterContagemPorCategoria(){
        Map<Categorias, Integer> contagem = new TreeMap<>();

       for (Post post : postagens) {
           if (contagem.containsKey(post.getCategoria())){
               contagem.put(post.getCategoria(), contagem.get(post.getCategoria()) + 1);
           } else {
               contagem.put(post.getCategoria(), 1);
           }
       }
        return contagem;
    }

    public Set<Post> obterPostsPorAutor(Autor autor){
        Set<Post> posts = new TreeSet<>();

        for (Post post: postagens){
            if(post.getAutor().equals(autor)){
                posts.add(post);
            }
        }
        return posts;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria){
        Set<Post> posts = new TreeSet<>();

        for (Post post :postagens) {
            if(post.getCategoria().equals(categoria)){
                posts.add(post);
            }
        }
        return posts;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias(){
        Map<Categorias, Set<Post>> categorias = new TreeMap<>();

        for(Post post : postagens){
            if(!categorias.containsKey(post.getCategoria())){
                categorias.put(post.getCategoria(),obterPostsPorCategoria(post.getCategoria()));
            }
        }
        return categorias;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor(){
        Map<Autor, Set<Post>> autores = new TreeMap<>();

        for (Post post: postagens){
            if(!autores.containsKey(post.getAutor())){
                autores.put(post.getAutor(), obterPostsPorAutor(post.getAutor() ));
            }
        }
        return autores;
    }
}
