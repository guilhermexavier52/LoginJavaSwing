package telaLogin;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPerfil extends JFrame implements ActionListener {
    // Declaração dos componentes
    private JLabel lblUsuario, lblSenha, lblMensagem;
    private JTextField txtUsuario;
    private JPasswordField txtSenha;
    private JButton btnEntrar, btnSair;

    // Construtor
    public LoginPerfil() {
        // Configuração da janela
        super("Tela de LoginPerfil");
        getContentPane().setBackground(Color.CYAN);
        this.setSize(400, 300);
        getContentPane().setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Instanciação dos componentes
        lblUsuario = new JLabel("Usuário:");
        lblUsuario.setBounds(155, 43, 100, 25);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(90, 66, 200, 25);

        lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(155, 90, 100, 25);

        txtSenha = new JPasswordField();
        txtSenha.setBounds(90, 115, 200, 25);

        btnEntrar = new JButton("Entrar");
        btnEntrar.setBackground(SystemColor.activeCaption);
        btnEntrar.setBounds(90, 150, 90, 25);
        btnEntrar.addActionListener(this);

        btnSair = new JButton("Sair");
        btnSair.setBackground(SystemColor.activeCaption);
        btnSair.setBounds(190, 150, 100, 25);
        btnSair.addActionListener(this);

        lblMensagem = new JLabel("");
        lblMensagem.setBounds(50, 200, 300, 25);

        // Adicionando os componentes na janela
        getContentPane().add(lblUsuario);
        getContentPane().add(txtUsuario);
        getContentPane().add(lblSenha);
        getContentPane().add(txtSenha);
        getContentPane().add(btnEntrar);
        getContentPane().add(btnSair);
        getContentPane().add(lblMensagem);
    }

    // Método que verifica o login
    private void verificaLoginPerfil() {
        String usuario = txtUsuario.getText();
        String senha = new String(txtSenha.getPassword());

        // Verificando se o usuário é um administrador
        if (usuario.equals("admin") && senha.equals("123")) {
            lblMensagem.setText("Seja bem-vindo, administrador!");
            lblMensagem.setForeground(Color.BLUE);
        }
        // Verificando se o usuário é um usuário comum
        else if (usuario.equals("user") && senha.equals("123")) {
            lblMensagem.setText("Seja bem-vindo!");
            lblMensagem.setForeground(Color.BLUE);
        }
        // Caso as credenciais estejam incorretas
        else {
            lblMensagem.setText("Usuário ou senha incorretos!");
            lblMensagem.setForeground(Color.RED);
        }
    }

    // Método que trata os eventos dos botões
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnEntrar) {
            verificaLoginPerfil();
        } else if (e.getSource() == btnSair) {
            System.exit(0);
        }
    }  

    // Método principal
    public static void main(String[] args) {
        LoginPerfil janela = new LoginPerfil();
        janela.setVisible(true);
  
}
}