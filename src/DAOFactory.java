public abstract class DAOFactory {
    public static final int MYSQL = 1;
    public static final int SQLITE = 2;

    public abstract DepartmentDAO getDepartmentDao();
    public abstract EmployeeDAO getEmployeeDao();

    public static DAOFactory getDAOFactory(int whichFactory) {
        switch (whichFactory) {
            case MYSQL:
                return new MysqlDAOFactory();
            case SQLITE:
                return new SQLiteDAOFactory();

            default:
                return null;
        }
    }

    public abstract DepartmentDAO getDepartmentDAO();
}
