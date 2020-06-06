package com.melody1music.project.music.service.inter;

import com.melody1music.project.framework.service.inter.IGenericService;
import com.melody1music.project.music.dto.ArtistDTO;
import com.melody1music.project.music.entity.Artist;

public interface IArtistService extends IGenericService<Artist, ArtistDTO> {

    ArtistDTO save(ArtistDTO entity);


    ArtistDTO update(ArtistDTO entity);

    ArtistDTO findByName(String name);

    ArtistDTO findByNameNative(String name);
}
