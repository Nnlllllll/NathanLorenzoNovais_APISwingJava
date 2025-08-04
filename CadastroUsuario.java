import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CadastroUsuario {
    public static void main(String[] args) {
        // Criação do frame
        JFrame frame = new JFrame("Site");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        // Rótulos
        JLabel labelNome = new JLabel("Nome:");
        JLabel labelSobrenome = new JLabel("Sobrenome:");
        // Campos de texto
        JTextField campoNome = new JTextField(10);
        JTextField campoSobrenome = new JTextField(10);
        // Botão
        JButton botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nomeCompleto = campoNome.getText() + " " + campoSobrenome.getText();
                if((nomeCompleto.isEmpty())){
                    JOptionPane.showMessageDialog(frame, "Preencha os campos corretamente");
                    return;
                }
                     JOptionPane.showMessageDialog(frame, "Usuário, " + nomeCompleto + " Cadastrado!");   
                
            
            }
        });
        // Adicionando componentes ao frame
        frame.add(labelNome);
        frame.add(campoNome);
        frame.add(labelSobrenome);
        frame.add(campoSobrenome);
        frame.add(botaoCadastrar);
        // Exibir a janela
        frame.setVisible(true);
    }
}