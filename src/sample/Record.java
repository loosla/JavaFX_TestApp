package sample;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class Record {
    // Add checks for input format value to prevent DB issues
    // When ADD - find all urls - check login and password??? What logic to implement? TIM
    private String uniqueID;
    private String url;
    private String login;
    private String password;
    private String email;
    private String phone;
    private Label label;

    public Record() {
        this.url = new String();
        this.login = new String();
        this.password = new String();
        this.email = new String();
        this.phone = new String();
        this.uniqueID = UUID.randomUUID().toString();
    }

    public Record(String url, String login, String password, String email, String phone) {
        this.url = url;
        this.login = login;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.uniqueID = UUID.randomUUID().toString();

        this.label = new Label("Demo Label");
    }

    public String getId() {
        return this.uniqueID;
    }

    public Label getLabel() {
        return this.label;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Record {");
        sb.append("\n\tid: ");
        sb.append(this.uniqueID);
        sb.append("\n\turl: ");
        sb.append(this.url);
        sb.append("\n\tlogin: ");
        sb.append(this.login);
        sb.append("\n\tpassword: ");
        sb.append(this.password);
        sb.append("\n\temail: ");
        sb.append(this.email);
        sb.append("\n\tphone: ");
        sb.append(this.phone);
        sb.append("\n}");
        return sb.toString();
    }


    public List generateTestList () {
        List<Record> recordsList = new LinkedList<>();

        for (int i = 0 ; i < 4; i++) {
            String url = new String("http://abc.com/" + i);
            String login = new String("loginName" + i);
            String password = new String("pa$$word" + i);
            String email = new String("nluc@gmail.com" + i);
            String phone = new String("416300123" + i);
            Record record = new Record(url, login, password, email, phone);
            recordsList.add(record);
        }

        System.out.println("Exsisting Records:");
        for (Record record : recordsList) {
            System.out.println(record.toString());
        }

        return recordsList;
    }

   // public

    // public UI for each record should be here

    // URL - natural sorted, Binary Search for search by URL ! Don't write http, wwww, etc. Ask Tim.


}
