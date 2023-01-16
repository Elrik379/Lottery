package lottery.controller;

import lottery.model.TicketList;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class LotteryDraw {
    private static final PrintStream printStream = new PrintStream(System.out);

    public static void draw() {
        List<Integer> resultList = new ArrayList<>();
        while (resultList.size() != 5) {
            resultList = new Random()
                    .ints(5L, 1, 100)
                    .boxed()
                    .distinct()
                    .collect(Collectors.toList());
        }
        printStream.println("Выигрышная комбинация чисел: " + resultList.stream().sorted().collect(Collectors.toList()));
        getWinTicket(resultList);
    }

    public static void getWinTicket(List<Integer> list) {
        for (int i = 0; i < TicketList.getLotteryTicketList().size(); i++) {
            if (TicketList.getLotteryTicketList().get(i).getLotteryList().containsAll(list)){
                printStream.println("Билет №" + TicketList.getLotteryTicketList().get(i).getIdTicket() + " выиграл");
            };
        }

    }

}
