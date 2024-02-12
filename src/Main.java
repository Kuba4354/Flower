import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
// TODO: 12.02.2024 ГҮЛ ДЕГЕН КЛАСС ТҮЗҮҢҮЗ.
//ПОЛЕЛЕРИ (FLOWERNAME, FRESHNESS, PRICE)
//МЕЙНДЕН АНЫН БИР НЕЧЕ ОБЪЕКТТЕРИН ТҮЗҮҢҮЗ,
//МААНИЛЕРИН БЕРИНИЗ.
//1) ГҮЛДҮН МАССИВИН ТҮЗОБУЗ, ГУЛДОРДУ ОШОЛ
//МАССИВКЕ САЛЫБЫЗ.
//МЕТОД ТУЗУНУЗ, ПАРАМЕТРИНЕ ГУЛДОЛДУН
//МАССИВИН АЛСЫН, АНАН МЕТОД ЭН КЫМБАТ ГУЛДУН
//БААСЫН КАЙТАРСЫН. МЕЙНДЕН ОШОЛ МЕТОДДУ
//ЧАКЫРЫНЫЗ
//ГҮЛДҮ АНЫН ЖАҢЫЛЫГЫНА (СВЕЖЕСТЬ) КАРАТА
//СОРТТОЙБУЗ.
//ГҮЛДҮ АТЫНА ЖАРАША СОРТТОЙБУЗ


        Flower flower1 = new Flower();
        flower1.flowername = "Roza";
        flower1.freshness = 6;
        flower1.price = 3800;

        Flower flower2 = new Flower();
        flower2.flowername = "Aigyl gyly";
        flower2.freshness = 2;
        flower2.price = 3845;

        Flower flower3 = new Flower();
        flower3.flowername = "Romashka";
        flower3.freshness = 6;
        flower3.price = 3800;
        int[] flowers = {flower1.freshness, flower2.freshness, flower3.freshness};
        method(flowers);

    }


    public static void method(int[] flowers) {

        int cound = 0;
        for (int i = 0; i < flowers.length; i++) {

            cound+= flowers[i];


        }
        System.out.println(Math.max(Arrays.sort(cound,flowers)));


    }

    }
