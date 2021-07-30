package juris.SpringWebJavaScript13072021.repositories;

import juris.SpringWebJavaScript13072021.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
    List<User> findAll(); // atradīs visus un sakārtos sākot ar lielāko id
    User findByName(String name);
}
