package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * BookController
 *
 * @author: Filip Ambroziak
 * Date: 28.02.18
 * Time: 09:56
 * Company: © Atende Software Sp. z o.o.
 * Copyright: © Atende Software Sp. z o.o.
 */
@RestController
class BookController {

	@RequestMapping("/test")
	private String test() {
		return "test";
	}
}
