import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String texto;

        System.out.print("Digite o texto: ");
        texto = input.nextLine();

        String regex = "#\\w+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        ArrayList<String> hashtags = new ArrayList<>();

        while (matcher.find()) {
            hashtags.add(matcher.group());
        }

        if (hashtags.isEmpty()) {
            System.out.println("Nenhuma Hashtag encontrada no texto.");
        } else {
            System.out.println("Hashtags encontradas: \n");
            for (String hashtag : hashtags) {
                System.out.println(hashtag);
            }
        }
    }
}
