package com.melody1music.project.framework.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class BaseDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private UUID id;
	
	private LocalDateTime publishingDate;
	
	private int version;

}
