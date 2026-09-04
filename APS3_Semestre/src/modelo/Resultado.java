package modelo;

public class Resultado extends AbsPropriedades {

    // Construtor vazio - nao precisa receber nada
    public Resultado() {
    }

    @Override
    public void Executar() {
        // StringBuilder serve pra montar o relatorio inteiro em pedacos
        StringBuilder relatorio = new StringBuilder();

        // ===== Cabecalho do relatorio =====
        relatorio.append("=== RELATORIO DO TOTEM ===\n");
        relatorio.append("Total de visitantes: ")
                 .append(Estaticos.TODOS_VISITANTES.size())
                 .append("\n\n");

        // ===== Seccao dos maiores de idade =====
        // Chama o metodo auxiliar passando true (faixa >= 18)
        relatorio.append("--- MAIORES DE IDADE (>= 18) ---\n");
        relatorio.append(calcularPorFaixa(true));

        // ===== Seccao dos menores de idade =====
        // Chama o metodo auxiliar passando false (faixa < 18)
        relatorio.append("\n--- MENORES DE IDADE (< 18) ---\n");
        relatorio.append(calcularPorFaixa(false));

        // Salva o relatorio completo na variavel global pra a tela exibir
        Estaticos.MENSAGEM = relatorio.toString();
    }

    /**
     * Calcula os percentuais de uma faixa etaria especifica.
     * @param maioresDeIdade true = >=18 anos, false = <18 anos
     * @return texto formatado com os percentuais de cada pergunta
     */
    private String calcularPorFaixa(boolean maioresDeIdade) {
        StringBuilder sb = new StringBuilder();

        // ===== ETAPA 1: Conta quantos visitantes estao nesta faixa =====
        int total = 0;
        for (Visitante v : Estaticos.TODOS_VISITANTES) {
            // Operador ternario: define o filtro conforme o parametro
            boolean entra = maioresDeIdade ? v.idade >= 18 : v.idade < 18;
            if (entra) {
                total++;
            }
        }

        // Mostra o total no relatorio
        sb.append("Visitantes nesta faixa: ").append(total).append("\n");

        // ===== ETAPA 2: Se nao tem ninguem, evita divisao por zero =====
        if (total == 0) {
            sb.append("(sem dados)\n");
            return sb.toString();
        }

        // ===== ETAPA 3: Loop pelas 5 perguntas =====
        for (int p = 0; p < 5; p++) {
            // Contadores zerados pra cada pergunta
            int ruim = 0;
            int bom = 0;
            int excelente = 0;

            // ETAPA 4: Conta as respostas desta pergunta entre os visitantes da faixa
            for (Visitante v : Estaticos.TODOS_VISITANTES) {
                boolean entra = maioresDeIdade ? v.idade >= 18 : v.idade < 18;
                if (entra) {
                    if (v.respostas[p] == 1) ruim++;        // 1 = Ruim
                    else if (v.respostas[p] == 2) bom++;    // 2 = Bom
                    else if (v.respostas[p] == 3) excelente++;  // 3 = Excelente
                }
            }

            // ETAPA 5: Calcula os percentuais
            // Multiplica por 100.0 (com .0!) pra forcar resultado decimal
            double percentRuim = (ruim * 100.0) / total;
            double percentBom = (bom * 100.0) / total;
            double percentExcelente = (excelente * 100.0) / total;

            // ETAPA 6: Adiciona o resultado da pergunta no texto
            // p + 1 pra mostrar Pergunta 1, 2, 3... (em vez de 0, 1, 2)
            sb.append("\nPergunta ").append(p + 1).append(":\n");
            sb.append("  Ruim:      ").append(String.format("%.1f", percentRuim)).append("%\n");
            sb.append("  Bom:       ").append(String.format("%.1f", percentBom)).append("%\n");
            sb.append("  Excelente: ").append(String.format("%.1f", percentExcelente)).append("%\n");
        }

        // Retorna o texto com todos os calculos da faixa
        return sb.toString();
    }
}