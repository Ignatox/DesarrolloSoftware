package com.utn.TPAPIRESTDiaz.services;

import com.utn.TPAPIRESTDiaz.entities.Base;
import jakarta.transaction.Transactional;

import java.io.Serializable;
import java.util.List;

public interface BaseService  <E extends Base , ID extends Serializable> {

    public List<E> findALL() throws Exception;

    public E findById(ID id) throws Exception;

    public E save(E entity) throws Exception;

    public E update(ID id, E entity) throws Exception;

    public boolean delete(ID id) throws Exception;

}

