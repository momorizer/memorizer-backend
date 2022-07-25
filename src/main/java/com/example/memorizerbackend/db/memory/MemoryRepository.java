package com.example.memorizerbackend.db.memory;

import org.springframework.data.repository.CrudRepository;

public interface MemoryRepository extends CrudRepository<Memory,Integer> {
    
}
