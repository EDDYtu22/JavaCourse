import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class FileChooser extends JFrame implements ActionListener {
    private JButton selectButton;

    public FileChooser() {
        super("File Chooser Example");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        selectButton = new JButton("Select File");
        selectButton.addActionListener(this);

        getContentPane().add(selectButton);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent evt) {
        JFileChooser fileChooser = new JFileChooser();
        int returnVal = fileChooser.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            JOptionPane.showMessageDialog(this, "You selected file: " + file.getName());
        } else {
            JOptionPane.showMessageDialog(this, "File selection was canceled.");
        }
    }

    public static void main(String[] args) {
        FileChooser example = new FileChooser();
    }
}

