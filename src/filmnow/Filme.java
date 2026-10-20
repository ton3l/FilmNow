package filmnow;

import java.util.Objects;

/**
 * Representaçao dos Filmes
 *
 * @author elton-nascimento
 *
 */
public class Filme {
    private String nome;
    private int ano;
    private String local;
    private boolean isHot;

    public Filme(int ano, String nome, String local) {
        this.ano = ano;
        this.nome = nome;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }

    @Override
    public String toString() {
        String str = "";

        if (isHot) str += "\uD83D\uDD25 ";
        str += nome + ", " + ano + "\n" + local;

        return str;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Filme filme)) return false;
        return ano == filme.ano && Objects.equals(nome, filme.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, ano);
    }
}
