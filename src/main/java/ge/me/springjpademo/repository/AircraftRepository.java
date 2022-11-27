package ge.me.springjpademo.repository;

import ge.me.springjpademo.model.Aircraft;
import org.springframework.data.repository.CrudRepository;

public interface AircraftRepository extends CrudRepository<Aircraft, Long> {
}
