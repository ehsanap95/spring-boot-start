package com.melody1music.project.music.entity;

import javax.persistence.Entity;
import com.melody1music.project.framework.entity.BaseEntity;
import com.melody1music.project.music.dto.PersonDTO;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Person extends BaseEntity<Person, PersonDTO>{
		
	private static final long serialVersionUID = 1L;

	private String name;
	
	private String age;

	@Override
	public Person convertDataTransferObjectToEntity(PersonDTO DTO) {
		this.setId(DTO.getId());
		this.setPublishingDate(DTO.getPublishingDate());
		this.setVersion(DTO.getVersion());
		this.setEnabled(DTO.getEnabled());
		this.setAge(DTO.getAge());
		this.setName(DTO.getName());
		return this;
	}

	@Override
	public PersonDTO getDataTransferObject() {
		PersonDTO personDTO=new PersonDTO();
		personDTO.setId(this.getId());
		personDTO.setPublishingDate(this.getPublishingDate());
		personDTO.setVersion(this.getVersion());
		personDTO.setEnabled(this.getEnabled());
		personDTO.setName(this.getName());
		personDTO.setAge(this.getAge());
		return personDTO;
	}
	
}
