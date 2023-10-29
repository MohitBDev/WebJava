package dao;

import java.sql.Date;
import java.sql.SQLException;

import pojos.player;


public interface playerDao {


	player Registration(String first_name, String last_name, Date dob, double batting_avg, int wickets_taken, int team_id) throws SQLException;
}
