/**
 * Created by hkmet on 2.11.2018.
 */
import java.awt.*;
import java.awt.event.*;

public class GUI extends Frame implements ActionListener, WindowListener {
    // private variables
    private Label fahrenheit_label;
    private Label celcius_label;
    private TextField fahrenheit_text;
    private TextField celcius_text;

    private Button convert_button;
    private int count = 0;
    // Constructor
    public GUI(){

        setLayout(new FlowLayout());

        fahrenheit_label = new Label("Fahrenheit");
        celcius_label = new Label("Celcius");

        add(fahrenheit_label);
        add(celcius_label);

        fahrenheit_text = new TextField(count + "", 10);
        celcius_text = new TextField(count +"",10);
        add(fahrenheit_text);
        add(celcius_text);

        convert_button = new Button("Convert");
        add(convert_button);

        convert_button.addActionListener(this);

        setTitle("Fahrenheit to Celcius Converter");
        setSize(250,250);


        addWindowListener(this);

        System.out.print("constructor");
        Frame frame = new Frame();
        Panel panel = new Panel();
        frame.add(panel);
        Button button1 = new Button("Press It");
        panel.add(button1);

        setVisible(true);
    }
    // methods


    public static void main(String[] jobless){

        GUI converter = new GUI();

    }

    public void handler(){
        String fahrenheit_value = fahrenheit_text.getText();
        String celcius_value = celcius_text.getText();

        if (this.isInteger(fahrenheit_value)){
            int fahrenheit_int = Integer.valueOf(fahrenheit_value);
            int celcius_int = ((fahrenheit_int -32) *5) / 9;

            celcius_text.setText(String.valueOf(celcius_int));
        }
        else{
            fahrenheit_text.setText("enter a number");
        }
    }

    public boolean isInteger(String input){
        try{
            Integer.parseInt(input);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }


    @Override
    public void actionPerformed(ActionEvent evt){

        this.handler();

    }

    @Override
    public void windowClosing(WindowEvent evt){
        System.exit(0);
    }
    @Override
    public void windowOpened(WindowEvent evt){}
    @Override
    public void windowClosed(WindowEvent evt){}
    @Override
    public void windowDeiconified(WindowEvent evt){}
    @Override
    public void windowDeactivated(WindowEvent evt){}
    @Override
    public void windowActivated(WindowEvent evt){}
    @Override
    public void windowIconified(WindowEvent evt){}
    }

