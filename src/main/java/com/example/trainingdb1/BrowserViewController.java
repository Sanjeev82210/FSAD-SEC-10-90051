package com.example.trainingdb1;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BrowserViewController {

	private final Trainingdb1Repository repository;

	public BrowserViewController(Trainingdb1Repository repository) {
		this.repository = repository;
	}

	@GetMapping(value = { "/", "/view" }, produces = MediaType.TEXT_HTML_VALUE)
	@ResponseBody
	public String home(@RequestParam(defaultValue = "name") String sortBy,
			@RequestParam(defaultValue = "asc") String direction,
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "2") int size) {
		Sort sort = direction.equalsIgnoreCase("desc") ? Sort.by(sortBy).descending() : Sort.by(sortBy).ascending();
		List<trainingdb1> sortedRecords = repository.findAll(sort);
		Page<trainingdb1> pagedRecords = repository.findAll(PageRequest.of(page, size));

		StringBuilder html = new StringBuilder();
		html.append("<!doctype html><html><head><title>trainingdb1 output</title>");
		html.append("<style>");
		html.append("body{font-family:Arial,sans-serif;margin:24px;background:#f7f7fb;color:#222;}");
		html.append("table{border-collapse:collapse;width:100%;margin:12px 0 24px;background:#fff;}");
		html.append("th,td{border:1px solid #ccc;padding:8px;text-align:left;}");
		html.append("th{background:#efefef;}");
		html.append(".card{background:#fff;padding:16px;border:1px solid #ddd;border-radius:8px;margin-bottom:20px;}");
		html.append("a{color:#0b5ed7;text-decoration:none;}");
		html.append("code{background:#f1f1f1;padding:2px 4px;border-radius:4px;}");
		html.append("</style></head><body>");
		html.append("<h1>trainingdb1 records</h1>");
		html.append("<div class='card'>");
		html.append("<p>Open these URLs to see sorting and pagination in the browser:</p>");
		html.append("<ul>");
		html.append("<li><a href='/view?sortBy=name&direction=asc&page=0&size=2'>Sorted by name ascending with page 0 size 2</a></li>");
		html.append("<li><a href='/view?sortBy=fee&direction=desc&page=0&size=3'>Sorted by fee descending with page 0 size 3</a></li>");
		html.append("</ul>");
		html.append("</div>");

		html.append("<div class='card'><h2>All records sorted by ").append(sortBy).append(" (" ).append(direction).append(")</h2>");
		html.append("<table><thead><tr><th>ID</th><th>Name</th><th>Fee</th><th>Duration</th></tr></thead><tbody>");
		for (trainingdb1 record : sortedRecords) {
			html.append("<tr>");
			html.append("<td>").append(record.getId()).append("</td>");
			html.append("<td>").append(record.getName()).append("</td>");
			html.append("<td>").append(record.getFee()).append("</td>");
			html.append("<td>").append(record.getDuration()).append("</td>");
			html.append("</tr>");
		}
		html.append("</tbody></table></div>");

		html.append("<div class='card'><h2>Page ").append(page).append(" of ").append(Math.max(pagedRecords.getTotalPages(), 1)).append("</h2>");
		html.append("<table><thead><tr><th>ID</th><th>Name</th><th>Fee</th><th>Duration</th></tr></thead><tbody>");
		for (trainingdb1 record : pagedRecords.getContent()) {
			html.append("<tr>");
			html.append("<td>").append(record.getId()).append("</td>");
			html.append("<td>").append(record.getName()).append("</td>");
			html.append("<td>").append(record.getFee()).append("</td>");
			html.append("<td>").append(record.getDuration()).append("</td>");
			html.append("</tr>");
		}
		html.append("</tbody></table>");
		html.append("<p>Total records: ").append(pagedRecords.getTotalElements()).append("</p>");
		html.append("</div>");

		html.append("</body></html>");
		return html.toString();
	}
}