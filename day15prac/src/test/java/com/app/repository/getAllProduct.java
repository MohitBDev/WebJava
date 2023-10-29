package com.app.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.app.entities.product;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE) 
@Rollback(false)
class getAllProduct {
	@Autowired
	private daorRepo dao;

	@Test
	void getalltest() {
		List<product> lists=List.of(new product("chips", 4, 123, "eatables"),
				new product("biscuts", 12, 45, "eatables"),
				new product("yui", 2, 56, "eatables"),
				new product("juice", 3, 34, "eatables")
				);
		List<product> list2 = dao.saveAll(lists);
		assertEquals(4, list2.size());
	
	}

}
