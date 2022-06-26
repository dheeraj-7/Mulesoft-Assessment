import java.sql.*;
import java.sql.Connection;
import java.util.*;
import java.sql.Statement;

public class MovieDetails {
	public static void main(String[] args) {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con=DriverManager.getConnection("jdbc:sqlite:mulesoftAsst.db");
			System.out.println("Database Connection opened.");
			Statement st=con.createStatement();
			st.executeUpdate("create table movieData(movieName varchar(20),actor varchar(20),actress varchar(20),relesae varchar(10),director varchar(20))");
			System.out.println("Table Created");
			
			st.executeUpdate("INSERT INTO movieData (movieName,actor,actress,relesae,director) VALUES ('rrr','ntr','alia bhatt','2022','rajamouli')");
			st.executeUpdate("INSERT INTO movieData (movieName,actor,actress,relesae,director) VALUES ('pushpa','allu arjun','rashmika','2022','sukumar')");
			st.executeUpdate("INSERT INTO movieData (movieName,actor,actress,relesae,director) VALUES ('hit','vishwak sen','ruhani sharma','2020','sailesh')");
			st.executeUpdate("INSERT INTO movieData (movieName,actor,actress,relesae,director) VALUES ('kgf2','yash','srinidhi','2022','prashanth')");
			st.executeUpdate("INSERT INTO movieData (movieName,actor,actress,relesae,director) VALUES ('radhe shyam','prabhas','pooja hedge','2022','radha krishna')");
			st.executeUpdate("INSERT INTO movieData (movieName,actor,actress,relesae,director) VALUES ('bahubali','prabhas','tamanna','2015','rajamouli')");
			st.executeUpdate("INSERT INTO movieData (movieName,actor,actress,relesae,director) VALUES ('magadheera','ram charan','kajal','2009','rajamouli')");
			st.executeUpdate("INSERT INTO movieData (movieName,actor,actress,relesae,director) VALUES ('jersey','nani','shraddha','2019','gowtam')");
			
			
			ResultSet rs = st.executeQuery("select * from movieData");
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+" : " +(rs.getString(2)+" : "+rs.getString(3)+" : "+ rs.getString(4)+" : "+rs.getString(5)));
			}
			
			con.close();
			System.out.println("Connection closed.");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
