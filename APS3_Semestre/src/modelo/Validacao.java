package modelo;

public class Validacao extends AbsPropriedades {

    // Campos próprios pra guardar dados crus (ainda não validados)
    private String nomeStr;
    private String idadeStr;
    private int quantidade;
    private boolean ehCadastro;   // true = valida cadastro, false = valida métricas

    // Construtor 1: validação do cadastro (nome e idade como texto)
    public Validacao(String nome, String idade) {
        this.nomeStr = nome;
        this.idadeStr = idade;
        this.ehCadastro = true;
    }

    // Construtor 2: validação das métricas (quantas perguntas devem estar respondidas)
    public Validacao(int quantidade) {
        this.quantidade = quantidade;
        this.ehCadastro = false;
    }

    @Override
    public void Executar() {
        // Sempre zera a mensagem antes de começar
        Estaticos.MENSAGEM = "";

        if (ehCadastro) {
            // ===== Validação do cadastro =====

            // 1) Nome não pode ser vazio
            if (nomeStr.equals("")) {
                Estaticos.MENSAGEM = "Nome não pode ser vazio";
                return;
            }
            
            // Verifica se o nome tem algum numero
            for (int i = 0; i < nomeStr.length(); i++) {
                 if (Character.isDigit(nomeStr.charAt(i))) {
                Estaticos.MENSAGEM = "Nome não pode conter números";
                return;
                }
            }
            
            // 2) Idade não pode ser vazia
            if (idadeStr.equals("")) {
                Estaticos.MENSAGEM = "Idade não pode ser vazia";
                return;
            }

            // 3) Idade precisa ser um número
            int idadeNum;
            try {
                idadeNum = Integer.parseInt(idadeStr);
            } catch (NumberFormatException e) {
                Estaticos.MENSAGEM = "Idade precisa ser um número";
                return;
            }

            // 4) Idade entre 1 e 120
            if (idadeNum < 1 || idadeNum > 120) {
                Estaticos.MENSAGEM = "Idade deve estar entre 1 e 120";
                return;
            }

            // Tudo OK: salva nos Estaticos
            Estaticos.NOME = nomeStr;
            Estaticos.IDADE = idadeNum;

        } else {
            // ===== Validação das métricas =====
            // Confere se as primeiras N respostas estão preenchidas (não zero)
            for (int i = 0; i < quantidade; i++) {
                if (Estaticos.RESPOSTAS[i] == 0) {
                    Estaticos.MENSAGEM = "Responda todas as perguntas antes de avançar";
                    return;
                }
            }
        }
    }
}