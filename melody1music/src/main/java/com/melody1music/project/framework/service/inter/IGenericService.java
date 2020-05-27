package com.melody1music.project.framework.service.inter;

import java.util.List;
import com.melody1music.project.framework.dto.BaseDTO;
import com.melody1music.project.framework.entity.BaseEntity;

public interface IGenericService <T extends BaseEntity<T, D>,D extends BaseDTO> {
	
   public abstract D save(T entity);
   
   public abstract List<D> findAll();
   
   public abstract D findById(Long entityId);
   
   public abstract D update(T entity);
   
   public abstract D updateById(T entity, Long entityId);   
   
   public abstract void delete(T entity);
   
   public abstract void deleteById(Long entityId);
}
