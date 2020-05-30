package com.melody1music.project.framework.repository.inter;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import com.melody1music.project.framework.entity.BaseEntity;


public interface IGenericRepository <T extends BaseEntity<?, ?>> extends JpaRepository<T, UUID>{
		
}
