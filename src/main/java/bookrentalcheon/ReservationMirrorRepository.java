package bookrentalcheon;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReservationMirrorRepository extends CrudRepository<ReservationMirror, Long> {


}