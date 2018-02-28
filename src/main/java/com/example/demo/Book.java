package com.example.demo;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * Book
 *
 * @author: Filip Ambroziak
 * Date: 28.02.18
 * Time: 09:54
 * Company: © Atende Software Sp. z o.o.
 * Copyright: © Atende Software Sp. z o.o.
 */
@Data
class Book {

	@Id
	private final int id;

	private final String name;
}
