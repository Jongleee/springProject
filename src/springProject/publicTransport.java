package springProject;
public class publicTransport {
    int num; //번호
    int maxPassenger;//최대승객
    int oil=100;//주유량
    int currentSpeed=0;//현재 속도
    String status; //상태
    int currentPassenger;

    //생성
    public publicTransport(){

    }

    //운행시작
    public void driveStart(String status) {
        if (oil < 10) {
            System.out.println("주유량을 확인해주세요!!");
        } else {
            this.status=status;
            this.currentSpeed = 50;
        }
    }




    //속도변경
    public void changeSpeed(int changeSpeed,String change){
        if(change=="증가") currentSpeed+=changeSpeed;
        if(change=="감소") currentSpeed-=changeSpeed;
    }

//    public static void main(String[] args){
//        Bus bus100=new setNum(100);
//        publicTransport customerOnboard ns = new customerOnboard(2);
//        //변수 선언
//        System.out.println(ns.customerOnboard(2));
//
//    }

}
