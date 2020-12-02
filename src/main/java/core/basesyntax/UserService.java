package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {

        for (String userRecords : records) {
            String[] emailRecords = userRecords.split(":");
            if (emailRecords[0].equals(email)) {
                return Integer.parseInt(emailRecords[1]);
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
