package accountserver;

public class AccountServer implements AccountServerI{

    private int usersCount;
    private int usersLimit;

    public AccountServer(int usersLimit) {
        this.usersLimit = usersLimit;
    }

    public void addNewUser() {
        usersCount++;
    }

    public void removeUser() {
        usersCount--;

    }

    public int getUsersLimit() {
        return usersLimit;
    }

    public void setUsersLimit(int usersLimit) {
        this.usersLimit = usersLimit;
    }

    public int getUsersCount() {
        return usersCount;
    }
}
