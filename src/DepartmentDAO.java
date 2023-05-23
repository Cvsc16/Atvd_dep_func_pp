import javax.sql.rowset.JdbcRowSet;  

public interface DepartmentDAO {
    public int insertDepartment();
    public boolean deleteDepartment();
    public Department findDepartment();
    public JdbcRowSet selectDepartmentsRS();
    public boolean updateDepartment();
}