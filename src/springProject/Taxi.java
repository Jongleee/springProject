package springProject;

public class Taxi extends publicTransport {
    //기본값 세팅
    int maxPassenger = 4;
    int intakeBase = 3000;
    int intakeDistance = 1000;
    int distanceBase = 1;
    int currentPassenger;
    static int num;
    String status = "일반";
    int currentSpeed = 0;
    int intakeSum;
    int distanceTarget;
    int intakeAccumulate;

    public Taxi(){
    }

    //요소
    //택시 상태 변경
    public void changeTaxiStatus(String stat) {
        status = stat;
    }
    //번호 설정

    public void setNum() {
        num = num + 1;
        System.out.println("택시번호 = " + num + "\n주유량 = " + oil + "\n상태 = " + status);
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
        this.currentPassenger += passenger;
        this.distanceTarget = distanceTarget;
        if (currentPassenger <= maxPassenger&&distanceTarget<10) {
            this.status="운행중";
            System.out.println("탑승 승객 수 = " + passenger + "\n잔여 승객 수 = "
                    + (maxPassenger - currentPassenger) + "\n기본 요금 확인 = " +
                    intakeBase + "\n목적지 = " + targetPlace + "\n목적지까지 거리 = " + distanceTarget +
                    "km\n지불할 요금 = " + (intakeBase + intakeDistance * distanceTarget-1000) + "\n상태 = " + status);
        }
        if (currentPassenger <= maxPassenger&&distanceTarget>=10) {
            this.status="운행중";
            System.out.println("탑승 승객 수 = " + passenger + "\n잔여 승객 수 = "
                    + (maxPassenger - currentPassenger) + "\n기본 요금 확인 = " +
                    intakeBase + "\n목적지 = " + targetPlace + "\n목적지까지 거리 = " + distanceTarget +
                    "km\n지불할 요금 = " + (intakeBase + intakeDistance * distanceTarget-1000));
        }
    }

    public void customerOnboard(int passenger) {
        this.currentPassenger=currentPassenger+passenger;
        if (currentPassenger > maxPassenger) {
            System.out.println("\n알럿 : 최대 승객 수 초과");
            this.currentPassenger = 0;
        }
    }

    //요금 결제
    public void intakePay() {
        intakeSum = intakeBase + intakeDistance * distanceTarget-1000;
        intakeAccumulate+=intakeSum;
        if (oil >= 10) {
            System.out.println("주유량 = " + oil + "\n누적 요금 = "+intakeAccumulate);
        }
        else  {
            this.status="운행불가";
            System.out.println("주유량 = " + oil + "\n상태 = "+status+"\n누적 요금 = "+intakeAccumulate+
                    "\n\n알럿 : 주유 필요 ");
        }
    }

    public void oilUse(int oilUse) {
        oil += oilUse;
    }
}
