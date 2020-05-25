package com.melody1music.project.framework.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.melody1music.project.framework.dto.BaseDTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
public abstract class BaseEntity <T extends BaseEntity,D extends BaseDTO> extends Mapper<T,D> implements Serializable{

	@Id
	@Column(name = "ID",unique = true,nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
}
