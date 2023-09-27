package auth.dataHelper;

import lombok.Value;

public class DataHelper {

    DataHelper() {
    }

    public static FuLLName getFullName() {
        return new FuLLName("Иванов Иван Иванович");
    }

    public static Email getEmail() {return  new Email("IvanovII@gmail.com");}

    public static CurrentAddress getCurrentAddress() {return new CurrentAddress("Apt. 730 855 Reynolds Islands, Wisokyside, PA 14995");}

    public static PermanentAddress getPermanentAddress() {return new PermanentAddress("Apt. 519 32355 Feeney Stream, Skyechester, CO 75824-3022");}

    @Value
    public static class FuLLName {
        String fullName;
    }

    @Value
    public static class Email {
        String email;
    }

    @Value
    public static class CurrentAddress {
        String currentAddress;
    }

    @Value
    public static class PermanentAddress {
        String permanentAddress;
    }
}
