package accountserver;

public interface AccountServerI {
    void addNewUser();

    void removeUser();

    int getUsersLimit();

    void setUsersLimit(int usersLimit);

    int getUsersCount();
}
