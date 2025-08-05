package EX_02_RA_concepts;

public class APItesting_03_np {

    public void Step1() {
        System.out.println("step1");

    }
    public void Step2() {
        System.out.println("step2");

    }
    public void Step3(String s) {
        System.out.println("Step3");

    }

    public static void main(String[] args) {
        APItesting_03_np n = new APItesting_03_np();
        n.Step1();
        n.Step2();
        n.Step3("Ankaj");
    }
}
