import java.awt.*;
import java.awt.event.*;

class prg24 extends Frame implements ActionListener {
    TextField t1, t2, t3, t4;
    Button b_calc;

    prg24() {
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);
        t4 = new TextField(10);
        t4.setEditable(false);
        
        b_calc = new Button("max");

        setLayout(new FlowLayout()); 
        add(t1); add(t2); add(t3); add(b_calc); add(t4);

        b_calc.addActionListener(this);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int num3 = Integer.parseInt(t3.getText());

            int max = num1;
            if (num2 > max) max = num2;
            if (num3 > max) max = num3;

            t4.setText(String.valueOf(max));
        } catch (NumberFormatException ex) {
            t4.setText("Error");
        }
    }

    public static void main(String[] args) {
        new prg24();
    }
}
