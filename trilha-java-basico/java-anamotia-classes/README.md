## Aula 1 - Anatomia das Classes

    A escrita de códigos de um programa é feito através da composição de palavras pré-definidas pela linguaguem com as expressões que utilizamos para determinar o nome dos nossos arquivos, classes, atributos e métodos.
    É comum mesclarmos expressões no idioma americano com o nosso vocabulário. Existem projetos que reocmendam que toda a implementação do seu programa seja escrita na língua inglesa.

    ## SINTAXE DE DECLARAÇÃO DE UMA NOVA CLASSE:

     public class MinhaClasse {
        // SEU CÓDIGO AQUI
    }
    
## Aula 2 - Padrão de nomemclatura

    Quando se trata de escrever códigos na linguagem Java, é recomendado seguir algumas convenções de escrita. Esses padrões estão expressos nos itens abaixo:

    - Arquivo .java: Todo arquivo .java deve começar com letra MAIÚSCULA.
        Se a palavra for compsota, a segunda palavra deve também ser maiúscula, exemplo:
        Calculadora.java, CalculadoraCientifica.java

    - Nome da classe no arquivo: A classe deve possuir o mesmo nome do arquivo.java, exemplo:

    // arquivo CalculadoraCientifica.java
        public class CalculadoraCientifica {
        
        }

    - Nome de variável: toda variável deve ser escrita com letra minúscula, porém se a palavra for composta, a primeira letra da segunda palavra deverá ser MAIÚSCULA, exemplo: ano e anoFabricacao. O nome dessa prática para nomear variáveis dessa forma se chama "camelCase".

        Existe uma regra adicional para variáveis quando na mesma queremos identificar que ela não sofrerá alteração de valor, exemplo: queremos determinar que uma variável de nome br sempre representará "Brasil" e nunca mudará seu valor, logo, determinamos como escrita o código abaixo:

        Stringr BR = "Brasil"
        double PI = 3.14
        int ESTADOS_BRASILEIRO = 27
        int ANO_2000 = 2000

## Aula 3 - Declarando variáveis e métodos

    Como identificar entre declaração de variáveis e métodos em nosso programa? Existe uma estrutura comum para ambas as finalidades, exemplo:

    # Declarar uma variável em Java segue sempre a seguinte estrutura:

    // Estrutura
    Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)
    // Exemplo:
    int idade = 23;
    double altura = 1.62;
    Dog spike; // observe que aqui a variável spike não tem valor é 

    # Declarando métodos em Java segue uma estrutura bem simples:
    
    // Estrutura
    TipoRetorno NomeOjetivoNoInfinitivo Parametro(s)
    //Exemplo
    int somar (int numeroUm, int numero2);
    
    String formatarCep (long cep);

## Aula 4 - Identação

    Basicamente indentar é um termo utilizado para escrever o código do programa de forma hierárquica, facilitando assim a visualização e o entendimento do programa.
    Abaixo, veja um exemplo de um algoritmo de validação de aprovação de estudante. Em uma aba, temos um código sem identação nenhuma, e na outra, temos o mesmo código seguindo um padrão de identação. Observe como é muito mais fácil entender a hierarquia do código na segunda aba.

    ## Sem identação
    //arquivo BoletimEstudantil.java
    public class BoletimEstudantil{
    public static void main(String [] args) {
    int mediaFinal = 6; 
    if(mediaFinal<6)
    System.out.println("REPROVADO");
    else if(mediaFinal==6)
    System.out.println("PROVA MINERVA");
    else
    System.out.println("APROVADO");
    }
    }

    ## Com identação
    //arquivo BoletimEstudantil.java
    public class BoletimEstudantil{
        public static void main(String [] args) {
         int mediaFinal = 6; 
         if(mediaFinal<6)
            System.out.println("REPROVADO");
         else if(mediaFinal==6)
            System.out.println("PROVA MINERVA");
         else
            System.out.println("APROVADO");
    }
    }

## Aula 5 - Organizando arquivos

    À medida que nosso sistema vai evoluindo, surgem novos arquivos (código fonte) em nossa estrutura de arquivos do projeto. Isso exige que seja realizado uma organização destes arquivos através de pacotes (packages).


