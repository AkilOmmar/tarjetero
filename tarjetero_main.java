import javax.swing.*;
import java.awt.*;

public class tarjetero_main {
    private static void createGUI(JFrame frame){
        // Generando GUI
        // Ventana principal
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setBackground(Color.BLACK);
        Container mainPane =  frame.getContentPane();

        GridBagLayout mainLayout = new GridBagLayout();
        GridBagConstraints constraintsInfo = new GridBagConstraints();
        int defaultWidth = constraintsInfo.gridwidth;
        mainPane.setLayout(mainLayout);

        // Botones de Acciones
        JButton nuevaTarjeta = new JButton("Crear");
        JButton editarTarjeta = new JButton("Editar");
        JButton borrarTarjeta = new JButton("Eliminar");
        constraintsInfo.ipady = 40;
        constraintsInfo.fill = GridBagConstraints.HORIZONTAL;
        constraintsInfo.gridx=0;
        constraintsInfo.gridy=2;
        mainPane.add(nuevaTarjeta, constraintsInfo);
        constraintsInfo.gridy=3;
        mainPane.add(editarTarjeta, constraintsInfo);
        constraintsInfo.gridy=4;
        mainPane.add(borrarTarjeta, constraintsInfo);

        // Formulario
        String[] tarjetas = {"Selecciona una...", "test1"};
        JComboBox listaTarjetas = new JComboBox(tarjetas);
        listaTarjetas.setSelectedIndex(0);
        constraintsInfo.ipady = 20;
        constraintsInfo.gridwidth=3;
        constraintsInfo.gridx=2;
        constraintsInfo.gridy=0;
        mainPane.add(listaTarjetas, constraintsInfo);
        constraintsInfo.gridwidth=10;
        constraintsInfo.gridx=0;
        constraintsInfo.gridy=1;
        mainPane.add(new JSeparator(), constraintsInfo);

        constraintsInfo.gridwidth=1;
        constraintsInfo.gridx=1;
        constraintsInfo.gridy=2;
        mainPane.add(new JLabel("Nombre: "), constraintsInfo);

        JTextField nombreTexto = new JTextField("Sin seleccion ");
        //nombreTexto.setVisible(false);
        nombreTexto.setOpaque(true);
        constraintsInfo.gridwidth=3;
        constraintsInfo.gridx=2;
        constraintsInfo.gridy=2;
        mainPane.add(nombreTexto, constraintsInfo);

        constraintsInfo.gridwidth=1;
        constraintsInfo.gridx=5;
        constraintsInfo.gridy=2;
        mainPane.add(new JLabel("Descripcion: "), constraintsInfo);

        JTextField descripcionTexto = new JTextField("Sin seleccion ");
        constraintsInfo.gridwidth=3;
        constraintsInfo.gridx=6;
        constraintsInfo.gridy=2;
        mainPane.add(descripcionTexto, constraintsInfo);

        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }

    private static void esconderFormulario(JFrame frame, boolean esconder){
        Container mainPane = frame.getContentPane();
        mainPane.getComponents();
    }

    public static void main(String args[]){
        JFrame frame = new JFrame("Tarjetero MySQL");
        createGUI(frame);
        esconderFormulario(frame,true);

    }
}
