package com.yaesta.app.persistence.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yaesta.app.persistence.entity.CoberturaTCC;
import com.yaesta.app.persistence.service.CoberturaTCCService;
import com.yaesta.app.persistence.vo.CoberturaTCCVO;

@RestController
@RequestMapping(value = "/coberturaTcc")
public class CoberturaTccController {

	@Autowired
	CoberturaTCCService coberturaTCCService;
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public  ResponseEntity<List<CoberturaTCC>> getAll(){
		
		List<CoberturaTCC> found = coberturaTCCService.getAll();
	
	    if(found!=null && !found.isEmpty()){
	    	return new ResponseEntity<List<CoberturaTCC>>(found, HttpStatus.OK);
	    }else{
	    	return new ResponseEntity<List<CoberturaTCC>>(new ArrayList<CoberturaTCC>(),HttpStatus.OK);
	    }
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<CoberturaTCC> update(@RequestBody CoberturaTCCVO zoneVO){
		
		CoberturaTCC response = coberturaTCCService.save(zoneVO.getZone());
		
		return new ResponseEntity<CoberturaTCC>(response,HttpStatus.OK);
	}
}
