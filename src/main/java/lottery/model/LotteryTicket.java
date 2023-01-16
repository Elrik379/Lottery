package lottery.model;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class LotteryTicket {

    private static int id = 0;
    private final int idTicket;
    private List<Integer> lotteryList;

    public LotteryTicket(List<Integer> lotteryList) {
        idTicket = ++id;
        this.lotteryList = lotteryList;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public List<Integer> getLotteryList() {
        return lotteryList;
    }

    public void setLotteryList(List<Integer> lotteryList) {
        this.lotteryList = lotteryList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LotteryTicket that = (LotteryTicket) o;
        return idTicket == that.idTicket && Objects.equals(lotteryList, that.lotteryList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTicket, lotteryList);
    }

    @Override
    public String toString() {
        return "Лотерейный билет № " + idTicket +
                ". Числа билета =" + lotteryList.stream().sorted().collect(Collectors.toList()) +
                '}';
    }
}
