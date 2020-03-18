package com.shuttle.model.dto;

import java.sql.Date;

public class TableJob {
	// 의뢰(아르바이트) 게시판 테이블
	
	
	 // 글번호 
    private int jobSeq;

    // 아이디 
    private String userId;

    // 제목 
    private String jobTitle;

    // 내용 
    private String jobContent;

    // 보상 
    private int jobReward;

    // 장소 
    private String jobAddr;

    // 유형 
    private String jobCategory;

    // 완료여부 
    private String jobComplete;

    // 작성날짜 
    private String jobDate;

    // 알바시작날짜 
    private Date jobStart;

    // 알바종료날짜 
    private Date jobDone;

    // 조회수 
    private int jobView;

    public int getJobSeq() {
        return jobSeq;
    }

    public void setJobSeq(int jobSeq) {
        this.jobSeq = jobSeq;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobContent() {
        return jobContent;
    }

    public void setJobContent(String jobContent) {
        this.jobContent = jobContent;
    }

    public int getJobReward() {
        return jobReward;
    }

    public void setJobReward(int jobReward) {
        this.jobReward = jobReward;
    }

    public String getJobAddr() {
        return jobAddr;
    }

    public void setJobAddr(String jobAddr) {
        this.jobAddr = jobAddr;
    }

    public String getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }

    public String getJobComplete() {
        return jobComplete;
    }

    public void setJobComplete(String jobComplete) {
        this.jobComplete = jobComplete;
    }

    public String getJobDate() {
        return jobDate;
    }

    public void setJobDate(String jobDate) {
        this.jobDate = jobDate;
    }

    public Date getJobStart() {
        return jobStart;
    }

    public void setJobStart(Date jobStart) {
        this.jobStart = jobStart;
    }

    public Date getJobDone() {
        return jobDone;
    }

    public void setJobDone(Date jobDone) {
        this.jobDone = jobDone;
    }

    public int getJobView() {
        return jobView;
    }

    public void setJobView(int jobView) {
        this.jobView = jobView;
    }

}
