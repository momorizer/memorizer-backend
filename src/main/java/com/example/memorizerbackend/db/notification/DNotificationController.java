package com.example.memorizerbackend.db.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/notification")
public class DNotificationController {

    @Autowired

    private  DNotificationRepository DNotificationRespository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewNotification(@RequestBody DNotification notification){
        DNotificationRespository.save(notification);
        return "Notification Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable <DNotification> getAllNotification(){
        return DNotificationRespository.findAll();
    }
}
