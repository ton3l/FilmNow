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

    @Override
    public String toString() {
        return nome + ", " + ano + "\n" + local;
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
