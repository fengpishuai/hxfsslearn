package com.hlic.base.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;

public interface FileUploadAndDownService {

	List<String> uploadFile(HttpServletRequest request) throws FileNotFoundException;
	ResponseEntity<byte[]> downFileResponseEntity(String fBillId) throws IOException;
}
