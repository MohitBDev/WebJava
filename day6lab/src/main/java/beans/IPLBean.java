package beans;

import java.sql.SQLException;
import java.util.List;

import dao.Teamdaoimpl;
import pojos.team;

public class IPLBean {
	private Teamdaoimpl teamdao;
	public IPLBean()throws SQLException{
		teamdao=new Teamdaoimpl();
		System.out.println("teamdao created");
		
	}
	public Teamdaoimpl getTeamdao() {
		return teamdao;
	}
	public void setTeamdao(Teamdaoimpl teamdao) {
		this.teamdao = teamdao;
	}
	public List <team> getAllTeams() throws SQLException{
		return teamdao.getSelectedDetails();
		
		
		
	}

}
