package com.mycompany.firstproject.Object_Oriented_Programming.Inheritance;

public class TextBox extends UIControl{
    private String text = "";

    public void setText(String Text){
        this.text = Text;
    }
    public void clear(){
        text = "";
    }
}
