
package modelo;

//Essa classe é abstrata — não dá pra criar um objeto dela direto. Ela serve só de base pra outras classes herdarem.

public abstract class AbsPropriedades implements intMetodos
//Ela implementa a interface intMetodos, mas como é abstrata, não precisa escrever o Executar agora — quem herdar dela vai escrever.
{
    protected String nome;
    protected int idade;
    protected int[] respostas;
    protected String mensagem; 
    
//Tem 2 construtores: um cheio (com nome e idade) pro Visitante usar, e um vazio pra Validacao e outras classes que não recebem esses dados no construtor.
    
    public AbsPropriedades(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
     public AbsPropriedades() {
    }
     
     public String getMensagem() {
        return mensagem;
    }
     @Override
    public String toString() {
        return "Nome: " + nome + " | Idade: " + idade;
    }

//Esse método é abstrato — força toda classe filha a ter sua própria versão do Executar. É a obrigação que vem da interface intMetodos.    
    @Override
    public abstract void Executar();
}
