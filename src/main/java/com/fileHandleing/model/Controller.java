package com.fileHandleing.model;

import java.io.IOException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/")
public class Controller {
	
	List<byte[]> blob;
	
	@PostMapping("/")
	public ResponseEntity<?> uploadFile(@RequestBody MultipartFile file) throws IOException {
		this.blob=List.of(file.getBytes());
		System.out.println(file.getInputStream());
		return ResponseEntity.status(HttpStatus.OK)
							 .header("File Size", "file.getSize()")
							 .contentType(MediaType.parseMediaType(file.getContentType()))
							 .body(file.getBytes());
	}
}
