package com.shuttle.model.dto;

public class TableUser {
	// 유저 상세 정보
	

	// 아이디(이메일)
	private String userId;

	// 이름
	private String userName;

	// 비밀번호
	private String userPw;

	// 전화번호
	private String userPhone;

	// 주소
	private String userAddr;

	// 화폐갯수
	private int userCoin;

	// 회원상태
	private String userStatus;

	// 이미지경로
	private String userImgpath;

	// 계좌
	private String userAccount;

	// 제재기간
	private int userBlockDate;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserAddr() {
		return userAddr;
	}

	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}

	public int getUserCoin() {
		return userCoin;
	}

	public void setUserCoin(int userCoin) {
		this.userCoin = userCoin;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getUserImgpath() {
		return userImgpath;
	}

	public void setUserImgpath(String userImgpath) {
		this.userImgpath = userImgpath;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public int getUserBlockDate() {
		return userBlockDate;
	}

	public void setUserBlockDate(int userBlockDate) {
		this.userBlockDate = userBlockDate;
	}
}
