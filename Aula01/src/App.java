public class App {
    public static void main(String[] args) throws Exception {
        // Iphone 12, tela de 6.1", 256 gb
        // Galaxy Note 20 Ultra, tela de 6.9", 256gb
        // Xiaomi Mi 11 Pro, tela de 6.81", 128gb

        // DECLARANDO OBJETO, instanciando objeto
        Celular celularA = new Celular ();
        
        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 256;
        celularA.sistemaOpercional = "IOS";

        Celular celularB = new Celular ();

        celularB.nome = "Galaxy Note 20 Ultra";
        celularB.tamanhoTela = 6.9f;
        celularB.espacoArmazenamento = 256;
        celularB.sistemaOpercional = "Android";

        Celular celularC = new Celular ();

        celularC.nome = " Xiaomi Mi 11 Pro";
        celularC.tamanhoTela = 6.81f;
        celularC.espacoArmazenamento = 128;
        celularC.sistemaOpercional = "Android";

        System.out.format("Celular %s com tela de %.1f, com %d e SO %s \n", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOpercional);
        System.out.format("Celular %s com tela de %.1f, com %d e SO %s \n", celularB.nome, celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.sistemaOpercional);
        System.out.format("Celular %s com tela de %.1f, com %d e SO %s \n", celularC.nome, celularC.tamanhoTela, celularC.espacoArmazenamento, celularC.sistemaOpercional);
        

    }
}
