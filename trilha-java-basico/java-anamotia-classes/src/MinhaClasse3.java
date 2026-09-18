public class MinhaClasse3 {
    public static void main(String[] args) {
        String meuNome = "Rubens";
        // Tipo nomeBemDefinido = valor;
        int anoFabricacao = 2026;

        boolean verdadeira = true; // boolean verdadeira ou falsa

        anoFabricacao = 2018; // Alterando o valor da variável

        String primeiroNome = "Rubens";
        String segundoNome = "Barboza";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
        System.out.println(nomeCompleto);

    }
        // Criando método que recebe dois parâmetros e retorna um valor
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    
    
    }
}