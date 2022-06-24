import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/pessoas")
public class PersonController {

  @Inject
  private PersonRepository repository;
  
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Person> findAll(){
    return repository.listAll();
  }
  
  @Transactional
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public void salvar(Person pessoa) {
    repository.persist(pessoa);
  }

}
