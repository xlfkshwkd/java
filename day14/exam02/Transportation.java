package exam02;

public enum Transportation {
    Bus(1450){
        @Override
        public int getTotal(int personNo) {
            return 0;
        }
    },
    SUBWAY(1250){
        public int getTotal(int personNo) {
            return 0;
        }
    },
    TAXI(4500){
        public int getTotal(int personNo) {
            return 0;
        }
    };

    private int fare;


    Transportation(int fare){
        this.fare=fare;
    }

    public int getFare() {
        return fare;
    }
    public abstract int getTotal(int personNo);



}
