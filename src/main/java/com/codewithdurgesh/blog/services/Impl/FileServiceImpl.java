package com.codewithdurgesh.blog.services.Impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.codewithdurgesh.blog.services.FileService;


@Service
public class FileServiceImpl implements FileService {

	@Override
	public String uploadImage(String path, MultipartFile file) throws IOException {
		// 1. file name
		String name = file.getOriginalFilename();     // e.g. name = abc.jpg
		
		String randomId = UUID.randomUUID().toString();
		String fileName1 = randomId.concat(name.substring(name.lastIndexOf(".")));
		
		// 2. file full path
		String filePath = path + File.separator + fileName1;  // e.g. /c/springboot/abc.jpg
		

		
		// 3. create folder if not created
		File f = new File(path);
		if(!(f.exists())) {
			f.mkdir();
		}
		
		// 4. file copy
		Files.copy(file.getInputStream(), Paths.get(filePath));
		
		
		return fileName1;
	}

	@Override
	public InputStream getResource(String path, String fileName) throws FileNotFoundException {
		String fullPath = path + File.separator + fileName;
		
		InputStream is = new FileInputStream(fullPath);
		
		return is;
	}

}
