package Boot_basics.project_basic;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface app_jpa extends JpaRepository<app_entity,Integer> {
    List<app_entity> findAllByProfileId(int profileId);

}


