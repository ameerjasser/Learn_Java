package com.mycompany.firstproject.Object_Oriented_Programming.Interface.mytubeProject;

public class Main {

    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User2018("john@domain.com"));

        var processor = new VideoProcessor(new VideoEncoder2018(),
                new SqlVideoDatabase(),
                new NetefifcationService());
        processor.process(video);
    }
}
