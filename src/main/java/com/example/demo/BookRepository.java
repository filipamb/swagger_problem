package com.example.demo;

import org.springframework.data.repository.CrudRepository;

/**
 * BookRepository
 *
 * @author: Filip Ambroziak
 * Date: 28.02.18
 * Time: 09:55
 * Company: © Atende Software Sp. z o.o.
 * Copyright: © Atende Software Sp. z o.o.
 */
interface BookRepository extends CrudRepository<Book, Integer> {
}
