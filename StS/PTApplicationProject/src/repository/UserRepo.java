package repository;


import java.util.List;
import domain.User;


public class UserRepo {

	public interface UserR <User, Integer>{
		
	    User findByLogin(String login);
	    User findById(Integer id);
	    User findByEmail(String email);
	    User findByIdentification(String iden);
	    User findByUsername(String username);
	    User findByActive(boolean active);
	    User findByUsernameAndPassword(String username, String password);
	    List<User> findByFirstname(String firstname);
	    List<User> findByIsonlineOrderByIdAsc(boolean bool);
	    List<User> findByLoginLike(String name);
	}
}