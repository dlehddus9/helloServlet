package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.MyClass;

@Repository
public class MyClassDAO {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public int getRowCount() {
		String sqlStatement = "select count(*) from myclass";
		return jdbcTemplate.queryForObject(sqlStatement, Integer.class);
	}

	public MyClass getMyLecture(String name) {
		String sqlStatement = "select * from myclass where subject=?";

		return jdbcTemplate.queryForObject(sqlStatement, new Object[] { name }, new RowMapper<MyClass>() {

			@Override
			public MyClass mapRow(ResultSet rs, int rowNum) throws SQLException {
				MyClass myclass = new MyClass();
				myclass.setYear(rs.getInt("year"));
				myclass.setTerm(rs.getInt("term"));
				myclass.setCode(rs.getString("code"));
				myclass.setSubject(rs.getString("subject"));
				myclass.setDivision(rs.getString("division"));
				myclass.setGrade(rs.getInt("grade"));

				return myclass;
			}

		});
	}

	public List<MyClass> getYearTerm(String year, String term) {
		String sqlStatement = "select * from mylecture where year=? and term=?";

		return jdbcTemplate.query(sqlStatement, new Object[] { year, term }, new RowMapper<MyClass>() {

			@Override
			public MyClass mapRow(ResultSet rs, int rowNum) throws SQLException {
				MyClass myLecture = new MyClass();
				myLecture.setYear(rs.getInt("year"));
				myLecture.setTerm(rs.getInt("term"));
				myLecture.setCode(rs.getString("code"));
				myLecture.setSubject(rs.getString("subject"));
				myLecture.setDivision(rs.getString("division"));
				myLecture.setGrade(rs.getInt("grade"));

				return myLecture;
			}

		});
	}

	public List<MyClass> getDivision() {
		String sqlStatement = "select division, sum(grade) from myclass group by division";

		return jdbcTemplate.query(sqlStatement, new RowMapper<MyClass>() {

			@Override
			public MyClass mapRow(ResultSet rs, int rowNum) throws SQLException {
				MyClass myclass = new MyClass();
				myclass.setSubject(rs.getString("division"));
				myclass.setDivision(rs.getString("sum(grade)"));

				return myclass;
			}

		});
	}

	public MyClass getTotalGrade() {
		String sqlStatement = "select sum(grade) from myclass";
		return jdbcTemplate.queryForObject(sqlStatement, new RowMapper<MyClass>() {

			@Override
			public MyClass mapRow(ResultSet rs, int rowNum) throws SQLException {
				MyClass myclass = new MyClass();
				myclass.setGrade(rs.getInt("sum(grade)"));
				return myclass;
			}

		});
	}

	public List<MyClass> getYear() {
		String sqlStatement = "select year,term, sum(grade) from myclass group by year,term";

		return jdbcTemplate.query(sqlStatement, new RowMapper<MyClass>() {

			@Override
			public MyClass mapRow(ResultSet rs, int rowNum) throws SQLException {
				MyClass myclass = new MyClass();
				myclass.setYear(rs.getInt("year"));
				myclass.setTerm(rs.getInt("term"));
				myclass.setGrade(rs.getInt("sum(grade)"));

				return myclass;
			}

		});
	}

	public List<MyClass> getMyclass() {
		String sqlStatement = "select * from myclass";

		return jdbcTemplate.query(sqlStatement, new RowMapper<MyClass>() {

			@Override
			public MyClass mapRow(ResultSet rs, int rowNum) throws SQLException {
				MyClass myLecture = new MyClass();
				myLecture.setYear(rs.getInt("year"));
				myLecture.setTerm(rs.getInt("term"));
				myLecture.setCode(rs.getString("code"));
				myLecture.setSubject(rs.getString("subject"));
				myLecture.setDivision(rs.getString("division"));
				myLecture.setGrade(rs.getInt("grade"));

				return myLecture;
			}

		});
	}

	
	public boolean insertSubject(MyClass myLecture) {
		String code = myLecture.getCode();
		String subject = myLecture.getSubject();

		String sqlStatement = "insert into presubject(code,subject) values (?,?)";
		return (jdbcTemplate.update(sqlStatement, new Object[] { code, subject }) == 1);
	}

	public List<MyClass> getPreSubject() {
		String sqlStatement = "select * from presubject";

		return jdbcTemplate.query(sqlStatement, new RowMapper<MyClass>() {

			@Override
			public MyClass mapRow(ResultSet rs, int rowNum) throws SQLException {
				MyClass myLecture = new MyClass();
				myLecture.setCode(rs.getString("code"));
				myLecture.setSubject(rs.getString("subject"));
				return myLecture;
			}

		});
	}

}
