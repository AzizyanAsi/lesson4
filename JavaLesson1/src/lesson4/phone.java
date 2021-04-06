package lesson4;

public class phone {
    public String model;
    private String version;
    private boolean isSmartphone;
    private int year;

    public void full_name() {
        System.out.println(model + " " + version + " " + isSmartphone + " " + year);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int arg) {
        if (arg > 2000)
            this.year = arg;
        else
            System.out.println("havn't version");
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isSmartphone(boolean isSmartphone) {
        return isSmartphone;
    }

    public void setSmartphone(boolean smartphone) {
        isSmartphone = smartphone;
    }
}
