package com.emazon.reportes_api.infraestructure.driven_rp.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.emazon.reportes_api.infraestructure.driven_rp.entity.SaleClientEntity;

@Repository
public interface IRepositoryMongo extends MongoRepository<SaleClientEntity, String>{
    
}
