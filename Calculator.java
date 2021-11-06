
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 import java.lang.Math;

   public class Calculator implements ActionListener   {

       JFrame frame;
       JLabel label1, label2 , result;
       JTextField txt1 , txt2;
       JButton add , sub , mul , div;

   	   Calculator() {

           frame = new JFrame("Simple Calculator");
           frame.setSize(400 , 400);
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setLocationRelativeTo(null);
           frame.setLayout(null);

           label1 = new JLabel("First Number : ");
           label1.setBounds(20 , 50 , 100 , 40);

           txt1 = new JTextField();
           txt1.setBounds(135 , 55 , 200 , 30);

           label2 = new JLabel("Second Number : ");
           label2.setBounds(20 , 100 , 100 , 40);

           txt2 = new JTextField();
           txt2.setBounds(135 , 105 , 200 , 30);

           add = new JButton("+");
           add.setBounds(30 , 170 , 50 , 40);
           add.setFocusable(false);

           sub = new JButton("-");
           sub.setBounds(100 , 170 , 50 , 40);
           sub.setFocusable(false);

           mul = new JButton("X");
           mul.setBounds(170 , 170 , 50 , 40);
           mul.setFocusable(false);

           div = new JButton("/");
           div.setBounds(240 , 170 , 50 , 40);
           div.setFocusable(false);

           result = new JLabel("Result : ");
           result.setBounds(20 , 240 , 170 , 40);

           add.addActionListener(this);
           sub.addActionListener(this);
           mul.addActionListener(this);
           div.addActionListener(this);

           frame.add(label1);
           frame.add(label2);
           frame.add(txt1);
           frame.add(txt2);
           frame.add(add);
           frame.add(sub);
           frame.add(mul);
           frame.add(div);
           frame.add(result);
           
           frame.setResizable(false);
           frame.setVisible(true);

   	   }

       public void actionPerformed(ActionEvent e) {
           
           try {
       	   if(e.getSource() == add) {

       	   	   int a = Integer.parseInt(txt1.getText());
       	   	   int b = Integer.parseInt(txt2.getText());
       	   	   int c = a + b;
       	   	   result.setText("Result : " +c);
       	   }
       	   if(e.getSource() == sub) {

       	   	   int a = Integer.parseInt(txt1.getText());
       	   	   int b = Integer.parseInt(txt2.getText());
       	   	   int c = a - b;
       	   	   result.setText("Result : " +c);
       	   }
           if(e.getSource() == mul) {

       	   	   int a = Integer.parseInt(txt1.getText());
       	   	   int b = Integer.parseInt(txt2.getText());
       	   	   int c = a * b;
       	   	   result.setText("Result : " +c);
       	   }
            if(e.getSource() == div) {

       	   	   int a = Integer.parseInt(txt1.getText());
       	   	   int b = Integer.parseInt(txt2.getText());
               
               if(a%b==0) {

                int c = a/ b;
               result.setText("Result : " +c);
            }
              
               else {
               double c = (double)a/b;
               result.setText("Result : " +c);
           }
       	}

       	} catch(Exception e1) {

       		 result.setText("Please Enter only Digits....");
       	}
     }

   	   public static void main(String[] args) {
   	   	 
   	   	  Calculator c = new Calculator();
   	   }
   }
