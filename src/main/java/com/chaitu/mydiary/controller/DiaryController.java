package com.chaitu.mydiary.controller;

import java.util.Date;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chaitu.mydiary.beans.Diary;

@RestController
@RequestMapping("/diary")
public class DiaryController {
	
	@RequestMapping(method = RequestMethod.GET)
	public Diary getDiaries() {
		Diary diary = new Diary(UUID.randomUUID(), "myDiary", new Date());
		
		return diary;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String addDiary(@RequestBody Diary diary) {
		System.out.println("Creating a new diary with name = "+diary.getDiaryName());
		return "Creating a new diary with name = "+diary.getDiaryName();
	}
}
