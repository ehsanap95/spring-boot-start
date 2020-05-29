package com.melody1music.project.music.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.melody1music.project.framework.service.impl.GenericServiceImpl;
import com.melody1music.project.music.dto.PersonDTO;
import com.melody1music.project.music.entity.Person;
import com.melody1music.project.music.repository.inter.IPersonRepository;
import com.melody1music.project.music.service.inter.IPersonService;

@Service
public class PersonServiceImpl extends GenericServiceImpl<Person, PersonDTO> implements IPersonService {

	@Autowired
    private IPersonRepository iPersonRepository;
	
	@Override
	public PersonDTO findByName(String name) {
		return iPersonRepository.findByName(name).getDataTransferObject(); 
	}

	@Override
	public PersonDTO findByNameNative(String name) {
		return iPersonRepository.findByNameNative(name).getDataTransferObject(); 
	}
	
	@Override
	public PersonDTO save(PersonDTO entity) {
		Person person=new Person();
		person.setName(entity.getName());
		person.setAge("1045");
		return super.save(person);
	}

	@Override
	public PersonDTO update(PersonDTO entity) {
		Optional<Person> personOptional=iPersonRepository.findById(entity.getId());
		if(personOptional.isPresent()) {
		Person person=personOptional.get();
		person.setName(entity.getName());
		person.setAge("10499");
		return super.save(person);
		}else {
			return null;
		}
	}
	
}
