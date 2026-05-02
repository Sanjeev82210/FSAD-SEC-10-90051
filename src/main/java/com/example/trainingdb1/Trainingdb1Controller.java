package com.example.trainingdb1;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trainingdb1")
public class Trainingdb1Controller {

	private final Trainingdb1Repository repository;

	public Trainingdb1Controller(Trainingdb1Repository repository) {
		this.repository = repository;
	}

	@PostMapping
	public trainingdb1 create(@RequestBody trainingdb1 entity) {
		return repository.save(entity);
	}

	@GetMapping
	public List<trainingdb1> findAll() {
		return repository.findAll();
	}

	@GetMapping("/sorted")
	public List<trainingdb1> sorted(@RequestParam(defaultValue = "name") String sortBy,
			@RequestParam(defaultValue = "asc") String direction) {
		Sort sort = direction.equalsIgnoreCase("desc") ? Sort.by(sortBy).descending() : Sort.by(sortBy).ascending();
		return repository.findAll(sort);
	}

	@GetMapping("/page")
	public Page<trainingdb1> paged(@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "2") int size) {
		Pageable pageable = PageRequest.of(page, size);
		return repository.findAll(pageable);
	}
}
