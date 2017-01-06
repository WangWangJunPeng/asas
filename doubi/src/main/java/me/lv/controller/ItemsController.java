package me.lv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import me.lv.pojo.Items;
import me.lv.service.ItemsService;

@Controller
public class ItemsController {

	@Autowired
	private ItemsService itemsService;

	@RequestMapping("/show")
	public String showItems(Model model) {

		List<Items> itemses = itemsService.getItemses();

		for (Items items : itemses) {
			System.out.println(items);
		}
		
		model.addAttribute("aaa", itemses);

		return "index";
	}

}
