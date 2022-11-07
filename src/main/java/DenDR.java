import java.util.Scanner;

public class DenDR {
        public static void main(String[] args) {
            String[] wordListOne = {"Уважаемый!"};
            String[] wordListTwo = {"Денис Анатольевич, "};
            String[] wordListThree = {"С Юбилеем!", "С Праздником!", "С Днём Рождения!", "С Днюхой!", "С Юбилейным!",
                    "С нетривиальной датой!", "С XXXX!", "С 40-м кольцом на срезе!"};
            String[] wordListFour = {" Щасья, здаровья!", " Гламура и глянца!", " Бодрячком!", " Будь!", " Оторвись!",
                    " Успеха, достижения всех целей!", " Улыбайся!", " Удивляйся!", " Радости!", " Тепла и чудачества!", " Вдохновения!",
                    " Попугая на плече, капитан!", " Мёда и пчёл!" };

            int oneLength = wordListOne.length;
            int twoLength = wordListTwo.length;
            int threeLength = wordListThree.length;
            int fourLength = wordListFour.length;

            int rand1 = (int) (Math.random() * oneLength); // приведения типа к инт, тк рэндом возвращает число между 0 и 1, умножаем на длину массива, чтобы выбор был между 0 и длиной массива
            int rand2 = (int) (Math.random() * twoLength);
            int rand3 = (int) (Math.random() * threeLength);
            int rand4 = (int) (Math.random() * fourLength);

            String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3] + wordListFour[rand4];

            System.out.println(phrase);
        }
    }


