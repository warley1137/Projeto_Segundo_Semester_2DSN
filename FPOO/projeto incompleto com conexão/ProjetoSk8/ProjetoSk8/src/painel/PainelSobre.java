package painel;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.text.DefaultCaret;

public class PainelSobre extends JPanel {
    public PainelSobre() {
        setLayout(null);

        JTextArea sobreText = new JTextArea(
                " Bem-vindo à SK8 Toony!\n\n" +
                        " Sobre a SK8 Toony:\n" +
                        " A SK8 Toony é a sua loja de skate preferida, onde a paixão pelo skate se encontra com a " +
                        "\n qualidade e a diversão. Nossa loja tem sido um destino de referência para skatistas de " +
                        "\n todas as idades e níveis de habilidade. Estamos comprometidos em fornecer tudo o que " +
                        "\n você precisa para se divertir e se destacar no mundo do skate.\n\n" +
                        " Nossa Missão:\n" +
                        " Na SK8 Toony, nossa missão é apoiar e promover a cultura do skate. Acreditamos que " +
                        "\n o skate não é apenas um esporte, mas também uma forma de expressão artística e " +
                        "\n uma comunidade unida por uma paixão compartilhada. Trabalhamos incansavelmente " +
                        "\n para oferecer produtos de alta qualidade, desde shapes personalizados e rolamentos " +
                        "\n de precisão, para que você possa se destacar nas ruas e nas pistas.\n\n" +
                        " O Que Oferecemos:\n" +
                        "  - Uma ampla seleção de shapes, rodas, trucks e lixas das melhores marcas do mercado.\n" +
                        "  - Rolamentos de alta performance para um deslize suave e preciso.\n" +
                        "  - Atendimento experiente e amigável para ajudá-lo a fazer as escolhas certas.\n\n" +
                        " Comunidade SK8 Toony:\n" +
                        " Na SK8 Toony, acreditamos na construção de uma comunidade de skatistas apaixonados. " +
                        "\n Mantemos eventos regulares, competições e sessões de skate para reunir os entusiastas " +
                        "\n e fortalecer os laços entre os membros da comunidade. Nossos instrutores experientes " +
                        "\n também oferecem aulas para todos os níveis, desde iniciantes até skatistas mais avançados."
        );


        Font fonte = new Font("Arial", Font.PLAIN, 16);
        sobreText.setFont(fonte);
        JScrollPane scrollPane = new JScrollPane(sobreText);
        scrollPane.setBounds(10, 10, 780, 580);
        add(scrollPane);
    }
}

