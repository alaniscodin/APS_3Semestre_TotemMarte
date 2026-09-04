package modelo;

public class Controle extends AbsPropriedades {

    // Construtor vazio
    public Controle() {
    }

    // Chamado pelo frmCadastro: valida e salva nome/idade nos Estaticos
    public void CadastrarVisitante(String nome, String idade) {
        new Validacao(nome, idade).Executar();
    }

    // Chamado pelas frmMetrica: registra uma resposta
    public void RegistrarResposta(int pergunta, int valor) {
        Estaticos.RESPOSTAS[pergunta] = valor;
    }

    // Chamado pelas frmMetrica: valida se respondeu tudo até a quantidade pedida
    public void ValidarMetricas(int quantidade) {
        new Validacao(quantidade).Executar();
    }

    // Chamado antes de abrir frmResultado: cria Visitante final e reseta dados
    public void FinalizarVisitante() {
        int[] respostasCopia = Estaticos.RESPOSTAS.clone();
        Visitante v = new Visitante(Estaticos.NOME, Estaticos.IDADE, respostasCopia);
        v.Executar();
        Estaticos.resetarVisitanteAtual();
    }

    // Chamado pelo frmResultado: dispara o cálculo das estatísticas
    public void CalcularResultado() {
        new Resultado().Executar();
    }

    @Override
    public void Executar() {
        // Ação padrão (genérica) — finaliza o visitante
        FinalizarVisitante();
    }
}