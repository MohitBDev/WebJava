package dao;

import static utils.DBUtils.*;
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
		

		public Teamdaoimpl() throws SQLException {
		
			cn = openConnection();
			pst1=cn.prepareStatement("Select * from teams  ");
			
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
				while (rst.next())
					teams.add(new team(rst.getString(2),rst.getString(3),rst.getString(4),rst.getInt(5),rst.getDouble(6),rst.getInt(7)));
			
			
			
			
			
			}
			return teams;
		
		
		
		}

		

	}



