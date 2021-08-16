package com.spring.restApi.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.restApi.model.AppModel;

@Repository
public interface AppDao extends MongoRepository<AppModel, Long> {

}
