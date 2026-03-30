import java.awt.*;
import java.awt.event.*;

class prg25 extends Frame implements ActionListener {
    TextField t1, t2, t3;
    Button add, sub, mul, div;

    prg25() {
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);
        t3.setEditable(false);
        
        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");

        setLayout(new FlowLayout());
        add(new Label("Num 1:")); add(t1);
        add(new Label("Num 2:")); add(t2);
        add(add); add(sub); add(mul); add(div);
        add(new Label("Result:")); add(t3);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        
        setTitle("Simple Calculator");
        setSize(400, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int result = 0;

            if (e.getSource() == add) result = a + b;
            if (e.getSource() == sub) result = a - b;
            if (e.getSource() == mul) result = a * b;
            if (e.getSource() == div) {
                if (b != 0) result = a / b;
                else {
                    t3.setText("Div by 0");
                    return;
                }
            }
            
            t3.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            t3.setText("Error");
        }
    }

    public static void main(String[] args) {
        new prg25();
    }
}
