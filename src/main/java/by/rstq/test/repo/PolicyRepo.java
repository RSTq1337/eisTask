package by.rstq.test.repo;

import by.rstq.test.enity.PersonalPolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyRepo extends JpaRepository<PersonalPolicy,Long> {
}
