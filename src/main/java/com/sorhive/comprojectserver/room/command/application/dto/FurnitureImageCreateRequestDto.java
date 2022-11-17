package com.sorhive.comprojectserver.room.command.application.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * <pre>
 * Class : FurnitureImageCreateDto
 * Comment: 가구 이미지 생성 요청 전송 객체
 * History
 * ================================================================
 * DATE             AUTHOR           NOTE
 * ----------------------------------------------------------------
 * 2022-11-17       부시연           최초 생성
 * </pre>
 *
 * @author 부시연(최초 작성자)
 * @version 1(클래스 버전)
 * @see (참고할 class 또는 외부 url)
 */
@Getter
@Setter
public class FurnitureImageCreateRequestDto {

    private Long roomId;
    private List<FurnitureImageRequestDto> furnitureImages;

}
