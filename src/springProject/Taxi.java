package springProject;

public class Taxi extends publicTransport {
    //기본값 세팅
    int maxPassenger = 4;
    int intakeBase = 2000;
    int intakeDistance = 1000;
    int distanceBase = 1;
    int currentPassenger;
    static int num;
    String status = "운행";
    int currentSpeed = 0;
    int intakeSum;
    int distanceTarget;

    public Taxi(){
        setNum();
    }

    //요소
    //택시 상태 변경
    public void changeTaxiStatus() {
        if (this.oil < 10) {
            this.status = "차고지행";
            System.out.println("주유가 필요하다.");
        } else status = "운행";
    }
    //번호 설정

    public void setNum() {
        num = num + 1;
        System.out.println("번호 = " + num + "\n주유량 = " + oil + "\n상태 = " + status);
    }

    //운행시작
    public void driveStart() {
        if (oil >= 10) {
            this.status = "일반";
            this.currentSpeed = 50;
        } else {
            this.status = "운행불가";
            System.out.println("alert('주유가 필요하다.')");
        }
    }

    //승객탑승
    public void customerOnboard(int passenger, String targetPlace, int distanceTarget) {
        if (currentPassenger <= maxPassenger) {
            this.currentPassenger += passenger;
            this.distanceTarget = distanceTarget;
            System.out.println("탑승 승객 수 = " + passenger + "\n잔여 승객 수 = "
                    + (maxPassenger - currentPassenger) + "\n기본 요금 확인 = " +
                    intakeBase + "\n목적지 = " + targetPlace + "\n목적지까지 거리 = " + distanceTarget +
                    "\n지불할 요금 = " + (intakeBase + intakeDistance * distanceTarget) + "\n상태 = " + status);
        }
        if (currentPassenger > maxPassenger) {
            System.out.println("최대 승객 수 초과");
            this.currentPassenger = 0;
        }
    }

    public void customerOnboard(int passenger) {
        if (currentPassenger > maxPassenger) {
            System.out.println("최대 승객 수 초과");
            this.currentPassenger = 0;
        }
    }

    //요금 결제
    public void intakeCalc() {
        intakeSum = intakeBase + intakeDistance * distanceTarget;
    }

    public void oilUse(int oilUse) {
        oil += oilUse;
        if (oil >= 10) {
            System.out.println("주유량 = " + oil + "\n누적 요금 = ");
        }
    }
}
