
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormMahasiswa extends JFrame {

    // Atomic Components
    JLabel labelNim, labelNama, labelProdi;
    JTextField fieldNim, fieldNama;
    JComboBox<String> comboProdi;
    JButton tombolSimpan, tombolReset;

    public FormMahasiswa() {

        // Top-level Container
        setTitle("Formulir Data Mahasiswa");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Intermediate Container
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));

        // Atomic Components
        labelNim = new JLabel("NIM:");
        fieldNim = new JTextField();

        labelNama = new JLabel("Nama:");
        fieldNama = new JTextField();

        labelProdi = new JLabel("Program Studi:");
        String[] prodi = {
            "Teknik Informatika",
            "Teknik Elektro",
            "Teknik Sipil"
        };
        comboProdi = new JComboBox<>(prodi);

        tombolSimpan = new JButton("Simpan");
        tombolReset = new JButton("Reset");

        // Menambahkan komponen ke panel
        panel.add(labelNim);
        panel.add(fieldNim);
        panel.add(labelNama);
        panel.add(fieldNama);
        panel.add(labelProdi);
        panel.add(comboProdi);
        panel.add(tombolSimpan);
        panel.add(tombolReset);

        // Layout Class kedua
        setLayout(new FlowLayout());
        add(panel);

        // Event Listener
        tombolSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = fieldNim.getText();
                String nama = fieldNama.getText();
                String prodi = (String) comboProdi.getSelectedItem();

                JOptionPane.showMessageDialog(
                    FormMahasiswa.this,
                    "Data Berhasil Disimpan!\n"
                    + "NIM: " + nim + "\n"
                    + "Nama: " + nama + "\n"
                    + "Program Studi: " + prodi
                );
            }
        });

        tombolReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fieldNim.setText("");
                fieldNama.setText("");
                comboProdi.setSelectedIndex(0);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FormMahasiswa form = new FormMahasiswa();
            form.setVisible(true);
        });
    }
}
