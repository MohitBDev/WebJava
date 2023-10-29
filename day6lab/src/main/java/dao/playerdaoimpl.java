package dao;

import static utils.DBUtils.closeConnection;
import static utils.DBUtils.openConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import dao.playerDao;
import pojos.player;


public class playerdaoimpl implements playerDao {
	
		private Connection cn;
		private PreparedStatement pst1;
		

		public void playerDaoImpl() throws SQLException {
		
			cn = openConnection();
			
			System.out.println("player  dao created!");
		}

		public void cleanUp() throws SQLException {
			if (pst1 != null)
				pst1.close();
			closeConnection();
			System.out.println("player dao cleaned up!");
		}

		@Override
		public player Registration(String first_name, String last_name, Date dob, double batting_avg, int wickets_taken,
				int team_id) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}

	}



