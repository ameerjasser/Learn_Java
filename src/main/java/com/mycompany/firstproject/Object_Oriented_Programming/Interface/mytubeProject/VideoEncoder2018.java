package com.mycompany.firstproject.Object_Oriented_Programming.Interface.mytubeProject;

public class VideoEncoder2018 implements VideoEncoder {
    @Override
    public void encode(Video video) {
        System.out.println("Encoding video...");
        System.out.println("Done!\n");
    }
}
