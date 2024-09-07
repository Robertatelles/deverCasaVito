package animal;

import java.util.List;
import java.util.ArrayList;

public class Cachorro extends AnimalAbs implements AnimalInt<Cachorro> {
    private List<Cachorro> lista = new ArrayList<Cachorro>();
    private String tamanho;

    public Cachorro() {}

    public Cachorro(Long id, String nome, String especie, String dataNascimento, Double peso, String tamanho){
        this.setId(id);
        this.setNome(nome);
        this.setEspecie(especie);
        this.setDataNascimento(dataNascimento);
        this.setPeso(peso);
        this.setTamanho(tamanho);
    }

    @Override
    public void criar(Cachorro animal) {
        System.out.println("Especie:" + animal.getEspecie());
        this.lista.add(animal);
    }

    @Override
    public void modificar(Cachorro animal) {
        for(int i=0; i<this.lista.size(); i++) {
            if(this.lista.get(i).getId().equals(animal.getId())){
                this.lista.get(i).setEspecie(animal.getEspecie());
                this.lista.get(i).setDataNascimento(animal.getDataNascimento());
                this.lista.get(i).setNome(animal.getNome());
                this.lista.get(i).setPeso(animal.getPeso());
                this.lista.get(i).setTamanho(animal.getTamanho());
                break;
            }
        }
    }

    @Override
    public void excluir(Long id) {
        for(int i=0; i<this.lista.size(); i++) {
            if(this.lista.get(i).getId().equals(id)) {
                this.lista.remove(i);
                break;
            }
        }
    }

    @Override
    public List<Cachorro> listar() {
        return this.lista;
    }
    @Override
    public Cachorro buscar(long id) {
        for(int i=0; i<this.lista.size(); i++) {
            if(this.lista.get(i).getId().equals(id)) {
                return this.lista.get(i);
            }
        }
        return null;
    }
    
    public String getTamanho() {
        return tamanho;
    }
    
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}