import javax.swing.*;  // Importa biblioteca Swing para componentes gráficos
import java.awt.*;     // Importa biblioteca para layouts e gerenciamento visual
import java.awt.event.*; // Importa biblioteca para tratamento de eventos

public class CadastroUsuario {
    public static void main(String[] args) {
        // Criação do JFrame: janela principal da aplicação
        JFrame frame = new JFrame("Cadastro de Usuario");
        frame.setSize(1000, 600); // Define tamanho da janela (largura x altura)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha app ao fechar janela
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 250)); // Define layout para organização dos componentes

        // Criação dos rótulos que indicam os campos
        JLabel labelNome = new JLabel("Nome:");
        JLabel labelEmail = new JLabel("Email:");
        JLabel labelIdade = new JLabel("Idade:");

        // Criação dos campos de texto para entrada de dados
        JTextField campoNome = new JTextField(10);  // Campo para nome com largura 10 colunas
        JTextField campoEmail = new JTextField(10); // Campo para email
        JTextField campoIdade = new JTextField(10); // Campo para idade

        // Criação do botão "Cadastrar"
        JButton botaoCadastrar = new JButton("Cadastrar");

        // Adiciona o evento de clique no botão usando ActionListener
        botaoCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtém o texto digitado nos campos
                String nomeNome = campoNome.getText();
                String nomeEmail = campoEmail.getText();
                String numeroIdade = campoIdade.getText();

                // Verifica se algum campo está vazio (isBlank verifica texto vazio ou só espaços)
                if ((nomeNome.isBlank()) || (nomeEmail.isBlank()) || (numeroIdade.isBlank())) {
                    // Exibe mensagem de erro se algum campo não foi preenchido
                    JOptionPane.showMessageDialog(frame, "Preencha os campos corretamente");
                    return;
                } else {
                    // Exibe uma mensagem com os dados cadastrados em uma única caixa de diálogo
                    JOptionPane.showMessageDialog(frame,
                        "Usuário cadastrado:\n" +
                        "Nome: " + nomeNome + "\n" +
                        "Email: " + nomeEmail + "\n" +
                        "Idade: " + numeroIdade);
                    return;
                }
            }
        });

        // Adiciona os componentes na janela na ordem desejada
        frame.add(labelNome);
        frame.add(campoNome);
        frame.add(labelEmail);
        frame.add(campoEmail);
        frame.add(labelIdade);
        frame.add(campoIdade);
        frame.add(botaoCadastrar);

        // Exibe a janela para o usuário
        frame.setVisible(true);
    }
}


