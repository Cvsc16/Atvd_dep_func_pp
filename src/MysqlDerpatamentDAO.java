import javax.sql.rowset.JdbcRowSet;

public class MysqlDerpatamentDAO implements DepartmentDAO {

    @Override
    public int insertDepartment() {
        return 0;
    }

    @Override
    public boolean deleteDepartment() {
        return false;
    }

    @Override
    public Department findDepartment() {
        return null;
    }

    @Override
    public JdbcRowSet selectDepartmentsRS() {
        return null;
    }

    @Override
    public boolean updateDepartment() {
        return false;
    }
}
