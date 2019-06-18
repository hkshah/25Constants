package com.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Return;

@Repository
public interface IRepository extends CrudRepository<Return, String> {

}
