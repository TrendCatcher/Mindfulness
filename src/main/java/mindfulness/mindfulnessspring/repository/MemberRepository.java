package mindfulness.mindfulnessspring.repository;

import mindfulness.mindfulnessspring.domain.Member;

import java.util.List;
import java.util.Optional;
//도메인 객체를 DB에 저장하고 관리, repository를 유동적으로 변경하기 위해 interface로 하나 만들어줌
public interface MemberRepository {
    Member save(Member member); //회원저장
    Optional<Member> findById(Long Id); // 회원 id 찾아오기
    Optional<Member> finByName(String name); // 회원 이름 찾아오기
    List<Member> findAll(); // 저장된 모든 회원 리스트 반환

}
