package com.db_mark.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db_mark.demo.dtos.StyleHairDTO;
import com.db_mark.demo.services.StyleHairService;

@RestController
@RequestMapping(value = "/styleHair")
public class StyleHairResource {

	@Autowired
	private StyleHairService service;

	@GetMapping
	public ResponseEntity<List<StyleHairDTO>> findAll(
	) {
		List<StyleHairDTO> list = service.findAllPage();

		return ResponseEntity.ok().body(list);
	}
}
