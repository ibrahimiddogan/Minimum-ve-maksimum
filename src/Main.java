public class Main {
    public static void main(String[] args) {
        int list[] ={92,34,83,27,-19,22};
        int min = list[0];
        int max =list[0];
        for (int i :list ){
            if (max<i){
                max = i;

            }
            if (min>i){
                min = i;

            }
        }
        System.out.println("En büyük değer:" + max);
        System.out.println("En küçük değer :" + min );

    }
}