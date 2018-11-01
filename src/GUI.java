/**
 * Created by hkmet on 2.11.2018.
 */
import java.awt.*;
import java.awt.event.*;

public class GUI extends Frame implements ActionListener {
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
        setSize(250,150);



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

    @Override
    public void actionPerformed(ActionEvent evt){
        count++;

        fahrenheit_text.setText(count+"");
        celcius_text.setText(count+"");
    }
}

