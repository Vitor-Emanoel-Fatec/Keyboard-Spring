package com.spring_store.springstore.repositories;

import com.spring_store.springstore.models.KeyboardModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KeyboardRepository extends MongoRepository<KeyboardModel,String> {
}