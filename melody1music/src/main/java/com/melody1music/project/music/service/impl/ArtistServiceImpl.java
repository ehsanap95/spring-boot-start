package com.melody1music.project.music.service.impl;

import com.melody1music.project.framework.service.impl.GenericServiceImpl;
import com.melody1music.project.music.dto.ArtistDTO;
import com.melody1music.project.music.entity.Artist;
import com.melody1music.project.music.service.inter.IArtistService;
import org.springframework.stereotype.Service;

@Service
public class ArtistServiceImpl extends GenericServiceImpl<Artist, ArtistDTO> implements IArtistService {

    @Override
    public ArtistDTO save(ArtistDTO entity) {
        return null;
    }

    @Override
    public ArtistDTO update(ArtistDTO entity) {
        return null;
    }

    @Override
    public ArtistDTO findByName(String name) {
        return null;
    }

    @Override
    public ArtistDTO findByNameNative(String name) {
        return null;
    }
}
