package com.spring_store.SpringStore.repositories;

import com.spring_store.SpringStore.models.KeyboardModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KeyboardRepository extends MongoRepository<KeyboardModel,Integer> {
}