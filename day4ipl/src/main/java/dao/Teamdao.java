package dao;

import java.sql.SQLException;
import java.util.List;

import pojos.team;


public interface Teamdao {


	List<team> getSelectedDetails()throws SQLException;
}
