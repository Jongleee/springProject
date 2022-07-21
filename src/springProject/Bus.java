package springProject;

public class Bus extends publicTransport {
    //기본값 세팅
    int maxPassenger = 30;
    int intake = 1000;
    int currentSpeed = 0;
    String status = "운행";
    //요소
    int currentPassenger;
    int num = 1000;

    public Bus() {

    }

    //번호 설정
    public void setNum() {
        num = num + 1;
        System.out.println("버스번호 = " + num);
    }

    //버스 상태 변경
    public void changeBusStatus() {
        if (this.oil < 10) {
            this.status = "차고지행";
            System.out.println("주유가 필요하다");
        } else status = "운행";
    }

    public void changeBusStatus(String status1) {
        this.status = status1;
    }

    public void oilUse(int oilUse) {
        oil += oilUse;
        if (oil < 10) {
            System.out.println("주유량 = " + oil);
            System.out.println("상태 = " + status);
            System.out.println("\n알럿 : 주유 필요");
        } else System.out.println("주유량 = " + oil);
    }

    public void oilPlus(int oilPlus) {
        oil += oilPlus;
        if (status == "차고지행") {
            System.out.println("상태 = " + status);
            System.out.println("주유량 = " + oil);
        } else System.out.println("상태 = " + status + "\n주유량 = " + oil);
    }

    //승객탑승
    public void customerOnboard(int passenger) {
        this.currentPassenger += passenger;
        if (currentPassenger <= maxPassenger) {
            System.out.println("탑승 승객 수 = " + passenger + "\n잔여 승객 수 = "
                    + (maxPassenger - currentPassenger) + "\n요금 확인 = " + (passenger * intake));
        }
        if (currentPassenger > maxPassenger) {
            System.out.println("\n알럿 : 최대 승객 수 초과");
            this.currentPassenger = 0;
        }
    }
}
