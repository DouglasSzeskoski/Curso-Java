import br.com.devflix.gui.*;
import br.com.devflix.gui.botoes.*;
import br.com.devflix.videos.*;

public class App {
    public static void main(String[] args) throws Exception {
       
        Filme filme = new Filme();       
        Novela novela = new Novela();
        Documentario documentario = new Documentario();
        Serie serie = new Serie();
        Anime anime = new Anime();

        Janela janelinha = new Janela();
        MiniaturaVideo miniaturaVideo = new MiniaturaVideo();

        BotaoPause botaoPause = new BotaoPause();
        BotaoPlay botaoPlay = new BotaoPlay();
        BotaoVoltar botaoVoltar = new BotaoVoltar();

    }
}
