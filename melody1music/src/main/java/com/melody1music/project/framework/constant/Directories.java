package com.melody1music.project.framework.constant;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
public enum Directories {
	
	MUSIC("/home/ehsanap95/Music/Upload/"), 
	PHOTO("2");

	private final String directory;
	
}
