package com.chaitu.mydiary.beans;

import java.util.Date;
import java.util.UUID;

public class Diary {
	public UUID getDiaryId() {
		return diaryId;
	}
	public void setDiaryId(UUID diaryId) {
		this.diaryId = diaryId;
	}
	public String getDiaryName() {
		return diaryName;
	}
	public void setDiaryName(String diaryName) {
		this.diaryName = diaryName;
	}
	public Date getDiaryCreation() {
		return diaryCreation;
	}
	public void setDiaryCreation(Date diaryCreation) {
		this.diaryCreation = diaryCreation;
	}
	public Diary(UUID diaryId, String diaryName, Date diaryCreation) {
		super();
		this.diaryId = diaryId;
		this.diaryName = diaryName;
		this.diaryCreation = diaryCreation;
	}
	private UUID diaryId;
	String diaryName;
	Date diaryCreation;
}
