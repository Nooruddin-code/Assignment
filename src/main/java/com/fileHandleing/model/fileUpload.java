package com.fileHandleing.model;

import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RedisHash("FileUpload")
@EnableRedisRepositories
public class fileUpload {
	private String id;
	private String FileName;
	private Byte[] FileData;
	private String FileType;
}
