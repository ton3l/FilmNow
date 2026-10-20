package filmnow;

/**
 * Sistema que mantém os seus filmes prediletos. Podem existir 100 filmes.
 *
 * @author eliane
 *
 */
public class FilmNow {

    private static final int TAMANHO = 100;

    private Filme[] filmes;
    private Filme[] hotlist;

    /**
     * Cria o FilmNow.
     */
    public FilmNow() {
        this.filmes = new Filme[TAMANHO];
        this.hotlist = new Filme[10];
    }

    /**
     * Acessa a lista de filmes mantida.
     * @return O array de filmes.
     */
    public Filme[] getFilmes() {
        return this.filmes.clone();
    }

    /**
     * Acessa os dados de um filme específico.
     * @param posicao Posição do filme no sistema.
     * @return Dados do filme. Null se não há filme na posição.
     */
    public Filme getFilme(int posicao) {
        return filmes[posicao];
    }

    private int getFilmeIndex(Filme filme){
        for (int i = 0; i < filmes.length; i++){
            if (filmes[i] == null) continue;
            if (filmes[i].equals(filme)) return i;
        }

        return -1;
    }

    /**
     * Adiciona um filme em uma posição. Se já existir filme na posição, sobrescreve o anterior.
     * @param posicao Posição do filme.
     * @param nome Nome do filme.
     * @param ano Ano de lançamento do filme.
     * @param local Local onde o filme pode ser assitido.
     */
    public void cadastraFilme(int posicao, String nome, int ano, String local) {
        // TODO: Verificar se filme ja existe
        this.filmes[posicao] = new Filme(ano, nome, local);
    }

    public void atribuirHot(int posicaoFilme, int posicaoHot){
        hotlist[posicaoHot] = filmes[posicaoFilme];
        filmes[posicaoFilme].setHot(true);
    }

    public Filme[] getHotlist() {
        return hotlist;
    }

    public void removerHot(int posicaoHot){
        hotlist[posicaoHot] = null;
        filmes[getFilmeIndex(hotlist[posicaoHot])].setHot(false);
    }
}