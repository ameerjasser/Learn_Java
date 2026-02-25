package com.mycompany.firstproject.Object_Oriented_Programming.Inheritance.topic1;

public class TextBox extends UIControl{
    private String text = "";

    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }
    public TextBox(boolean isEnabled) {
        //super(isEnabled);  /// This line calls the constructor of the parent class (UIControl)
        System.out.println("TextBox with boolean");
    }

    @Override
    public void render() {
        System.out.println("Rendering a TextBox");
    }

    public void setText(String Text){ this.text = Text; }
    public void clear(){ text = ""; }
    public String getText(){
        return text;
    }

     @Override
    public String toString() {  return "Text: " + text; }
}
