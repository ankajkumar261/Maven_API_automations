package EX_02_RA_concepts;

public class APITesting_04_builderpattern {

    public APITesting_04_builderpattern Step1() {
        System.out.println("step1");
        return this;

    }
    public APITesting_04_builderpattern Step2() {
        System.out.println("step2");
        return this;

    }
    public APITesting_04_builderpattern Step3(String s) {
        System.out.println("Step3");
        return this;

    }

    public static void main(String[] args) {
        APITesting_04_builderpattern api = new APITesting_04_builderpattern();
        api.Step1().Step2().Step3("ankaj");
    }
}
