package com.mycompany.firstproject.Object_Oriented_Programming.Inheritance.topic1;

public class CheckBox extends UIControl{
    @Override
    public void render() {
        System.out.println("Rendering a CheckBox");
    }

    //public void enable(){  } // we cannot override the enable method beacause it is a final method in the UIControl class.
    // for the final classes we cannot inherit them, for the final methods we cannot override them, but we can still use them in the subclasses.
}
