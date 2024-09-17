package com.ncd2504.FootballHealthCare.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ncd2504.FootballHealthCare.models.set;

@Repository
public interface SetRepository extends MongoRepository<set, String> {

}
