## Aula 1 - Anatomia das Classes

    A escrita de códigos de um programa é feito através da composição de palavras pré-definidas pela linguaguem com as expressões que utilizamos para determinar o nome dos nossos arquivos, classes, atributos e métodos.
    É comum mesclarmos expressões no idioma americano com o nosso vocabulário. Existem projetos que reocmendam que toda a implementação do seu programa seja escrita na língua inglesa.

    ## SINTAXE DE DECLARAÇÃO DE UMA NOVA CLASSE:

     public class MinhaClasse {
        // SEU CÓDIGO AQUI
    }
    
# Aula 2 - Padrão de nomemclatura

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