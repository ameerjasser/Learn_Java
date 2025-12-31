package com.mycompany.firstproject.Object_Oriented_Programming.Inheritance;

public class TextBox extends UIControl{
    private String text = "";

    public TextBox(){
        super(true);       /// This line calls the constructor of the parent class (UIControl)
        System.out.println("TextBox initialized");
    }
    public void setText(String Text){
        this.text = Text;
    }
    public void clear(){
        text = "";
    }
}
