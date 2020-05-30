package com.melody1music.project.framework.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import com.melody1music.project.framework.dto.BaseDTO;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
public abstract class BaseEntity <T extends BaseEntity<?, ?>,D extends BaseDTO> extends Mapper<T,D> implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(updatable = false, nullable = false)
	@GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator",
    parameters = {@Parameter(name = "uuid_gen_strategy_class", value = "org.hibernate.id.uuid.CustomVersionOneStrategy")})
	private UUID id;
	
	@Column(name = "PUBLISHING_DATE",updatable = false,nullable = false)
	private LocalDateTime publishingDate;
			
	@Version
	private int version;
	
}
