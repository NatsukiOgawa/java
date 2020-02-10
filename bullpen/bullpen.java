import java.util.Random;

public class bullpen {
  public static void main(String args[]){
    System.out.println("Hello !!!");
    System.out.println();
    // System.out.println("Hello !!!");
    int m = 3;
    double epsilon = 0.3;
    double arm_rate[] = new double[m];
    double sam[] = new double[m];
    int max_index = 0;
    int large_t[] = new int[m];
    int total_reward[] = new int[m];
    int episode = 1000;
    int reward = 0;
    int ber = 0;
    int t = 0;
    int z = 0;
    int min_ran = 0;
    int max_ran = 0;

    for (int i=0; i<episode; i++){
      Random rand = new Random();
      double p = rand.nextDouble();

      System.out.println(p + "   " + i);
      System.out.println(sam.length);
      if (epsilon < p){ // argmax のとき
        double max = sam[0];
        for (int k=1; k<sam.length; k++){
          double v = sam[k];
          if (v > max) {
            max = v;
            }
          max_index = k;
        }

        t = max_index;
        large_t[t] += 1;

        Random ran_b = new Random();
        double b = ran_b.nextDouble();
        if (b < arm_rate[t]){
          ber = 0;
        }else{
          ber = 1;
        }

        reward = ber;
        total_reward[t] += reward;
        sam[t] = total_reward[t] / large_t[t];
      }else{
        max_ran = sam.length-1;
        min_ran = 0;
        if (min_ran >= max_ran) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        z = r.nextInt((max_ran - min_ran) + 1) + min_ran;


        // z = getRandomNumberInRange(5, 10);
        System.out.println(z);
        System.out.println(z);
        System.out.println(z);
        System.out.println(z);
        System.out.println(z);
        System.out.println(z);
        System.out.println(z);
        System.out.println(z);
        System.out.println(z);
        System.out.println(z);
        System.out.println(z);
        System.out.println(z);
        System.out.println(z);
        System.out.println(z);
        System.out.println(z);
        System.out.println(z);


        large_t[z] += 1;

        Random ran_b = new Random();
        double b = ran_b.nextDouble();

        if (b < arm_rate[z]){
          ber = 0;
        }else{
          ber = 1;
        }

        reward = ber;
        total_reward[z] += reward;
        sam[z] = total_reward[z] / large_t[z];


      }
        }


        System.out.println("------------------------------------------------");
        for (int i=0;i<m;i++){
          System.out.println(large_t[i]);
        }
        // System.out.println(large_t[2]);
        // System.out.println(large_t[3]);
        // System.out.println(large_t[4]);
        // System.out.println(large_t[5]);
        // System.out.println(large_t[6]);

  }
}
// System.out.println("Hello !!!");
