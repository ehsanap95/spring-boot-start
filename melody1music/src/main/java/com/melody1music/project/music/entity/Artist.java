package com.melody1music.project.music.entity;

import com.melody1music.project.framework.entity.BaseEntity;
import com.melody1music.project.music.dto.ArtistDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Artist extends BaseEntity<Artist, ArtistDTO> {

	private static final long serialVersionUID = 1L;
	
	private String fullName;
    private String nickName;
    private String birthDate;
    private String bio;

    @Override
    public Artist convertDataTransferObjectToEntity(ArtistDTO DTO) {
        this.setId(DTO.getId());
        this.setPublishingDate(DTO.getPublishingDate());
        this.setVersion(DTO.getVersion());

        this.setFullName(DTO.getFullName());
        this.setNickName(DTO.getNickName());
        this.setBirthDate(DTO.getBirthDate());
        this.setBio(DTO.getBio());

        return this;
    }

    @Override
    public ArtistDTO getDataTransferObject() {
        ArtistDTO artistDTO = new ArtistDTO();

        artistDTO.setId(this.getId());
        artistDTO.setPublishingDate(this.getPublishingDate());
        artistDTO.setVersion(this.getVersion());

        artistDTO.setFullName(this.getFullName());
        artistDTO.setNickName(this.getNickName());
        artistDTO.setBirthDate(this.getBirthDate());
        artistDTO.setBio(this.getBio());

        return artistDTO;
    }
}
