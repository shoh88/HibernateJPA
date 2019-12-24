
package mypackag;
import mypackag.faculty;
import java.sql.SQLException;
import java.util.List;


/**
 *
 * @author mehri
 */
public interface facultyDAO {
    public void addfaculty(faculty faculty) throws SQLException;
    public void updatefaculty(faculty faculty) throws SQLException;

    public List getAllfaculty() throws SQLException; 
}
