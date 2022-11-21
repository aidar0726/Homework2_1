public class Main {
    public static void main(String[] args) {
        System.out.println("задание №1");

        Human Maksim = new Human (-1988,"","Минск","бренд-менеджер");
        Human Anna = new Human (1993,"Анна","Москва","методист образовательных программ");
        Human Kate = new Human (1992,"Катя","Калининград","продакт-менеджер");
        Human Artem = new Human (1995,"Артем","Москва","директор по развитию бизнеса");
        System.out.println(Maksim.toString());

        Automobile Lada = new Automobile("Lada","Granta",1.7,"жёлтый",2015,"Россия");
        Automobile Audi = new Automobile("Audi","A8 50 L TDI quattro",3.0,"черный",2020,"Германия");
        Automobile Bmw = new Automobile("BMW","BMW Z8",3.0,"черный",2021,"Германия");
        Automobile Kia = new Automobile("KIA","Kia Sportage 4-го поколения",2.4,"красный",2018,"Южная Корея");
        Automobile Hyandai = new Automobile("Hyandai","Hyandai Avante",1.6,"красный",2016,"Южная Корея");
        System.out.println(Lada.toString());
    }
}

