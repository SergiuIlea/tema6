import java.util.Random;
public class Exercises {

    public static  int[] sir = new int[]{5, 88, 99, 25, 33, 2256, 5697};
    public static int nr = 100;
    public static int target = 5000;
    public static int nrDonatii = 3;
    public static String fraza = "Azi este sambata. Afara ploua. Eu stau in casa si fac teme.";
    public static void main(String[] args) {

        //ex1(sir);
        //ex2(sir);
        //ex3(sir, nr);
        //ex4(target);
        //ex5(target, nrDonatii);
        //ex6(fraza);
    }

    public static int ex1(int x[]){
        int sum=0;
        int i;
        for(i=0;i<x.length;i++){
            sum += x[i];
        }
        return sum;
    }

    public static int ex2(int x[]){
        int c=0;
        int i=0;
        for(i=0;i<x.length;i++){
            if(x[i]%2!=0){
                c++;
            }
        }
        return c;
    }

    public static int[] ex3(int x[], int y){
        int i;
        int c=0;
        for(i=0;i<x.length;i++){
            if(x[i]>y){
                c++;
            }
        }
        int z[] = new int[c];
        int j=0;
        if(c==0){
            System.out.println("Nu exista numere mai mari decat: " + y);
        }else{
            for(i=0;i<x.length;i++){
                if(x[i]>y){
                    z[j] = x[i];
                    j++;
                }
            }
        }
        return z;
    }

    public static void ex4(int x){
        Random random = new Random();
        int donatie;
        int sumDonatii=0;
        while(true){
            if(sumDonatii<x){
                donatie = random.nextInt(x);
                //System.out.println(donatie);
                sumDonatii += donatie;
            } else {
                System.out.println("Am reusit sa strangem suma dorita! Multumim!");
                break;
            }
        }
    }

    public static void ex5(int x, int y){
        Random random = new Random();
        int donatie;
        int sumDonatii=0;
        int i;
        for(i=0;i<y;i++) {
            if (sumDonatii < x) {
                donatie = random.nextInt(x);
                //System.out.println(donatie);
                sumDonatii += donatie;
            } else {
                System.out.println("Am reusit sa strangem suma dorita! Multumim!");
                break;
            }
        }
    }

    public static void ex6(String a){
        int i;
        for(i=0;i<a.length();i++) {
            if(a.charAt(i)=='.'){
                System.out.println();
                i++;
            }
            else {
                System.out.print(a.charAt(i));
            }
        }
    }
}
