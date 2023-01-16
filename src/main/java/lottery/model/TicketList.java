package lottery.model;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class TicketList {
    private static final PrintStream printStream = new PrintStream(System.out);

    private static List<LotteryTicket> lotteryTicketList = new ArrayList<>();

    public static List<LotteryTicket> getLotteryTicketList() {
        return lotteryTicketList;
    }

    public static void showList(){
        //printStream.println(lotteryTicketList); //показ всех билетов для теста
        printStream.println("Количество проданных билетов: " + lotteryTicketList.size());
    }

}
