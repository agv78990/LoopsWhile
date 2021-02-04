public class EvenWhile {


    public static void main(String[] args) {
        int even=2;
        while(even<=100){
            System.out.println("this is even number "+ even);
            even+=2;
        }
        System.out.println("now its odd+ "+ even);
        multiple(1, 3);
        mutlipleOf5(1,5);
        table(1,8);
    }


    public static int multiple(int m, int num){
        while(m<=10){
            int c=m*num;
            System.out.println("this is table of 3: 3*" + m+ "="+c);
            m++   ;

        }
        return m;

    }

    public static int mutlipleOf5(int i, int num){
        while(i<=10){
            int m=i*num;
            System.out.println("multiplication of 5: 5*"+ i+ "="+ num);
            i++;
        }
        return num;
    }

    public static int table(int i, int num){
        while(i<=10){
            int b=i*num;
            System.out.println("8*"+ i +"="+ b);
            i++;
        }
        return num;
    }


}
