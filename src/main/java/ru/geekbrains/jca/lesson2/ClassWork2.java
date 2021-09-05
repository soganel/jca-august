package ru.geekbrains.jca.lesson2;

public class ClassWork2 {

    public static void main(String[] args) {

        int choice = 2;

        //vendingSwitchOld(choice);

        //preWhile(choice);

        //postWhile(choice);

        //forLoop(choice);
    }

    //region forLoop
    private static void forLoop(int choice) {
        //     инициализация;    условие;        итерация;
        for (int i = 0, j = 10; i < 11 && j > 0; i++, j -= 2) {
            System.out.printf("I = %d, J = %d\n", i, j); //printf(!)
            // printf - форматированный вывод. Внутри метод String.format()
            // %d - int, %c - character, %f - float, %s - string, %b - boolean
            // \n - перенос строки
         }

        for (;;) {
            System.out.println(choice++);
            if (choice > 10) break;
        }
    }
    //endregion

    //region postWhile
    private static void postWhile(int choice) {
        do {
            choice++;
            if (choice % 2 != 0) continue; //пропускаем нечетные
            System.out.println(choice);
            if (choice == 15) break;
        } while (choice < 0); // цикл с постусловием, одна итерация гаранирована
    }
    //endregion

    // region preWhile
    private static void preWhile(int choice) {
        while (choice > 0) {
            choice++;
            if (choice % 2 != 0) continue; //пропускаем нечетные
            System.out.println(choice);
            if (choice == 15) break;
            //choice++;
        }
    }
    //endregion

    //region vendingSwitchOld
    private static void vendingSwitchOld(int choice) {
        switch (choice) { //case 1 -> System.out.println("Pepsi");
            case 1:
                System.out.println("Pepsi");
                break;
            case 2: // {}
                System.out.println("Coca Cola");
                break;
            case 3:
                System.out.println("Mars");
                break;
            default:
                System.out.println("Wrong number");
        }
    }
    //endregion

}
