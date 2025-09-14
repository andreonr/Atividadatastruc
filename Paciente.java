public class Paciente {

    private static int contadorId = 1;

    private int id;
    private String nome;
    private int idade;
    private String sintoma;

    /**
     * @param nome O nome do paciente.
     * @param idade A idade do paciente.
     * @param sintoma A descrição do sintoma do paciente.
     */
    public Paciente(String nome, int idade, String sintoma) {
        this.id = contadorId++;
        this.nome = nome;
        this.idade = idade;
        this.sintoma = sintoma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    /** @return Dados formatados do paciente.
     */
    public String mostraraInfo() {
        return String.format("ID: %d | Nome: %s | Idade: %d | Sintoma: %s",
                this.id, this.nome, this.idade, this.sintoma);
    }
}