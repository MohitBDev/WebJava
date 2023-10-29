package dao;

import static utils.DBUtils.closeConnection;
import static utils.DBUtils.openConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojos.team;


public class Teamdaoimpl implements Teamdao {
	
		private Connection cn;
		private PreparedStatement pst1;
		

		public void playerDaoImpl() throws SQLException {
		
			cn = openConnection();
			pst1=cn.prepareStatement("Select team_id,abbrevation from teams ");
			
			System.out.println("Team  dao created!");
		}

		public void cleanUp() throws SQLException {
			if (pst1 != null)
				pst1.close();
			closeConnection();
			System.out.println("Team dao cleaned up!");
		}

		@Override
		public List<team> getSelectedDetails() throws SQLException {
			List<team> teams=new ArrayList<>();
			try(ResultSet rst=pst1.executeQuery()){
			
			
			
			
			
			}
			return teams;
		
		
		
		}

		

	}



