package me.lv.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.lv.dao.ItemsDao;
import me.lv.pojo.Items;
import me.lv.service.ItemsService;

@Service
public class ItemsServiceImpl implements ItemsService {

	@Autowired
	private ItemsDao itemsDao;

	public List<Items> getItemses() {
		return itemsDao.selectItems();
	}

}
