package com.douzone.guestbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.douzone.guestbook.dao.GuestbookDao;
import com.douzone.guestbook.vo.GuestbookVo;

@Controller
public class GuestbookController {
	
	@Autowired
	private GuestbookDao guestbookDao;
	
	@RequestMapping("")
	public String list(Model model) {
		model.addAttribute("list", guestbookDao.getList());
		return "/WEB-INF/views/list.jsp";
	}
	
	@RequestMapping("/add")
	public String add(GuestbookVo vo) {
		System.out.println(vo);
		guestbookDao.insert(vo);
		return "redirect:/";
	}
	
	@RequestMapping("/deleteform/{no}")
	public String deleteform(@PathVariable("no") int no , Model model) {
		model.addAttribute("no", no);
		return "/WEB-INF/views/deleteform.jsp";
	}

	@RequestMapping("/delete")
	public String delete(GuestbookVo vo) {
		//guestbookDao.delete(no)
		GuestbookVo newVo=guestbookDao.select(vo.getNo());
		
		if(newVo.getPassword().equals(vo.getPassword())) {
			guestbookDao.delete(vo.getNo());
			return "redirect:/";
		}
		
		return "redirect:/deleteform/"+vo.getNo();
	}
}
