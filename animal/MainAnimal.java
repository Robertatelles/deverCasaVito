package animal;

public class MainAnimal {
    public static void main(String[] args) {
      /*  Cachorro c = new Cachorro();
        c.setEspecie("Cachorro");
        c.criar(c);*/
        
        Gato g = new Gato();
        Gato g1 = new Gato(1L, "Siamés", "Miau", "10/12/2023", 2.3, "amarelo");
        Gato g2 = new Gato(2L, "Persa", "Mimi", "08/06/2022", 2.5,"caramelo");
        Gato g3 = new Gato(3L, "Ragdoll", "Lili", "24/05/2019", 3.0,"malhada");
        g.criar(g1);
        g.criar(g2);
        g.criar(g3);
        for (Gato item : g.listar()) {
            System.out
                    .println("Id: " + item.getId() + " - Espécie: " + item.getEspecie() + " - Nome: " + item.getNome()
                            + " = Data nascimento: " + item.getDataNascimento() + " - Peso: " + item.getPeso() + " - Cor: " + item.getCor());
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("Excluir o gato de id igual a 2");
        g.excluir(2L);
        for (Gato item : g.listar()) {
            System.out
            .println("Id: " + item.getId() + " - Espécie: " + item.getEspecie() + " - Nome: " + item.getNome()
            + " = Data nascimento: " + item.getDataNascimento() + " - Peso: " + item.getPeso() + " - Cor: " + item.getCor());
        }
        if (g.buscar(3l) == null)
            System.out.println("Gato não encontrado");
        if (g.buscar(5L) == null)
            System.out.println("Gato não encontrado");
        else {
            System.out.println("Gato não encontrado");
        }
        System.out.println("____________________________________________________________________________________________");
        Cachorro c = new Cachorro();
        Cachorro c1 = new Cachorro(1L, "Mel", "Poodle", "02/06/2011", 3.5, "pequeno");
        Cachorro c2 = new Cachorro(2L, "Taigra", "FilaBrasileiro", "08/06/2021", 20.0,"grande");
        Cachorro c3 = new Cachorro(3L, "Nuno", "Buldogue", "24/05/2015", 8.0,"médio");
        c.criar(c1);
        c.criar(c2);
        c.criar(c3);
        for (Cachorro item : c.listar()) {
            System.out
                    .println("Id: " + item.getId() + " - Espécie: " + item.getEspecie() + " - Nome: " + item.getNome()
                            + " = Data nascimento: " + item.getDataNascimento() + " - Peso: " + item.getPeso() + " - Tamanho: " + item.getTamanho());
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("Excluir o Cachorro de id igual a 2");
        c.excluir(2L);
        for (Cachorro item : c.listar()) {
            System.out
            .println("Id: " + item.getId() + " - Espécie: " + item.getEspecie() + " - Nome: " + item.getNome()
            + " = Data nascimento: " + item.getDataNascimento() + " - Peso: " + item.getPeso() + " - Tamanho: " + item.getTamanho());
        }
        if (c.buscar(3l) == null)
            System.out.println("Cachorro não encontrado");
        if (c.buscar(5L) == null)
            System.out.println("Cachorro não encontrado");
        else {
            System.out.println("Cachorro não encontrado");
        }
    }

}
