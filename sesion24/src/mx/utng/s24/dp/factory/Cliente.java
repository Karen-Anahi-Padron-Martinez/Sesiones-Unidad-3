package mx.utng.s24.dp.factory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Declarar un JFramw que crea JFrame(Ventana basica)
public class Cliente extends JFrame{

    //Declaro dos elementos de formulario
    private JTextField txtUsuario;
    private JPasswordField txtPassword;

    //Creando los elementos de inicio de la ventana
    public Cliente() {
        //Llamo al constructor  de JFrame colocandole un titulo
        super("Login");
        //Pongo una operacion de cierre en el boton x
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Coloco las dimesiones de ancho y alto
        setSize(300, 150);
        
        //Defino un contenedor de elemntos visuales
        JPanel panel = new JPanel();

        //Al panel le doy un diseño
        panel.setLayout(new GridLayout(3,2));

        //Etiqueta para el usuario
        JLabel lblUsuario = new JLabel("Usuario: ");
        //Etiqueta para el password
        JLabel lblPassword =new JLabel("Password: ");


        //Creamos las cajas de texto
        txtUsuario = new JTextField();
        txtPassword = new JPasswordField();

        //Creamos un boton
        JButton btnLogin = new JButton("Login");

        //Colocamos accion al boton
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();
                char[] caraPassword = txtPassword.getPassword();
                String password = new String(caraPassword);
               if( validarLogin(usuario, password)){
                JOptionPane.showMessageDialog(Cliente.this, "Login correcto!","Validacion", JOptionPane.INFORMATION_MESSAGE);
               }else{
                JOptionPane.showMessageDialog(Cliente.this, "Usuario o contraseña incorrectos!!","Validacion",JOptionPane.ERROR_MESSAGE);
               }

            }
        });
        //Añadimos los elementos visuales al contenedor
        panel.add(lblUsuario);
        panel.add(txtUsuario);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(btnLogin);

        //Agregamos a la ventana el panel con los elementos visuales
        add(panel);
        //Hacemos visible a la ventana
        setVisible(true);
        //Centrar a la ventana
        setLocationRelativeTo(null);



    }

    public static void main(String[] args) {
        new Cliente();
    }
    
    private boolean validarLogin(String usuario, String password){
        return usuario.equals("utng") && password.equals("J240505");
    }

}