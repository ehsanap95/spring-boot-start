package com.melody1music.project.music.controller;

import com.melody1music.project.music.dto.ArtistDTO;
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
//		[
//		    {
//		        "id": "7f000101-7266-108f-8172-6680c4d70000",
//		        "publishingDate": "2020-05-30T21:23:34.541",
//		        "version": 0,
//		    },
//		    {
//		        "id": "7f000101-7266-108f-8172-66820b1c0001",
//		        "publishingDate": "2020-05-30T21:24:58.075",
//		        "version": 0,
//		    },
//		    {
//		        "id": "7f000101-7266-108f-8172-66820d7b0002",
//		        "publishingDate": "2020-05-30T21:24:58.683",
//		        "version": 0,
//		    }
//		]
		return "Get It";
	}
    
}
