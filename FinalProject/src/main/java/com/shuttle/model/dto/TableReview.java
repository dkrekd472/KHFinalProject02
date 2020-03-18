package com.shuttle.model.dto;

public class TableReview {
	// 리뷰 정보
	
	
	// 아이디(점수준사람)
	private String reviewOwner;

	// 아이디(점수받은사람)
	private String reviewWorker;

	// 별점
	private String reviewScore;

	// 유형
	private String reviewCategory;

	// 글내용
	private String reviewContent;

	public String getReviewOwner() {
		return reviewOwner;
	}

	public void setReviewOwner(String reviewOwner) {
		this.reviewOwner = reviewOwner;
	}

	public String getReviewWorker() {
		return reviewWorker;
	}

	public void setReviewWorker(String reviewWorker) {
		this.reviewWorker = reviewWorker;
	}

	public String getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(String reviewScore) {
		this.reviewScore = reviewScore;
	}

	public String getReviewCategory() {
		return reviewCategory;
	}

	public void setReviewCategory(String reviewCategory) {
		this.reviewCategory = reviewCategory;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}
}
