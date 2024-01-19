import java.util.Scanner;

public class App6 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Holidays holydayzer = new Holidays();

        holydayzer.add("01/01/2023", "Confraternização mundial");
        holydayzer.add("21/02/2023", "Carnaval");
        holydayzer.add("17/04/2023", "Páscoa");
        holydayzer.add("21/04/2023", "Tiradentes");
        holydayzer.add("01/05/2023", "Dia do trabalho");
        holydayzer.add("08/06/2023", "Corpus Christi");
        holydayzer.add("07/09/2023", "Independência do Brasil");
        holydayzer.add("12/10/2023", "Nossa Senhora Aparecida");
        holydayzer.add("02/11/2023", "Finados");
        holydayzer.add("15/11/2023", "Proclamação da República");
        holydayzer.add("25/12/2023", "Natal");

        System.out.println("""
                                                          .
                                                       .' |
                                                     .'   |
                                                     /`-._'
                                                    /   /
                                                   /   /
                                                  /   /
                                                 (`-./
                                                  )
                BEM-VINDO AO HOLYDAYZER (JAVA)!!! '
                 """);

        while (true) {
            System.out.println("O que deseja fazer?");
            System.out.println("""
                        1 => Encontrar feriado
                        2 => Mostrar todos os feriados
                        3 => Sair
                    """);

            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 3) {
                break;
            }

            if (option == 1) {
                System.out.println("Informe a data (DD/MM/YYYY): ");
                String day = scanner.nextLine();
                holydayzer.find(day);
                continue;
            }

            if (option == 2) {
                holydayzer.getAll();
            }

        }
    }
}