package com.melody1music.project.music.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.melody1music.project.framework.constant.FileUploadFormat;
import com.melody1music.project.framework.payload.UploadFileResponse;
import com.melody1music.project.framework.service.inter.IFileStorageService;
import com.melody1music.project.music.dto.PersonDTO;
import com.melody1music.project.music.service.inter.IPersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private IPersonService iPersonService;
	
	@Autowired
    private IFileStorageService iFileStorageService;

	@GetMapping("/getAllPersons")
	public List<PersonDTO> getAllPersons() {
		return iPersonService.findAll();
	}

	@GetMapping("/getPersonById")
	public PersonDTO getPersonById(@RequestHeader UUID id) {
		return iPersonService.findById(id);
	}

	@GetMapping("/getPersonByName")
	public String getPersonByName(@RequestHeader String name) {
		return "Person By Name:" + iPersonService.findByNameNative(name);
	}

	@PostMapping("/createPerson")
	public PersonDTO createUser(@RequestHeader String name) {
		PersonDTO personDTO = new PersonDTO();
		personDTO.setName(name);
		return iPersonService.save(personDTO);
	}

	@PutMapping("/updatePerson")
	public PersonDTO updatePerson(@RequestBody PersonDTO person) {
		return iPersonService.update(person);
	}

	@DeleteMapping("/deletePerson")
	public String deleteUser(@RequestHeader UUID id) {
		iPersonService.deleteById(id);
		return "Delete Person: ";
	}

	@PutMapping("/listPerson")
	public String updatePerson(@RequestBody List<PersonDTO> persons) {
		for (PersonDTO personDTO : persons) {
			System.out.println(personDTO.getName());
		}
		return "Hello";
	}
	
    @PostMapping("/upload")
    public UploadFileResponse uploadFile(MultipartFile file) {
        String fileName = iFileStorageService.storeFile(file,999999999,FileUploadFormat.MP3.getFormat());
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath().path(fileName).toUriString();
        return new UploadFileResponse(fileName, fileDownloadUri,file.getContentType(), file.getSize());
    }

    @PostMapping("/uploadMulti")
    public List<UploadFileResponse> uploadMultipleFiles(MultipartFile[] files) {
        return Arrays.asList(files).stream().map(file -> uploadFile(file)).collect(Collectors.toList());
    }
    
//    @GetMapping("/download/{fileName:.+}")
    @GetMapping("/download")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
        Resource resource = iFileStorageService.loadFileAsResource(fileName);
        String contentType = null;
        try {
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        } catch (IOException ex) {
            //Log
        }
        return ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"").body(resource);
    }

}
