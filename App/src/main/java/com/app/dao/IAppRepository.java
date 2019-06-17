package com.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.model.AppModel;

@Repository
public interface IAppRepository extends CrudRepository<AppModel, String> {

}
