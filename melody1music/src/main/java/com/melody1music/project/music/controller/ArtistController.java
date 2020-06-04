package com.melody1music.project.music.controller;

import com.melody1music.project.music.dto.ArtistDTO;
import com.melody1music.project.music.dto.PersonDTO;
import com.melody1music.project.music.service.inter.IArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/artist")
public class ArtistController {

    @Autowired
    private IArtistService iArtistService;

    @GetMapping("/getAllPersons")
    public List<ArtistDTO> getAllArtists() {
        return iArtistService.findAll();
    }
    
	@PutMapping("/groupArtist")
	public String updatePerson(@RequestBody List<ArtistDTO> artistDTOs) {
		for (ArtistDTO artistDTO : artistDTOs) {
			System.out.println(artistDTO.getFullName());
		}
		return "Get It";
	}
    
}
