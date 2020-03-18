package com.shuttle.model.dto;

public class TableApply {
	// 신청현황
	
	
	// 피고용인 
    private String applyWoker;

    // 고용인 
    private String applyOwner;

    // 글번호 
    private int applySeq;

    public String getApplyWoker() {
        return applyWoker;
    }

    public void setApplyWoker(String applyWoker) {
        this.applyWoker = applyWoker;
    }

    public String getApplyOwner() {
        return applyOwner;
    }

    public void setApplyOwner(String applyOwner) {
        this.applyOwner = applyOwner;
    }

    public int getApplySeq() {
        return applySeq;
    }

    public void setApplySeq(int applySeq) {
        this.applySeq = applySeq;
    }

}
