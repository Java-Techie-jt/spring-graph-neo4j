package com.javatechie.spring.neo4j.api.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.javatechie.spring.neo4j.api.node.Book;

public interface BookRepository extends Neo4jRepository<Book, String> {

	Book findByName(String name);

}
