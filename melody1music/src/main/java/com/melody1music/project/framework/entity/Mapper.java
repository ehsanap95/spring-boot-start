package com.melody1music.project.framework.entity;

import com.melody1music.project.framework.dto.BaseDTO;

public abstract class Mapper <T extends BaseEntity, D extends BaseDTO>{
	
	public abstract T convertDataTransferObjectToEntity (D DTO);
	
	public abstract D getDataTransferObject();

}
