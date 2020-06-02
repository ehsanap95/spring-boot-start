package com.melody1music.project.music.repository.inter;

import com.melody1music.project.framework.repository.inter.IGenericRepository;
import com.melody1music.project.music.entity.Artist;
import org.springframework.stereotype.Repository;

@Repository
public interface IArtistRepository extends IGenericRepository<Artist> {
}
