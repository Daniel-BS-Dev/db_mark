package com.db_mark.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db_mark.demo.dtos.HairdresserDTO;
import com.db_mark.demo.services.HairdresserService;

@RestController
@RequestMapping(value = "/hairdresser")
public class HairdresserResource {

	@Autowired
	private HairdresserService service;

	@GetMapping
	public ResponseEntity<List<HairdresserDTO>> findAll(
	) {
		List<HairdresserDTO> list = service.findAllPage();

		return ResponseEntity.ok().body(list);
	}
}
