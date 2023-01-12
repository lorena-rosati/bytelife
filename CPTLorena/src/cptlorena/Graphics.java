package cptlorena;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Graphics extends JFrame {

    Graphics() {
    }

    public static void bbMorri() {

//Creates a frame for the graphics
//Creates 4 labels that contains the images and corresponding texts
        JFrame frame = new JFrame();
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        JLabel label4 = new JLabel();

        //Setting the 4 images as variables to be used later
        ImageIcon bbmorri1 = new ImageIcon("bbmorri1.jpg");
        ImageIcon bbmorri2 = new ImageIcon("bbmorri2.jpg");
        ImageIcon randKid1 = new ImageIcon("randKid1.jpg");
        ImageIcon randKid2 = new ImageIcon("randKid2.jpg");

        label1.setText("1)"); //Set text of label1
        label1.setIcon(bbmorri1);
        label1.setHorizontalTextPosition(JLabel.CENTER);//Set text CENTER of ImageIcon
        label1.setVerticalTextPosition(JLabel.CENTER); //set text CENTER of ImageIcon
        label1.setForeground(new Color(0x00FF00)); //set font colour
        label1.setFont(new Font("Times New Roman", Font.PLAIN, 60)); //set font, type, and size
        label1.setIconTextGap(-70); //set gap of text to image
        label1.setBackground(Color.black); //Set background color
        label1.setOpaque(true); //Display background color
        label1.setVerticalAlignment(JLabel.CENTER); //Set vertical position of icon + text within label1
        label1.setHorizontalAlignment(JLabel.CENTER);  //Set horizontal position of icon + text within label1
        label1.setBounds(0, 0, 300, 300); //Sets coordinates and size of label1 within frame
        label1.setVisible(true);

        label2.setText("2)"); //Set text of label2
        label2.setIcon(bbmorri2);
        label2.setHorizontalTextPosition(JLabel.CENTER);//Set text CENTER of ImageIcon
        label2.setVerticalTextPosition(JLabel.CENTER); //set text CENTER of ImageIcon
        label2.setForeground(new Color(0x00FF00)); //set font colour
        label2.setFont(new Font("Times New Roman", Font.PLAIN, 60)); //set font, type, and size
        label2.setIconTextGap(-70); //set gap of text to image
        label2.setBackground(Color.black); //Set background color
        label2.setOpaque(true); //Display background color
        label2.setVerticalAlignment(JLabel.CENTER); //Set vertical position of icon + text within label2
        label2.setHorizontalAlignment(JLabel.CENTER);  //Set horizontal position of icon + text within label2
        label2.setBounds(300, 0, 300, 300); //Sets coordinates and size of label2 within frame
        label2.setVisible(true);

        label3.setText("3)"); //Set text of label3
        label3.setIcon(randKid1);
        label3.setHorizontalTextPosition(JLabel.CENTER);//Set text CENTER of ImageIcon
        label3.setVerticalTextPosition(JLabel.CENTER); //set text CENTER of ImageIcon
        label3.setForeground(new Color(0x00FF00)); //set font colour
        label3.setFont(new Font("Times New Roman", Font.PLAIN, 60)); //set font, type, and size
        label3.setIconTextGap(-50); //set gap of text to image
        label3.setBackground(Color.white); //Set background color
        label3.setOpaque(true); //Display background color
        label3.setVerticalAlignment(JLabel.TOP); //Set vertical position of icon + text within label3
        label3.setHorizontalAlignment(JLabel.RIGHT);  //Set horizontal position of icon + text within label3
        label3.setBounds(0, 300, 300, 300); //Sets coordinates and size of label3 within frame
        label3.setVisible(true);

        label4.setText("4)"); //Set text of label4
        label4.setIcon(randKid2);
        label4.setHorizontalTextPosition(JLabel.CENTER);//Set text CENTER of ImageIcon
        label4.setVerticalTextPosition(JLabel.CENTER); //set text CENTER of ImageIcon
        label4.setForeground(new Color(0x00FF00)); //set font colour
        label4.setFont(new Font("Times New Roman", Font.PLAIN, 60)); //set font, type, and size
        label4.setIconTextGap(-50); //set gap of text to image
        label4.setBackground(Color.black); //Set background color
        label4.setOpaque(true); //Display background color
        label4.setVerticalAlignment(JLabel.CENTER); //Set vertical position of icon + text within label4
        label4.setHorizontalAlignment(JLabel.LEFT);  //Set horizontal position of icon + text within label4
        label4.setBounds(300, 300, 300, 300); //Sets coordinates and size of label4 within frame
        label4.setVisible(true);

        frame.setTitle("Baby Morri"); //sets frame title
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //Closes image when X is clicked
        frame.setAlwaysOnTop(true);//Always brings graphic to forefront of all windows
        frame.setLayout(null); //Sets no layout
        frame.setLocationRelativeTo(null); //Set to relative position
        frame.setResizable(false); //Disallows for expansion and contraction
        frame.setLocation(600, 0); //Sets starting location
        frame.setSize(600, 600); //Sets size of frame
        frame.getContentPane().setBackground(Color.white); //Sets background colour of frame
        frame.setVisible(true); //Makes frame visible
        //Adds the 4 labels to the frame
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);

    }

}
