import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CurrencyConverter extends Frame implements ItemListener, ActionListener {
    
    //iniatialized all the GUI components
    JComboBox convertFrom, convertTo;
    JTextField txtFrom, txtTo;
    JButton convert, reset;
    JLabel from, to, title;
    JPanel panel = new JPanel();

    double input = 0;
    double result = 0;
    
    public CurrencyConverter() {
        
        //add all the GUI components
        super("Currency Converter Project");
        setSize(420,270);
        setResizable(false);
        setLayout(null);
        setBackground(Color.lightGray);

        title = new JLabel("Currency Converter");
        title.setBounds(110,45,250,30);
        title.setFont(new Font("Arial", Font.PLAIN, 22));
        title.setForeground(Color.RED);
        add(title);

        convertFrom = new JComboBox();
        convertFrom.setBounds(310,100,80,30);
        convertFrom.addItem("USD");
        convertFrom.addItem("GBP");
        convertFrom.addItem("AED");
        convertFrom.addItem("PKR");
        convertFrom.addItem("INR");
        add(convertFrom);

        convertTo = new JComboBox();
        convertTo.setBounds(310,155,80,30);
        convertTo.addItem("USD");
        convertTo.addItem("GBP");
        convertTo.addItem("AED");
        convertTo.addItem("PKR");
        convertTo.addItem("INR");
        add(convertTo);

        from = new JLabel("Original:");
        from.setBounds(46,100,300,30);
        from.setForeground(Color.RED);
        add(from);

        txtFrom = new JTextField(15);
        txtFrom.setBounds(120,100,180,30);
        add(txtFrom);

        convert = new JButton("Convert");
        convert.setBounds(100,210,100,30);
        add(convert);

        to = new JLabel("Converted:");
        to.setBounds(40,155,300,30);
        to.setForeground(Color.RED);
        add(to);  

        txtTo = new JTextField(15);
        txtTo.setBounds(120,155,180,30);
        txtTo.setEditable(false);
        txtTo.setForeground(Color.RED);
        add(txtTo);

        reset = new JButton("Reset");
        reset.setBounds(210,210,100,30);
        add(reset);
       
        //register all the GUI components who will listen or invoke the methods
        convertFrom.addItemListener(this);
        convertTo.addItemListener(this);
        convert.addActionListener(this);
        txtFrom.addActionListener(this);
        reset.addActionListener(this);
       
        //this will close the applet window if the user clicked the close button
        addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    exit();
                }
            });
    }
    //the exit method
    public void exit(){
        
        setVisible(false);
        dispose();
        System.exit(0);
    }
    //show or make the applet window frame visible
    public static void main(String args[]) {
        CurrencyConverter w = new CurrencyConverter();
        w.setVisible(true);
    }

    public void ConvertUSD() {
        
        if(convertTo.getSelectedItem()=="USD") {
            
            result = (input);
            txtTo.setText(""+result);
        }
        
        else if(convertTo.getSelectedItem()=="GBP") {
            
            result = (input * 0.74);
            txtTo.setText(""+result);
        }
        
        else if(convertTo.getSelectedItem()=="AED") {
            
            result = (input * 3.67);
            txtTo.setText(""+result);
        }
        
        else if(convertTo.getSelectedItem()=="PKR") {
            
            result = (input * 175.16);
            txtTo.setText(""+result);
        }
        
        else {
            
            result = (input * 74.38);
            txtTo.setText(""+result);
        }
    }

    public void ConvertGBP() {
        
        if(convertTo.getSelectedItem()=="USD") {
            
            result = (input * 1.34);
            txtTo.setText(""+result);
        }
        
        else if(convertTo.getSelectedItem()=="GBP") {
            
            result = (input);
            txtTo.setText(""+result);
        }
        
        else if(convertTo.getSelectedItem()=="AED") {
            
            result = (input * 4.93);
            txtTo.setText(""+result);
        }
        
        else if(convertTo.getSelectedItem()=="PKR") {
            
            result = (input * 235.24);
            txtTo.setText(""+result);
        }
        
        else {
            
            result = (input * 99.91);
            txtTo.setText(""+result);
        }
    }

    public void ConvertAED() {
        
        if(convertTo.getSelectedItem()=="USD") {
            
            result = (input * 0.27);
            txtTo.setText(""+result);
        }
        
        else if(convertTo.getSelectedItem()=="GBP") {
            
            result = (input * 0.20);
            txtTo.setText(""+result);
        }
        
        else if(convertTo.getSelectedItem()=="AED") {
            
            result = (input);
            txtTo.setText(""+result);
        }
        
        else if(convertTo.getSelectedItem()=="PKR") {
            
            result = (input * 47.69);
            txtTo.setText(""+result);
        }
        
        else {
            
            result = (input * 20.25);
            txtTo.setText(""+result);
        }
    }

    public void ConvertPKR() {
        
        if(convertTo.getSelectedItem()=="USD") {
            
            result = (input * 0.0057);
            txtTo.setText(""+result);
        }
        
        else if(convertTo.getSelectedItem()=="GBP") {
            
            result = (input * 0.0043);
            txtTo.setText(""+result);
        }
        
        else if(convertTo.getSelectedItem()=="AED") {
            
            result = (input * 0.021);
            txtTo.setText(""+result);
        }
        
        else if(convertTo.getSelectedItem()=="PKR") {
            
            result = (input);
            txtTo.setText(""+result);
        }
        
        else {
            
            result = (input * 0.42);
            txtTo.setText(""+result);
        }
    }

    public void ConvertINR() {
        
        if(convertTo.getSelectedItem()=="USD") {
            
            result = (input * 0.013);
            txtTo.setText(""+result);
        }
        
        else if(convertTo.getSelectedItem()=="GBP") {
            
            result = (input * 0.010);
            txtTo.setText(""+result);
        }
        
        else if(convertTo.getSelectedItem()=="AED") {
            
            result = (input * 0.049);
            txtTo.setText(""+result);
        }
        
        else if(convertTo.getSelectedItem()=="PKR") {
            
            result = (input * 2.35);
            txtTo.setText(""+result);
        }
        
        else {
            
            result = (input);
            txtTo.setText(""+result);
        }
    }

    public void actionPerformed(ActionEvent e) {

        input = Double.parseDouble(txtFrom.getText());
        String msg = txtFrom.getText();

        if(e.getSource()==convert) {
            
            if(convertFrom.getSelectedItem()=="USD") {
                
                ConvertUSD();                
            }
            
            else if(convertFrom.getSelectedItem()=="GBP") {
                
                ConvertGBP();
            }
            
            else if(convertFrom.getSelectedItem()=="AED") {
                
                ConvertAED();
            }
            
            else if(convertFrom.getSelectedItem()=="PKR") {
                
                ConvertPKR();
            }
            
            else {
                
                ConvertINR();
            }

        }
        //this will reset both of the text boxes
        else {
            
            txtFrom.setText(null);
            txtTo.setText(null);
        }
    }

    public void itemStateChanged(ItemEvent e) {
        
        //empty
    }
}