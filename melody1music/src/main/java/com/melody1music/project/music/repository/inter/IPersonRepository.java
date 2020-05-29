package com.melody1music.project.music.repository.inter;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.melody1music.project.framework.repository.inter.IGenericRepository;
import com.melody1music.project.music.entity.Person;

@Repository
public interface IPersonRepository extends IGenericRepository<Person>{

	@Query("FROM Person p WHERE p.name = :name")
	Person findByName(@Param("name") String name);
	
	@Query(value = "SELECT * FROM person p WHERE p.name = :name",nativeQuery = true)
	Person findByNameNative(@Param("name") String name);
	
}
