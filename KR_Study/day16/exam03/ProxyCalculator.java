package exam03;

public class ProxyCalculator implements Calculator{
    private ImplCacluator cacluator =new ImplCacluator();

    private Calculator calculator;
    public ProxyCalculator(Calculator calculator){
        this.calculator =calculator;
    }
    @Override
    public long factorial(long num) {
        long result =cacluator.factorial(num);
        return result;
    }
    //기능추가추가 추가 데코레이터 패턴
}
