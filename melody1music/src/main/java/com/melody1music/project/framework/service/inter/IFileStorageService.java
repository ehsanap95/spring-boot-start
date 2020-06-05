package com.melody1music.project.framework.service.inter;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface IFileStorageService {
	
	String storeFile(MultipartFile file, long maxValue, String... formats);
	
    Resource loadFileAsResource(String fileName);
	
	
}
