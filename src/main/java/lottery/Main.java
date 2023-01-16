package lottery;

import lottery.controller.LotteryDraw;
import lottery.controller.TicketGeneration;
import lottery.model.TicketList;

import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        TicketGeneration.getCirculation(3000000);
        TicketList.showList();
        LotteryDraw.draw();
    }
}
