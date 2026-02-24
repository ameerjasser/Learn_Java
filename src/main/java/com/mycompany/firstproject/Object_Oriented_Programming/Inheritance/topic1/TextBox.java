package com.mycompany.firstproject.Object_Oriented_Programming.Inheritance.topic1;

public class TextBox extends UIControl{
    private String text = "";

    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }
    public TextBox(boolean isEnabled) {
        //super(isEnabled);
        System.out.println("TextBox with boolean");
    }

    /// This line calls the constructor of the parent class (UIControl)


    public void setText(String Text){

        this.text = Text;
    }
    public void clear(){

        text = "";
    }
    public String getText(){
        return text;
    }

     @Override
    public String toString() {  return "Text: " + text; }
}
