package controller;

import java.sql.SQLException;

import bean.Candidate;
import model.CandidateDAO;

public class CandidateController {

		public void addCandidate(Candidate cb) throws SQLException
		{
			//candidate name, m1,m2,m3
			int total = cb.getM1()+cb.getM2()+cb.getM3();
			if(total>=240)
			{
				cb.setResult("PASS");
				cb.setGrade("DISTINCTION");
			}
			if((total>=180)&&(total<240))
			{
				cb.setResult("PASS");
				cb.setGrade("FIRST CLASS");
			}
			else
			{
				cb.setResult("FAIL");
				cb.setGrade("NO GRADE");
			}
			CandidateDAO dao = new CandidateDAO();
			dao.addCandidate(cb);
		}
}
