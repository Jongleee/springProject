package project;

public class Main extends publicTransport{
    public static void main(String[] args) {
        // Bus
        // 1,2) Bus 2대 생성

        Bus bus1 = new Bus(1234);
        Bus bus2 = new Bus(4321);
        // 각 Bus 번호 다른지 확인
        System.out.println(bus1.getBusNum());
        System.out.println(bus2.getBusNum());
        // 1) 승객 +2
        int[] busInfo = bus1.boardingPassenger(2, bus1.getMaxPassenger(),
                bus1.getDefaultMoney());
        // 2) 출력
        System.out.println("탑승 승객 수 = "+busInfo[0]);
        System.out.println("잔여 승객 수 = "+busInfo[1]);
        System.out.println("요금 확인 = "+busInfo[2]);
        // 3) 주유량 -50
        bus1.setFuelVolume(bus1.getFuelVolume()-50);
        // 4) 출력
        System.out.println("주유량 = "+bus1.getFuelVolume());
        // 5) 상태 변경
        bus1.setState(bus1.changeState(bus1.getState(),bus1.getFuelVolume()));
        // 6) 주유량 +10
        bus1.setFuelVolume(bus1.getFuelVolume()+10);
        // 7) 출력
        System.out.println("상태 = "+bus1.getState());
        System.out.println("주유량 = "+bus1.getFuelVolume());
        // 8) 상태 변경
        bus1.setState(bus1.changeState(bus1.getState(),bus1.getFuelVolume()));
        // 9) 승객 +45 // 10) 알럿
        busInfo = bus1.boardingPassenger(45, bus1.getMaxPassenger(),
                bus1.getDefaultMoney());
        // 11) 승객 +5
        busInfo = bus1.boardingPassenger(5, bus1.getMaxPassenger(),
                bus1.getDefaultMoney());
        // 12) 출력
        System.out.println("탑승 승객 수 = "+busInfo[0]);
        System.out.println("잔여 승객 수 = "+busInfo[1]);
        System.out.println("요금 = "+busInfo[2]);
        // 13) 주유량 -55
        bus1.setFuelVolume(bus1.getFuelVolume()-55);
        // 14) 출력
        System.out.println("주유량 = "+bus1.getFuelVolume());
        System.out.println("상태 = "+bus1.getState());
    }
}