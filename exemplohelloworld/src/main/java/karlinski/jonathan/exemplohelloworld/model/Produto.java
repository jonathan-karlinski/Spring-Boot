package karlinski.jonathan.exemplohelloworld.model;

/**
 * @author Jonathan Karlinski
 * @since 15/04/20
 * @version 1.0
 */
public class Produto {

    private String descricao;

    /**
     * @author Jonathan Karlinski
     * @since 15/04/20
     * @version 1.0
     */
    public Produto(String descricao) {
        this.descricao = descricao;
    }

    public Produto() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Descricao: " + descricao;
    }
}
