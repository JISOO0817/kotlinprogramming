package chap06.section3;

public class KCustomerAccess {
    public static void main(String[] args){
        System.out.println(KCustomer.LEVEL);
        KCustomer.login();  //애노테이션 사용시 접근방법
        KCustomer.Companion.login(); // 애노테이션 사용하지 않을 때 접근방법

        KCustomer.JOB.setTitle("Accountant");
        System.out.println(KCustomer.JOB.getTitle());
    }
}
