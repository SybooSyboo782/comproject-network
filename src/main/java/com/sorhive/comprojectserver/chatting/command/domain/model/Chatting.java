package com.sorhive.comprojectserver.chatting.command.domain.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * <pre>
 * Class : Chatting
 * Comment: 클래스에 대한 간단 설명
 * History
 * ================================================================
 * DATE             AUTHOR           NOTE
 * ----------------------------------------------------------------
 * 2022-11-02       부시연           최초 생성
 * </pre>
 *
 * @author 부시연(최초 작성자)
 * @version 1(클래스 버전)
 */
@Entity
@Table(name = "tbl_chatting")
public class Chatting {

    @EmbeddedId
    private ChattingId id;

    @Column(name = "chatting_group_id")
    private Long groupId;

    @Column(name = "chatting_no")
    private Long no;

    @Column(name = "chatting_content")
    private String content;

    @Column(name = "chatting_time")
    private Timestamp time;

}
