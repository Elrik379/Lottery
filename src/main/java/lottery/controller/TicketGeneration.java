package lottery.controller;

import lottery.model.LotteryTicket;
import lottery.model.TicketList;

import java.io.PrintStream;
import java.util.Random;
import java.util.stream.Collectors;

public class TicketGeneration {
    private static final PrintStream printStream = new PrintStream(System.out);

    public static void getCirculation(int n) {
        for (int i = 0; i < n; i++) {
            LotteryTicket lotteryTicket = new LotteryTicket(new Random().ints(10L, 1, 100)
                    .limit(10).boxed().distinct()
                    .collect(Collectors.toList()));
            if(lotteryTicket.getLotteryList().size() < 10)
                continue;
            TicketList.getLotteryTicketList().add(lotteryTicket);
        }
        printStream.println("Общий тираж: " + n);
    }


}
