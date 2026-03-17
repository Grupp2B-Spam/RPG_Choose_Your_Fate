package dk.ek.gruppe2.chooseyourfate.repository.mysql;

import dk.ek.gruppe2.chooseyourfate.model.mysql.CharacterDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterDetailsRepository extends JpaRepository<CharacterDetails, Integer> {
}