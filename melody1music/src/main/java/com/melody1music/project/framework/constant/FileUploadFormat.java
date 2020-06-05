package com.melody1music.project.framework.constant;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
public enum FileUploadFormat {

	MP3("audio/mpeg"), 
	PNG("2"), 
	JPEG("1");

	private final String format;

}
