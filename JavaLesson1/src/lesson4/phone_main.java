package lesson4;

public class phone_main {
    public static void main(String[] args) {
        phone phone1 =new phone();
        phone1.setYear(2020);
        phone1.setVersion("xs");
        phone1.isSmartphone(true);
        phone1.model="iphone";

        phone phone2 =new phone();
        phone2.setYear(2005);
        phone2.isSmartphone(false);
        phone2.model="nokia";

        phone phone3 =new phone();
        phone3.setYear(2015);
        phone3.setVersion("S4");
        phone3.isSmartphone(true);
        phone3.model="samsung";

        phone1.full_name();
        phone2.full_name();
        phone3.setYear(2014);
        System.out.println(phone3.getYear());



    }
}
