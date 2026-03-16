import java.util.*;
import java.util.regex.*;

public class ChangeCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Pattern pattern = Pattern.compile("\\$\\{([A-Z]+):(.*?)\\}");

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();
            Matcher matcher = pattern.matcher(line);

            StringBuffer result = new StringBuffer();

            while (matcher.find()) {

                String type = matcher.group(1);
                String value = matcher.group(2);
                String replacement = process(type, value);

                matcher.appendReplacement(result, replacement);
            }

            matcher.appendTail(result);

            System.out.println(result.toString());
        }
    }

    static String process(String type, String value) {

        try {

            switch (type) {

                case "UPPER":
                    return value.toUpperCase();

                case "LOWER":
                    return value.toLowerCase();

                case "REPEAT":
                    String[] parts = value.split(",");
                    String word = parts[0];
                    int count = Integer.parseInt(parts[1]);

                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < count; i++) {
                        sb.append(word);
                    }
                    return sb.toString();

                case "DATE":
                    String[] date = value.split("-");
                    int day = Integer.parseInt(date[0]);
                    int month = Integer.parseInt(date[1]);
                    int year = Integer.parseInt(date[2]);

                    if (day < 1 || day > 31 || month < 1 || month > 12)
                        return "INVALID";

                    return year + "/" + String.format("%02d", month) + "/" + String.format("%02d", day);

                default:
                    return "INVALID";
            }

        } catch (Exception e) {
            return "INVALID";
        }
    }
}