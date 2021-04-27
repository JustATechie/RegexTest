import java.util.regex.*;

public class Main {

    public static void main(String[] args ) {
        String regex = "\\.[^.]*$";

        Pattern pattern = Pattern.compile(regex);

        String example = "7.2.7";

        String[] updated = pattern.split(example);

        //Matcher matcher = pattern.matcher(example);

        System.out.println(updated[0]);
    }
}
