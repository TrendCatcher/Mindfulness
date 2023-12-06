package mindfulness.mindfulnessspring.domain;
//비즈니스 도메인 객체중 하나인 회원(멤버)
public class Member {
    private long id;    // system이 저장하는 아이디
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
