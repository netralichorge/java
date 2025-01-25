package com.learn.Ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import com.learn.Ecommerce.entity.Product;
import com.learn.Ecommerce.repository.ProductRepository;
import com.learn.Ecommerce.service.FileService;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.util.StreamUtils;


@RestController // to make class as a controller
@CrossOrigin
public class ProductController {
	
	@Value("${product.image.path}")
	private String imagePath;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private FileService fileService;
	
	//upload user image
	   @PostMapping("products/{productId}/image")
	   public ResponseEntity<String> uploadUserImage(@RequestParam("productImage") MultipartFile image, @PathVariable int productId) throws IOException, java.io.IOException {
	       String imageName = fileService.uploadFile(image, imagePath);
	        Product product = productRepository.findById(productId).get();
	        System.out.println("ImageName"+imageName);
	        product.setProductImage(imageName);
	        productRepository.save(product);
	       return new ResponseEntity<String>("Successs",HttpStatus.ACCEPTED);
	   }
	   
	   @GetMapping(value = "products/{productId}/image")
	   public void serveUserImage(@PathVariable int productId, HttpServletResponse response) throws  java.io.IOException {
	       Product product = productRepository.findById(productId).get();
	       InputStream resource = fileService.getResource(imagePath, product.getProductImage());
	       response.setContentType(MediaType.IMAGE_JPEG_VALUE);
	       StreamUtils.copy(resource, response.getOutputStream());
	   }


	

}
