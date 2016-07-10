package com.yaesta.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yaesta.persistence.entity.Supplier;
import com.yaesta.persistence.service.SupplierService;

@RestController
@RequestMapping(value = "/supplier")
public class SupplierController {

	@Autowired
	SupplierService supplierService;
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public  ResponseEntity<List<Supplier>> getAll(){
		
		List<Supplier> found = supplierService.getSuppliers();
	
	    if(found!=null && !found.isEmpty()){
	    	return new ResponseEntity<List<Supplier>>(found, HttpStatus.OK);
	    }else{
	    	return new ResponseEntity<List<Supplier>>(new ArrayList<Supplier>(),HttpStatus.OK);
	    }
	}
	
}
