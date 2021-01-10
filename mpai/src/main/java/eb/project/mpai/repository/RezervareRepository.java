package eb.project.mpai.repository;

import eb.project.mpai.domain.Rezervare;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface RezervareRepository extends CrudRepository<Rezervare, Long> {

    List<Rezervare> findAll();

    @Query(value = "select  id, loc, bn_cinema_id, bn_concert_id, bn_teatru_id, utilizator_id, vip_cinema_id, vip_concert_id, vip_teatru_id from rezervare where utilizator_id=:userId",
            nativeQuery = true)
    List<Rezervare> findAllByUserId(@Param("userId") Long userId);


}
