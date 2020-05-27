package com.melody1music.project.framework.dto;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class BaseDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private int version;

}
