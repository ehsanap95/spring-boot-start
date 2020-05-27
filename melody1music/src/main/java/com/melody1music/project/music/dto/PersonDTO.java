package com.melody1music.project.music.dto;

import com.melody1music.project.framework.dto.BaseDTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PersonDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	private String name;
	
	private String age;
	
}
