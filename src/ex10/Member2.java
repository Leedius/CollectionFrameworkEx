package ex10;

import ex5_8.Member;

public interface Member2 {

    //회원등록
    Member1 regMember(String name, String id, String pw);

    //회원정보 조회
    Member1 searchMember(String name);

    //모든회원 정보 조회
    Member1 allshowMember();

    //회원삭제
    Member1 deleteMember(String name);

    //회원비밀번호변경
    Member1 setMemberPs(String name);
}
