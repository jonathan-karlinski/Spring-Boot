package karlinski.jonathan.exemplosql.repository;

import karlinski.jonathan.exemplosql.model.ClientEntety;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Jonathan Karlinski
 * @since 23/04/2020 - 14:30
 * @version 1.0
 */
@Repository
public interface ClientRepository extends CrudRepository<ClientEntety, Long> {
}
