package Repository;

import dto.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MemberRepository extends JpaRepository<Member,Long> {
    public Member findByAccount(String account);
    public List<Member> findByName(String name);
    public Member findByPhone (String phone);
}