
package modelo;

//É uma interface que representa uma lista — uma coleção ordenada de objetos. É só o 'tipo' da variável, não a implementação.
import java.util.ArrayList;
//É uma classe concreta que implementa a interface List. É uma das formas mais comuns de criar uma lista no Java 
//funciona como um array que cresce automaticamente.
import java.util.List;

public class Estaticos {
    //Os campos são static, então existem só uma vez no programa todo (não precisa criar objeto). Qualquer tela acessa direto com Estaticos.NOME.
    
    // Dados do visitante atual (sendo preenchidos)
    public static String NOME = "";
    public static int IDADE = 0;
    
    //Array de 5 posições pra guardar as 5 respostas das perguntas. Começa zerado — quando o usuário responde, eu coloco 1, 2 ou 3 (ruim, bom, excelente).
    public static int[] RESPOSTAS = new int[5];   
    
    // Mensagem de erro da validacao (vazia = OK)
    public static String MENSAGEM = "";

    // Lista que acumula TODOS os visitantes que ja passaram pelo totem na sessao
    public static List<Visitante> TODOS_VISITANTES = new ArrayList<>();

    // Reseta os dados do visitante atual (chamado quando aperta "Fim" no resultado)
    public static void resetarVisitanteAtual() {
        NOME = "";
        IDADE = 0;
        RESPOSTAS = new int[5];
        MENSAGEM = "";
    }
}
