package com.shuttle.model.dto;

public class TableChat {
	//채팅기록
	
	
	// 채팅방번호
	private int chatSeq;

	// 아이디1
	private String chatId1;

	// 아이디2
	private String chatId2;

	// 대화내용경로
	private String chatPath;

	public int getChatSeq() {
		return chatSeq;
	}

	public void setChatSeq(int chatSeq) {
		this.chatSeq = chatSeq;
	}

	public String getChatId1() {
		return chatId1;
	}

	public void setChatId1(String chatId1) {
		this.chatId1 = chatId1;
	}

	public String getChatId2() {
		return chatId2;
	}

	public void setChatId2(String chatId2) {
		this.chatId2 = chatId2;
	}

	public String getChatPath() {
		return chatPath;
	}

	public void setChatPath(String chatPath) {
		this.chatPath = chatPath;
	}
}
