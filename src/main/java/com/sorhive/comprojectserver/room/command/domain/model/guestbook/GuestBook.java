package com.sorhive.comprojectserver.room.command.domain.model.guestbook;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * <pre>
 * Class : GuestBook
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
@Table(name = "tbl_guestbooks")
public class GuestBook {

    @EmbeddedId
    private GuestBookId id;

    @Column(name = "guestbook_content")
    private String content;

    @Column(name = "guestbook_create_time")
    private Timestamp createTime;

    @Column(name = "guestbook_upload_time")
    private Timestamp uploadTime;

    @Column(name = "guestbook_delete_time")
    private Timestamp deleteTime;

    @Column(name = "guestbook_delete_yn")
    private Character deleteYn;

    protected GuestBook () {}

    public GuestBook(GuestBookId id, String content, Timestamp createTime, Timestamp uploadTime, Timestamp deleteTime, Character deleteYn) {
        this.id = id;
        this.content = content;
        this.createTime = createTime;
        this.uploadTime = uploadTime;
        this.deleteTime = deleteTime;
        this.deleteYn = deleteYn;
    }

    public GuestBookId getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public Timestamp getUploadTime() {
        return uploadTime;
    }

    public Timestamp getDeleteTime() {
        return deleteTime;
    }

    public Character getDeleteYn() {
        return deleteYn;
    }
}