package com.mycompany.firstproject.Object_Oriented_Programming.Interface.mytubeProject;

public class VideoProcessor {
    private VideoEncoder encoder;
    private VideoDatabase database;
    private NotificationService notificationService;

    public VideoProcessor(VideoEncoder encoder) {
        this.encoder = encoder;
    }
    public VideoProcessor(VideoDatabase database) {
        this.database = database;
    }
    public VideoProcessor(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public VideoProcessor(VideoEncoder encoder, VideoDatabase database, NotificationService notificationService) {
        this.encoder = encoder;
        this.database = database;
        this.notificationService = notificationService;
    }

    public void process(Video video) {

        encoder.encode(video);
        database.store(video);
        notificationService.notify(video.getUser());

    }
}

