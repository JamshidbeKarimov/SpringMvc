package uz.pdp.springmvc.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uz.pdp.springmvc.model.User;
import uz.pdp.springmvc.model.UserMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    private final JdbcTemplate jdbcTemplate;

    private final String INSERT_USER = "insert into users(id, name, age, username, password) " +
            "values(?, ?, ?, ?, ?);";
    private final String GET_USER_BY_ID = "select * from users where id = ?;";
    private final String GET_USER_BY_USERNAME = "select * from users where username = ?;";
    private final String GET_ALL = "select * from users;";

    public void save(User user) {
        jdbcTemplate.update(
                INSERT_USER,
                user.getId(),
                user.getName(),
                user.getAge(),
                user.getUsername(),
                user.getPassword());
    }

    public User getById(UUID id) {
        return jdbcTemplate.queryForObject(GET_USER_BY_ID, new UserMapper(), id);
    }

    public User findByUsername(String username) {
        User user = jdbcTemplate.queryForObject(GET_USER_BY_USERNAME, new UserMapper(), username);
        return user;

    }

    public List<User> getAll() {
        return jdbcTemplate.query(GET_ALL, new UserMapper());
    }

}


//    JdbcTemplate jdbcTemplate;
//
//    private final String SQL_FIND_PERSON = "select * from people where id = ?";
//    private final String SQL_DELETE_PERSON = "delete from people where id = ?";
//    private final String SQL_UPDATE_PERSON = "update people set first_name = ?, last_name = ?, age  = ? where id = ?";
//    private final String SQL_GET_ALL = "select * from people";
//    private final String SQL_INSERT_PERSON = "insert into people(id, first_name, last_name, age) values(?,?,?,?)";

//    @Autowired
//    public PersonDAOImpl(DataSource dataSource) {
//        jdbcTemplate = new JdbcTemplate(dataSource);
//    }
//
//    public Person getPersonById(Long id) {
//        return jdbcTemplate.queryForObject(SQL_FIND_PERSON, new Object[] { id }, new PersonMapper());
//    }
//
//    public List<Person> getAllPersons() {
//        return jdbcTemplate.query(SQL_GET_ALL, new PersonMapper());
//    }
//
//    public boolean deletePerson(Person person) {
//        return jdbcTemplate.update(SQL_DELETE_PERSON, person.getId()) > 0;
//    }
//
//    public boolean updatePerson(Person person) {
//        return jdbcTemplate.update(SQL_UPDATE_PERSON, person.getFirstName(), person.getLastName(), person.getAge(),
//                person.getId()) > 0;
//    }

//    public boolean createPerson(Person person) {
//        return jdbcTemplate.update(SQL_INSERT_PERSON, person.getId(), person.getFirstName(), person.getLastName(),
//                person.getAge()) > 0;
//    }
