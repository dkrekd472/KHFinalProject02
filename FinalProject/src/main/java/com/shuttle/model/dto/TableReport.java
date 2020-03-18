package com.shuttle.model.dto;

import java.sql.Date;

public class TableReport {
	// 신고 

	    // 신고글번호 
	    private int reportSeq;

	    // 아이디 
	    private String userId;

	    // 신고작성자 
	    private String reportWriter;

	    // 글번호 
	    private int jobSeq;

	    // 제재날짜 
	    private String reportBlockDate;

	    // 신고날짜 
	    private Date reportDate;

	    // 신고내용 
	    private String reportContent;

	    // 신고유형 
	    private String reportCategory;

	    // 제재상태 
	    private String reportStatus;

	    public int getReportSeq() {
	        return reportSeq;
	    }

	    public void setReportSeq(int reportSeq) {
	        this.reportSeq = reportSeq;
	    }

	    public String getUserId() {
	        return userId;
	    }

	    public void setUserId(String userId) {
	        this.userId = userId;
	    }

	    public String getReportWriter() {
	        return reportWriter;
	    }

	    public void setReportWriter(String reportWriter) {
	        this.reportWriter = reportWriter;
	    }

	    public int getJobSeq() {
	        return jobSeq;
	    }

	    public void setJobSeq(int jobSeq) {
	        this.jobSeq = jobSeq;
	    }

	    public String getReportBlockDate() {
	        return reportBlockDate;
	    }

	    public void setReportBlockDate(String reportBlockDate) {
	        this.reportBlockDate = reportBlockDate;
	    }

	    public Date getReportDate() {
	        return reportDate;
	    }

	    public void setReportDate(Date reportDate) {
	        this.reportDate = reportDate;
	    }

	    public String getReportContent() {
	        return reportContent;
	    }

	    public void setReportContent(String reportContent) {
	        this.reportContent = reportContent;
	    }

	    public String getReportCategory() {
	        return reportCategory;
	    }

	    public void setReportCategory(String reportCategory) {
	        this.reportCategory = reportCategory;
	    }

	    public String getReportStatus() {
	        return reportStatus;
	    }

	    public void setReportStatus(String reportStatus) {
	        this.reportStatus = reportStatus;
	    }

}
