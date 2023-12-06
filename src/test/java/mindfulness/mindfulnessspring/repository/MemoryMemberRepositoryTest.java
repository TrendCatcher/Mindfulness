package mindfulness.mindfulnessspring.repository;

import mindfulness.mindfulnessspring.domain.Member;
import org.junit.jupiter.api.Test;

public class MemoryMemberRepositoryTest {
    MemberRepository repository = new MemoryMemberRepository();

    @Test
    public void save(){
        Member member = new Member();
        member.setName("minfulness");

        repository.save(member);
    }
}
