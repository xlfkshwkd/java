package models.member;

import lombok.*;

import java.time.LocalDateTime;

@Builder @Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    private Long userNo;
    private String userId;
    private String userPw;

    private String userNm;
    private String email;
    private String mobile;


    private LocalDateTime regDt;
    private LocalDateTime modDt;

}
