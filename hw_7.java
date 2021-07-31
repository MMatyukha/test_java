public class FeedCats {

    private static int TIME = 0;

    public static void main(String[] args) {

        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Бублик", 150, 3);
        cat[1] = new Cat("Пирожок", 100, 4);
        cat[2] = new Cat("Тимон", 30, 1);
        Plate plate = new Plate(700);
        System.out.println("Ужос! Подкинули трех котов, с весьма  странными кличками (о чем люди думают): " + cat[0].getName() + ", " + cat[1].getName() + " и " + cat[2].getName() + ", которых надо кормить каждые " + cat[0].getSatietyTime() + ", " + cat[1].getSatietyTime() + " и " + cat[2].getSatietyTime() + " часа.");
        System.out.println("Я не люблю котов, тем  не менее. На  данный   момент в миске " + plate.getFood() + " г кошачьего корма. И насколько его хватит, неизвестно. 'Мечта бабушек' очень проголодались и требуют кормежки.\n");

        do {
            for (Cat i : cat) {

                //голодный кот
                if (i.getSatiety() == 0) {

                    //добавка
                    if (!plate.checkFood(i.getAppetite())) {
                        plate.increaseFood();
                    }

                    //процесс еды
                    i.eat(plate);
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() + " граммов корма и проголодается через " + (i.getSatiety()) + " часа(ов)");
                }

                //наелся
                i.setSatiety(i.getSatiety() - 1);
            }
            System.out.println("\nС момента начала кормежки прошел(ло) " + TIME + " час(а). В миске осталось " + plate.getFood() + " г корма.\n");
            TIME++;

        } while (TIME <= 24);
    }
}

class Plate {

    private int food;

    int getFood() {
        return food;
    }

    Plate(int food) {
        this.food = food;
    }

    void decreaseFood(int n) {
        food -= n;
    }

    void increaseFood() {
        this.food += 300;
        System.out.println("В миску добавила 300 грамм корма");
    }

    boolean checkFood(int n) {
        return (food - n) >= 0;
    }

}

class Cat {

    private String name;
    private int appetite;
    private int satietyTime;
    private int satiety;

    String getName() {
        return name;
    }

    int getAppetite() {
        return appetite;
    }

    int getSatietyTime() {
        return satietyTime;
    }

    int getSatiety() {
        return satiety;
    }

    void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    Cat(String name, int appetite, int satietyTime) {

        this.name = name;
        this.appetite = appetite;
        this.satietyTime = satietyTime;
        this.satiety = 0;
    }

    void eat(Plate p) {
            p.decreaseFood(appetite);
            satiety += satietyTime;
    }
}
