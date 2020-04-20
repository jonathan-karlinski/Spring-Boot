package karlinski.jonathan.exemplohelloworld.model;

/**
 * @author Jonathan Karlinski
 * @since 15/04/20
 * @version 1.0
 */
public class Cliente {

    private String nome;

    /**
     * @author Jonathan Karlinski
     * @since 15/04/20
     * @version 1.0
     */
    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome;
    }
}
