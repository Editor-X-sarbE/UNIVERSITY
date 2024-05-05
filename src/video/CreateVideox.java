/*import java.awt.BorderLayout;
import java.awt.Component;
import java.io.File;
import javax.media.Manager;
import javax.media.Player;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Video extends JPanel {
  private Player playerxx;

  public Video(String filename) {
    setLayout(new BorderLayout());
    try {
      player = Manager.createPlayer(new File(filename).toURI().toURL());
      add((Component) player.getVisualComponent(), BorderLayout.CENTER);
      add((Component) player.getControlPanelComponent(), BorderLayout.SOUTH);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void play() {
    player.start();
  }

  public void stop() {
    player.stop();
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(640, 480);
    Video video = new Video("filename.mp4");
    frame.getContentPane().add(video);
    frame.setVisible(true);
    video.play();
  }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package video;
import jaco.mp3.player.MP3Player;
import java.io.File;
/**
 *
 * @author freec
 */
/*public class CreateVideox extends javax.swing.JFrame {

    /**
     * Creates new form Videos
     */
   /* public CreateVideox() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    /*@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("videoimport.mp4")); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) throws InterruptedException {
          new CreateVideox().setVisible(true);
        new MP3Player(new File("videoimport.mp4")).play();
  // Kindly note that the speed of gif and audio must be same 
  // unless the result will not be satisfactory.
    Thread.sleep(10000);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}*/
