package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public class ClienteRepository {

    @Repository
    public  interface ClienteRepository extends CrudRepository<Cliente, Long> {

    }
}
