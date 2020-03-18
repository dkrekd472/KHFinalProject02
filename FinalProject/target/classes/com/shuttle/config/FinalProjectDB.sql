


--*** 해당 DB파일은 확인만 해주세요.
--*** DB관련 sql문을 확인하거나 작업하실 때는 다른 프로젝트에서 sql을 만들어 작업해주세요.
--*** 이 파일에서 충돌이 가장 빈번하게 일어납니다. 여기서 수정 하지 마시고 확인하는 작업만 해주세요.


--유저 상세정보 테이블
--프라이머리키 USER_ID
--USER_ID를 TB_JOB, TB_APPLY, TB_CHAT, TB_REVIEW가 외래키로 잡고 있음
CREATE TABLE TB_USER
(
    USER_ID            VARCHAR2(50)      NOT NULL, 
    USER_NAME          VARCHAR2(20)      NOT NULL, 
    USER_PW            VARCHAR2(50)      NOT NULL, 
    USER_PHONE         VARCHAR2(20)      NULL, 
    USER_ADDR          VARCHAR2(2000)    NULL, 
    USER_COIN          NUMBER            NULL, 
    USER_STATUS        VARCHAR2(20)      NULL, 
    USER_IMGPATH       VARCHAR2(3000)    NULL, 
    USER_ACCOUNT       VARCHAR2(300)     NOT NULL, 
    USER_BLOCK_DATE    NUMBER            NULL, 
    CONSTRAINT TB_USER_PK PRIMARY KEY (USER_ID)
)

--의뢰(아르바이트) 상세정보 테이블
--프라이머리키 JOB_SEQ(시퀀스)
--JOB_SEQ를 TB_APPLY가 외래키로 잡고 있음
CREATE TABLE TB_JOB
(
    JOB_SEQ         NUMBER            NOT NULL, 
    USER_ID         VARCHAR2(50)      NOT NULL, 
    JOB_TITLE       VARCHAR2(1000)    NOT NULL, 
    JOB_CONTENT     VARCHAR2(3000)    NOT NULL, 
    JOB_REWARD      NUMBER            NOT NULL, 
    JOB_ADDR        VARCHAR2(2000)    NULL, 
    JOB_CATEGORY    VARCHAR2(50)      NOT NULL, 
    JOB_COMPLETE    VARCHAR2(50)      NOT NULL, 
    JOB_DATE        VARCHAR2(20)      NOT NULL, 
    JOB_START       DATE              NOT NULL, 
    JOB_DONE        DATE              NOT NULL, 
    JOB_VIEW        NUMBER            NULL, 
    CONSTRAINT TB_JOB_PK PRIMARY KEY (JOB_SEQ)
)

CREATE SEQUENCE TB_JOB_SEQ

ALTER TABLE TB_JOB
    ADD CONSTRAINT FK_TB_JOB_USER_ID_TB_USER_USER FOREIGN KEY (USER_ID)
        REFERENCES TB_USER (USER_ID)
        

--신고관련 상세정보 테이블 (관리자가 보는 테이블)
--프라이머리키 REPORT_SEQ(시퀀스)
--JOB_SEQ, USER_ID를 TB_APPLY가 외래키로 잡고 있음
CREATE TABLE TB_REPORT
(
    REPORT_SEQ           NUMBER           NOT NULL, 
    USER_ID              VARCHAR2(50)     NOT NULL, 
    REPORT_WRITER        VARCHAR2(50)     NOT NULL, 
    JOB_SEQ              NUMBER           NOT NULL, 
    REPORT_BLOCK_DATE    VARCHAR2(20)     NULL, 
    REPORT_DATE          DATE             NOT NULL, 
    REPORT_CONTENT       VARCHAR2(500)    NULL, 
    REPORT_CATEGORY      VARCHAR2(20)     NULL, 
    REPORT_STATUS        VARCHAR2(20)     NULL, 
    CONSTRAINT TB_REPORT_PK PRIMARY KEY (REPORT_SEQ)
)

CREATE SEQUENCE TB_REPORT_SEQ

--의뢰(아르바이트) 신청현황 확인 테이블 (의뢰인이 주로 보는 테이블)
--프라이머리키 X
CREATE TABLE TB_APPLY
(
    APPLY_WOKER    VARCHAR2(50)    NOT NULL, 
    APPLY_OWNER    VARCHAR2(50)    NOT NULL, 
    APPLY_SEQ      NUMBER          NOT NULL
)

ALTER TABLE TB_APPLY
    ADD CONSTRAINT FK_TB_APPLY_APPLY_WOKER_TB_USE FOREIGN KEY (APPLY_WOKER)
        REFERENCES TB_USER (USER_ID)
        
ALTER TABLE TB_APPLY
    ADD CONSTRAINT FK_TB_APPLY_APPLY_OWNER_TB_USE FOREIGN KEY (APPLY_OWNER)
        REFERENCES TB_USER (USER_ID)    
        
ALTER TABLE TB_APPLY DROP CONSTRAINT FK_TB_APPLY_APPLY_OWNER_TB_USE;

ALTER TABLE TB_APPLY
    ADD CONSTRAINT FK_TB_APPLY_APPLY_OWNER_TB_JOB FOREIGN KEY (APPLY_SEQ)
        REFERENCES TB_JOB (JOB_SEQ)
        
        
        
--채팅관련 테이블 (관리자가 보는 테이블)
--프라이머리키CHAT_SEQ(시퀀스)
CREATE TABLE TB_CHAT
(
    CHAT_SEQ     NUMBER            NOT NULL, 
    CHAT_ID1     VARCHAR2(50)      NOT NULL, 
    CHAT_ID2     VARCHAR2(50)      NOT NULL, 
    CHAT_PATH    VARCHAR2(3000)    NOT NULL, 
    CONSTRAINT TB_CHAT_PK PRIMARY KEY (CHAT_SEQ)
)

CREATE SEQUENCE TB_CHAT_SEQ

ALTER TABLE TB_CHAT
    ADD CONSTRAINT FK_TB_CHAT_CHAT_ID1_TB_USER_US FOREIGN KEY (CHAT_ID1)
        REFERENCES TB_USER (USER_ID)

ALTER TABLE TB_CHAT
    ADD CONSTRAINT FK_TB_CHAT_CHAT_ID2_TB_USER_US FOREIGN KEY (CHAT_ID2)
        REFERENCES TB_USER (USER_ID)
        
        
        
--리뷰관련 테이블 
--프라이머리키 X      
CREATE TABLE TB_REVIEW
(
    REVIEW_OWNER       VARCHAR2(50)      NOT NULL, 
    REVIEW_WORKER      VARCHAR2(50)      NOT NULL, 
    REVIEW_SCORE       VARCHAR2(50)      NOT NULL, 
    REVIEW_CATEGORY    VARCHAR2(20)      NOT NULL, 
    REVIEW_CONTENT     VARCHAR2(3000)    NULL   
)        
        
ALTER TABLE TB_REVIEW
    ADD CONSTRAINT FK_TB_REVIEW_REVIEW_OWNER_TB_U FOREIGN KEY (REVIEW_OWNER)
        REFERENCES TB_USER (USER_ID)

ALTER TABLE TB_REVIEW
    ADD CONSTRAINT FK_TB_REVIEW_REVIEW_WORKER_TB_ FOREIGN KEY (REVIEW_WORKER)
        REFERENCES TB_USER (USER_ID)