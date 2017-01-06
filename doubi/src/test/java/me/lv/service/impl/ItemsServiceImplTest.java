package me.lv.service.impl;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import me.lv.dao.ItemsDao;
import me.lv.pojo.Items;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml","classpath:springmvc.xml"})

public class ItemsServiceImplTest {
	
	@Autowired
	private ItemsDao itmesDao;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetItemses() {
		List<Items> itmes = itmesDao.selectItems();
		for (Items items : itmes) {
			System.out.println(items);
		}
	}
}
