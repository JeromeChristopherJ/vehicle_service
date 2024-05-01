package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bean.Candidate;
import util.DBUtil;

public class CandidateDAO {

	public void addCandidate(Candidate cb) throws SQLException
	{
		Connection con = DBUtil.getConnection();
		String sql = "insert into candidate values(?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, cb.getName());
		ps.setInt(2, cb.getM1());
		ps.setInt(3, cb.getM2());
		ps.setString(4, cb.getResult());
		ps.setString(5, cb.getGrade());
		ps.executeUpdate();		
				
	}
	
	
}
