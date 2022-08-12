package com.example.memorizerbackend.db.group;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // This means that this class is a Controller
@RequestMapping(path="/group") // This means URL's start with /group (after Application path)
public class GroupController {
    @Autowired // This means to get the bean called GroupRepository
                // Which is auto-generated by Spring, we will use it to handle the data
    private GroupRepository groupRepository;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewGroup (@RequestBody Group group) {
        groupRepository.save(group);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Group> getAllGroups() {
        // This returns a JSON or XML with the users
        return groupRepository.findAll();
    }

}