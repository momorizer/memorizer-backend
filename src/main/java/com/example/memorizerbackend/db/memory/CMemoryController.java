package com.example.memorizerbackend.db.memory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller // This means that this class is a Controller
@RequestMapping(path="/memory") // This means URL's start with /demo (after Application path)
public class CMemoryController {
  @Autowired // This means to get the bean called userRepository
         // Which is auto-generated by Spring, we will use it to handle the data
  private CMemoryRepository CMemoryRepository;

   @PostMapping(path="/add") // Map ONLY POST Requests
   public @ResponseBody String addNewMemory (@RequestBody CMemory memory) {
     CMemoryRepository.save(memory);
     return "Saved";
   }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<CMemory> getAllMemory() {
    // This returns a JSON or XML with the users
    return CMemoryRepository.findAll();
  }
}