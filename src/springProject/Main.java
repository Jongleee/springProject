package springProject;

public class Main{
    public static void main(String[] args) {

//        bus1();//버스 시나리오 1

//        bus2();//버스 시나리오 2

//        taxi1();// 택시 시나리오 1
        taxi2();// 택시 시나리오 2

    }
    public static void bus1() {
        // Bus
        // 1,2) Bus 2대 생성 및 각 Bus 번호 다른지 확인
        System.out.println("1번 시나리오\n");
        Bus busScenario1 = new Bus();
        busScenario1.setNum();
        busScenario1.setNum();
    }


    public static void bus2() {

        System.out.println("\n\n2번 시나리오");
        Bus busScenario2= new Bus();
        // 1) 승객 +2
        // 2) 출력
        System.out.println("\n1.승객 +2 & 2.출력\n");
        busScenario2.customerOnboard(2);

        // 3) 주유량 -50
        // 4) 출력
        System.out.println("\n3.주유량 -50 & 4.출력\n");
        busScenario2.oilUse(-50);

        // 5) 상태 변경
        System.out.println("\n5.상태변경");
        busScenario2.changeBusStatus("차고지행");

        // 6) 주유량 +10
        // 7) 출력
        System.out.println("\n6.주유량 +10 & 7.출력\n");
        busScenario2.oilPlus(10);

        // 8) 상태 변경
        System.out.println("\n8.상태변경");
        busScenario2.changeBusStatus("운행중");

        // 9) 승객 +45
        // 10) 알럿
        System.out.println("\n9.승객 +45 & 10.알럿\n");
        busScenario2.customerOnboard(45);
        // 11) 승객 +5
        // 12) 출력
        System.out.println("\n11.승객 +5 & 12.출력\n");
        busScenario2.customerOnboard(5);
        // 13) 주유량 -55
        // 14) 출력
        // 15) 알럿
        System.out.println("\n13.주유량 -55 & 10.출력 & 11.알럿\n");
        busScenario2.oilUse(-55);
    }
    public static void taxi1(){
        System.out.println("1번 시나리오\n");
        Taxi taxiScenario1 =new Taxi();
        taxiScenario1.setNum();
        taxiScenario1.setNum();

    }public static void taxi2() {

        System.out.println("\n\n2번 시나리오\n");
        Taxi taxiScenario2= new Taxi();
        // 1.승객 +2 ,목적지 = 서울역, 목적지까지의 거리 = 2km
        // 2.출력
        System.out.println("\n1.승객 +2 & 2.출력\n");
        taxiScenario2.customerOnboard(2,"서울역",2);

        // 3.주유량 -80
        System.out.println("\n3.주유량 -80");
        taxiScenario2.oilUse(-80);

        // 4.요금결제 & 5.출력
        System.out.println("\n4.요금결제 & 5.출력\n");
        taxiScenario2.intakePay();

        // 6.승객 +5 & 7.알럿
        System.out.println("\n6.승객 +5 & 7.알럿");
        taxiScenario2.customerOnboard(5);

        // 8.승객 +3 , 목적지 = 구로디지털단지역 , 목적지까지 거리 = 12km % 9.출력
        System.out.println("\n8.승객 +3 , 목적지 = 구로디지털단지역 , 목적지까지 거리 = 12km % 9.출력\n");
        taxiScenario2.customerOnboard(3,"구로디지털단지역",12);

        // 10.주유량 -20
        System.out.println("\n10.주유량 -20");
        taxiScenario2.oilUse(-20);
        // 11.요금결제 & 12.출력 & 13.알럿
        System.out.println("\n11.요금결제 & 12.출력 & 13.알럿\n");
        taxiScenario2.intakePay();
    }
}