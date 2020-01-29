package shop;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Shop {
    //              ------->     Paiwand bahman Jawhar   <---------
    public JFrame f;
    public JPanel p;
    public JButton b1;
    public JButton b2;
    public JLabel l;
    
    public Shop() {
        
        gui();
    }
    
    public void gui() {
        f = new JFrame("shop ");
        f.setVisible(true);
        f.setSize(300, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        p = new JPanel();
        p.setBackground(Color.YELLOW);
        b1 = new JButton("sell");
        /////////////////////////////////////
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sell();
            }
        });
        b2 = new JButton("buy");
        
        b2.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                buy();
            }
        });
        ////////////////////////////////////////
        l = new JLabel("what you will do :");
        p.add(b1);
        p.add(b2, BorderLayout.SOUTH);
        p.add(l);
        f.add(p);
        f.setLocation(800, 450);
    }
    
    public static void main(String[] args) {
        Shop s = new Shop();
        
    }
    
    public static void sell() {
        
        String a = JOptionPane.showInputDialog("input your item name pleas:");
        String b = JOptionPane.showInputDialog("input your item price pleas:");
        
        String c = "this item inserted successfully name- (" + a + ") price- (" + b + " )  thanks  ;)";
        
        JOptionPane.showMessageDialog(null, c);
        
    }
    
    public static void buy() {
        
        JOptionPane.showMessageDialog(null, "the stack is empty sorry :)");
        
    }
}
