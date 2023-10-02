package com.utn.TPAPIRESTDiaz.repositories;

import com.utn.TPAPIRESTDiaz.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface BaseRepository <E extends Base,ID extends Serializable> extends JpaRepository <E,ID> {
}
