public class App {
    public static void main(String[] args) throws Exception {
        
        Personagem heroi = new Personagem();
        heroi.nome = "Hercules";
        heroi.nivel = 2;
        heroi.forca = 16;

        heroi.mostrarStatus();   
        heroi.atacar("Hydra", "Golpe duplo");
        
    
    }
}
