package com.melody1music.project.music.dto;

import com.melody1music.project.framework.dto.BaseDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArtistDTO extends BaseDTO {
	
	private static final long serialVersionUID = 1L;
	
	private String fullName;
    private String nickName;
    private String birthDate;
    private String bio;
}
