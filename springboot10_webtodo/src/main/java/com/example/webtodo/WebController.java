package com.example.webtodo;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class WebController 
{
	/* Su dung tam List de chua danh sach cong viec
	 * Thay cho database
	 * Chi dung cach nay khi DEMO
	 */
	List<Todo> todoList = new CopyOnWriteArrayList<Todo>();
	
	/* @RequestParam dung de danh dau 1 bien la request param trong request gui
	 * No se gan du lieu cua param-name tuong ung vao bien
	 */
	@GetMapping("/listTodo")
	public String index(Model model,
						@RequestParam(value = "limit", required = false) Integer limit)
	{
		/* Tra ve doi tuong todoList
		 * Neu nguoi dung gui den param limit thi tra vesublist cua todolist
		 */
		model.addAttribute("todoList", limit != null ? todoList.subList(0, limit) : todoList);
		
		/* Tra ve template "listTodo.html" */
		return "listTodo";
	}
	
	/* Tra ve Web page cho nguoi dung nhap thong tin cong viec va them vao danh sach viec can lam */
	@GetMapping("/addTodo")
	public String addTodo(Model model)
	{
		/* Create new object Todo into model */
		model.addAttribute("todo", new Todo());
		/* Return template addTodo.html */
		return "addTodo";
	}
	
	/* @ModeAttribute danh dau doi tuong duoc gui len boi Form Request */
	@PostMapping("/addTodo")
	public String addTodo(@ModelAttribute Todo todo)
	{
		/* Add object todo into list */
		todoList.add(todo);
		/* Return page success.html */
		return "success";
	}
}
