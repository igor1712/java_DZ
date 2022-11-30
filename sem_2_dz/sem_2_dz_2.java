
// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
package sem_2_dz;
import java.io.IOException;
import java.util.logging.*;
import java.util.Arrays;
public class sem_2_dz_2 {
    public static void main(String[] args) {
        try {
            Logger logger = Logger.getLogger(sem_2_dz_2.class.getName());
            FileHandler fh = new FileHandler("log.txt"); 
            logger.addHandler(fh);           
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);            
            int[] array = { 1, 33, 14, 16, 7, 5, 22 };
            System.out.println(Arrays.toString(array));
            boolean flag = false;
            int num;
            while (!flag) {
                flag = true;
                for (int i = 0; i < array.length - 1; i++) {
                    logger.info(Arrays.toString(array));
                    if (array[i] > array[i + 1]) {
                        flag = false;

                        num = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = num;   
                        
                                                    
                    }
                }
            }
            System.out.println(Arrays.toString(array));

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
