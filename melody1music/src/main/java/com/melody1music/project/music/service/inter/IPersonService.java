package com.melody1music.project.music.service.inter;

import com.melody1music.project.framework.service.inter.IGenericService;
import com.melody1music.project.music.dto.PersonDTO;
import com.melody1music.project.music.entity.Person;

public interface IPersonService extends IGenericService<Person, PersonDTO>{

	
	PersonDTO save(PersonDTO entity);
	
	
    PersonDTO update(PersonDTO entity);
	
	PersonDTO findByName(String name);

	PersonDTO findByNameNative(String name);
}
