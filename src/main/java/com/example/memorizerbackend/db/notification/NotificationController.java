package com.example.memorizerbackend.db.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/notification")
public class NotificationController {

    @Autowired

    private NotificationRepository NotificationRespository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewNotification(@RequestBody Notification notification){
        NotificationRespository.save(notification);
        return "Notification Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable <Notification> getAllNotification(){
        return NotificationRespository.findAll();
    }
}
