package com.sorhive.comprojectserver.member.command.domain.model.avatar;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * <pre>
 * Class : AvatarId
 * Comment: 클래스에 대한 간단 설명
 * History
 * ================================================================
 * DATE             AUTHOR           NOTE
 * ----------------------------------------------------------------
 * 2022-11-04       부시연           최초 생성
 * </pre>
 *
 * @author 부시연(최초 작성자)
 * @version 1(클래스 버전)
 */
@Embeddable
@Access(AccessType.FIELD)
public class AvatarId implements Serializable{

    @Column(name="avatar_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long value;

    protected AvatarId() {
    }

    public AvatarId(Long value) { this.value = value; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AvatarId avatarId = (AvatarId) o;
        return Objects.equals(value, avatarId.value);
    }

    @Override
    public int hashCode() { return value != null ? value.hashCode() : 0; }

    public static AvatarId of(Long value) { return new AvatarId(value); }
}