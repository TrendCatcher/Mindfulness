package mindfulness.mindfulnessspring.repository;

import mindfulness.mindfulnessspring.domain.Member;

import java.util.*;


public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;  // sequence는 키값을 나열
    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }
    //Map(store)에 넣기 전 member id 값을 setId()를 통해서 세팅해주고
    // System이 정해준 id에 해당되는 member가 Map에 저장됨

    @Override
    public Optional<Member> findById(Long Id) {
        return Optional.ofNullable(store.get(Id));  //반환된 값이 null일 수 도 있으므로 ofNullable로 감쌈
    }

    @Override
    public Optional<Member> finByName(String name) {
        return store.values().stream().
                filter(member -> member.getName().equals(name))
                .findAny();
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }
}
