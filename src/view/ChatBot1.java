package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 * @author fauzanalfaraby
 */

public class ChatBot1 extends JFrame {

    private JTextArea Chatarea = new JTextArea();
    private JTextField Chatbox = new JTextField();

    public ChatBot1() {
        // Mengatur frame
        setTitle("FutsalFusion | Help!");
        setSize(620, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        
        // Mengatur ikon jendela
        ImageIcon icon = new ImageIcon("src/assets/logo fiks2.png");
        setIconImage(icon.getImage());

        // Membuat panel utama
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        panel.setBackground(new Color(240, 240, 240));
        setContentPane(panel);

        // Membuat label untuk judul
        JLabel titleLabel = new JLabel("FutsalFusion Help Center");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setBorder(new EmptyBorder(10, 0, 20, 0));
        panel.add(titleLabel, BorderLayout.NORTH);

        // Mengatur area teks
        Chatarea.setLineWrap(true);
        Chatarea.setWrapStyleWord(true);
        Chatarea.setFont(new Font("Calibri", Font.PLAIN, 14));
        Chatarea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(Chatarea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Mengatur kotak teks
        Chatbox.setFont(new Font("Calibri", Font.PLAIN, 14));
        Chatbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                String gtext = Chatbox.getText().toLowerCase();
                Chatarea.append("Tanya -> " + gtext + "\n");
                Chatbox.setText("");

                if (gtext.contains("hi")) {
                    bot("Hallo");
                } else if (gtext.contains("apa itu futsalfusion?")) {
                    bot("FutsalFusion adalah aplikasi untuk mengelola dan melihat informasi mengenai anggota UKM Futsal di STIS");
                } else if (gtext.contains("apa masuknya perlu mendaftar?")) {
                    bot("Ya, masuknya perlu mendaftar dan terdapat seleksi bagi pesertanya");
                } else if (gtext.contains("berapa biaya pendaftarannya?")) {
                    bot("Biaya pendaftarannya gratis.");
                } else if (gtext.contains("apa kegiatan di ukm futsal stis?")) {
                    bot("Kegiatan di UKM Futsal meliputi latihan rutin, fun futsal, bina fisik, mini soccer, dan friendly match.");
                } else if (gtext.contains("di mana lokasi latihannya?")) {
                    bot("Latihan diadakan di Goedang Futsal, Kecamatan Jatinegara, Kota Jakarta Timur.");
                } else if (gtext.contains("kapan jadwal latihannya?")) {
                    bot("Jadwal latihan dilakukan 2 kali dalam sebulan pada hari Sabtu / Minggu.");
                } else if (gtext.contains("siapa ketua ukm futsal stis?")) {
                    bot("Ketua UKM Futsal saat ini adalah Dyatmika Andaya Indriya Jati dari kelas 2ST4.");
                } else if (gtext.contains("oke terimakasih")) {
                    bot("Baik, Selamat berpisah. Ditunggu kehadirannya di open recruitment futsal STIS "
                            + "dan jangan lupa daftar kegiatannya yaa..");
                } else {
                    int rand = (int) (Math.random() * 3 + 1);
                    if (rand == 1) {
                        bot("Saya tidak mengerti!");
                    } else if (rand == 2) {
                        bot("Saya tidak mengerti Anda!");
                    } else if (rand == 3) {
                        bot("Coba lagi!");
                    }
                }
            }
        });

        // Menambahkan kotak teks ke panel
        panel.add(Chatbox, BorderLayout.SOUTH);
    }

    private void bot(String string) {
        Chatarea.append("Jawab -> " + string + "\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ChatBot1().setVisible(true);
            }
        });
    }
}
