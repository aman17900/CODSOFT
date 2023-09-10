

package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class rule extends JFrame implements ActionListener{



    String name;
    JButton start, back;
    
   rule(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name +  " Instructions for start Quiz");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rule = new JLabel();
        rule.setBounds(20, 90, 700, 350);
        rule.setFont(new Font("Tahoma", Font.PLAIN, 16));
       rule.setText(
            "<html>"+ 
                "1. There are 10 question in this quiz." + "<br><br>" +
                "2. Each Question having 4 option." + "<br><br>" +
                "3. 10 mark for correct question. " + "<br><br>" +
                "4. For each question having time limit(15 second)." + "<br><br>" +
                "5. After time up next question come(No revious question show) " + "<br><br>" +
                "6. No allow any cheating material during exam ." + "<br><br>" +              
                "7. No negative marking of any question." + "<br><br>" +
                "8. All question done click submit button and get your score."+ "<br><br>" +
            "<html>"
        );
        add(rule);
        
        back = new JButton("Back");
        back.setBounds(250, 450, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 450, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 550);
        setLocation(350, 100);
        setVisible(true);
   }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new rule("User");
    }
}