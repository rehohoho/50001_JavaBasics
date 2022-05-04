public class OuterClass {

    private int num = 10;

    public OuterClass(int num) {
        this.num = num;
    }

    public class InnerClass {
        int num;

        public InnerClass() {
            num = 100;
        }

        void innerPrint() {
            System.out.println(num);
        }

        public int getTotal() {
            return getOuter().num + num;
        }

        OuterClass getOuter() {
            return OuterClass.this;
        }
    }

}

