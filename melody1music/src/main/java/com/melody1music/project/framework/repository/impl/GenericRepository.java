package com.melody1music.project.framework.repository.impl;

import com.melody1music.project.framework.entity.BaseEntity;
import com.melody1music.project.framework.repository.inter.IGenericRepository;

public abstract class GenericRepository<T extends BaseEntity<?, ?>> implements IGenericRepository<BaseEntity>{
	
}
