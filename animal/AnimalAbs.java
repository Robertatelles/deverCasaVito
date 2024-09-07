package animal;

public abstract class AnimalAbs {
    private Long id;
    private String especie;
    private String nome;
    private Double peso;
    private String dataNascimento;

    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id=id;
    }
    public String getEspecie() {
        return this.especie;
    }
    public void setEspecie (String especie) {
        this.especie=especie;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome=nome;
    }
    public Double getPeso() {
        return this.peso;
    }
    public void setPeso(Double peso) {
        this.peso=peso;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento=dataNascimento;
    }
}
