package com.mycompany.firstproject.Object_Oriented_Programming.Inheritance.topic1;



public class Main {
    public static void main(String[] args) {

        UIControl[] controls = {new TextBox(), new CheckBox()};  // this is called polymorphism, we are creating an array of UIControl references,
        for(var control : controls){                                //  but we are assigning TextBox and CheckBox objects to it,
            control.render();                                   // this is possible because TextBox and CheckBox are subclasses of UIControl, so they can be treated as UIControl references
        }
        var taxCalculater2018 = new TaxCalculater2018(100_000);
        var taxReport = new TaxReport(taxCalculater2018);

        System.out.println("This is the begging of the program");
        //var box = new UIControl(true);  we cannot create an object of an abstract class, because an abstract class is not a complete class.
        var box1 = new TextBox();
        //System.out.println(box1);
        //System.out.println(box1.hashCode()); // this will print a number, which calculated based on the address of this object in the memory
        //System.out.println(textBox);
        System.out.println("--------------------------------");
        show(box1);
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
        
