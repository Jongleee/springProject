package springProject;

public class Main{
    public static void main(String[] args) {
        // Bus
        // 1,2) Bus 2대 생성 및 각 Bus 번호 다른지 확인
        System.out.println("1번 시나리오");
        Bus busScenario1 = new Bus();
        busScenario1.setNum();
        busScenario1.setNum();
//        Bus bus1 = new Bus(1234);
//        Bus bus2 = new Bus(4321);

        //
//        System.out.println(bus1.getBusNum());
//        System.out.println(bus2.getBusNum());
        System.out.println("\n\n2번 시나리오");
        Bus busScenario2= new Bus();
        // 1) 승객 +2
        // 2) 출력
        System.out.println("\n1.승객 +2 & 2.출력");
        busScenario2.customerOnboard(2);

        // 3) 주유량 -50
        // 4) 출력
        System.out.println("\n3.주유량 -50 & 4.출력");
        busScenario2.oilUse(-50);

        // 5) 상태 변경
        System.out.println("\n5.상태변경");
        busScenario2.changeBusStatus("차고지행");

        // 6) 주유량 +10
        // 7) 출력
        System.out.println("\n6.주유량 +10 & 7.출력");
        busScenario2.oilPlus(10);

        // 8) 상태 변경
        System.out.println("\n8.상태변경");
        busScenario2.changeBusStatus("운행중");

        // 9) 승객 +45
        // 10) 알럿
        System.out.println("\n9.승객+45 & 10.알럿");
        busScenario2.customerOnboard(45);
        // 11) 승객 +5
        // 12) 출력
        System.out.println("\n11.승객+5 & 12.출력");
        busScenario2.customerOnboard(5);
        // 13) 주유량 -55
        // 14) 출력
        // 15) 알럿
        System.out.println("\n13.주유량 -55 & 10.출력 & 11.알럿");
        busScenario2.oilUse(-55);
    }
}