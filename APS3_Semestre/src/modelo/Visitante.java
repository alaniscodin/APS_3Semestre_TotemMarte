package modelo;

public class Visitante extends AbsPropriedades {

    // Construtor: recebe nome, idade e respostas já validados
    public Visitante(String nome, int idade, int[] respostas) {
        super(nome, idade);                  // chama o construtor cheio de AbsPropriedades
        this.respostas = respostas;          // 'respostas' é herdado de AbsPropriedades
    }

    @Override
    public void Executar() {
        // O "trabalho" do Visitante é se cadastrar na lista de todos os visitantes
        Estaticos.TODOS_VISITANTES.add(this);
    }
}