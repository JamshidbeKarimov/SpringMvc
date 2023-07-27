package uz.pdp.springmvc.model;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = User.builder()
                .name(rs.getString("name"))
                .age(rs.getInt("age"))
                .username(rs.getString("username"))
                .password(rs.getString("password"))
                .build();
        user.setId(UUID.fromString(rs.getString("id")));
        user.setCreatedDate(rs.getTimestamp("created_date").toLocalDateTime());
        user.setUpdatedDate(rs.getTimestamp("updated_date").toLocalDateTime());
        return user;
    }
}
