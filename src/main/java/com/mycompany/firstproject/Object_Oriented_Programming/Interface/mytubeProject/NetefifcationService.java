package com.mycompany.firstproject.Object_Oriented_Programming.Interface.mytubeProject;

public class NetefifcationService implements NotificationService {
    @Override
    public void notify(User user) {
        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done!\n");
    }
}
