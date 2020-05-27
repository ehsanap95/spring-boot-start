package com.melody1music.project.framework.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.melody1music.project.framework.dto.BaseDTO;
import com.melody1music.project.framework.entity.BaseEntity;
import com.melody1music.project.framework.repository.inter.IGenericRepository;
import com.melody1music.project.framework.service.inter.IGenericService;


@Service
@Transactional
public class GenericServiceImpl <T extends BaseEntity<T,D>,D extends BaseDTO> implements IGenericService<T,D>{

	@Autowired
    private IGenericRepository<T> iGenericRepository;
	
	@Override
    public D save(T entity) {
		return iGenericRepository.save(entity).getDataTransferObject();
    }

	@Override
	public List<D> findAll() {
		List <D> listD=new ArrayList<>();
		(iGenericRepository.findAll()).stream().forEach(n->{listD.add(((T)n).getDataTransferObject());});
		return listD;
	}

	@Override
	public D findById(Long entityId) {
		Optional<T> optional = iGenericRepository.findById(entityId);
	   	return optional.isPresent()?(optional.get()).getDataTransferObject():null;
	}

	@Override
	public D update(T entity) {
		return iGenericRepository.save(entity).getDataTransferObject();
	}

	@Override
	public D updateById(T entity, Long entityId) {
       	return iGenericRepository.findById(entityId).isPresent()? iGenericRepository.save(entity).getDataTransferObject():null;
	}

	@Override
	public void delete(T entity) {
		iGenericRepository.delete(entity);
	}

	@Override
	public void deleteById(Long entityId) {
		iGenericRepository.deleteById(entityId);
		
	}
}
