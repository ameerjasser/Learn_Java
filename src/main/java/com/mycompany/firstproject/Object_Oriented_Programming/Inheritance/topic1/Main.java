package com.mycompany.firstproject.Object_Oriented_Programming.Inheritance.topic1;

//import com.mycompany.firstproject.Object_Oriented_Programming.Inheritance.TextBox;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is the begging of the program");
        var box = new UIControl(true);
        var box1 = new TextBox();
        //System.out.println(box1);
        //System.out.println(box1.hashCode()); // this will print a number, which calculated based on the address of this object in the memory
        //System.out.println(textBox);
        System.out.println("--------------------------------");
        show(box);
        System.out.println("Done");
    }
    private static void show(UIControl control){
        System.out.println("you are in the show method");
        if(control instanceof TextBox){    // This is called downcasting, we are cheacking if the UIControl rreference is actually a TextBox reference, if it is we can safely convert it to a TextBox reference
            var textBox = (TextBox) control; // this is called downcasting, we are converting the UIControl reference to a TextBox reference
            textBox.setText("Hello World");
            System.out.println(textBox);
        }
        System.out.println(control);
    }
}
        
