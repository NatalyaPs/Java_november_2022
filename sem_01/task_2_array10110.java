// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1. 

package sem_01;

public class task_2_array10110 {
    public static void main(String[] args) {         
        int count =0;          
        int max =0;         
        int[] arr = new int[] {1, 1, 0, 1, 1, 1};         
        for (int i = 0; i < arr.length; i++)
        {             
            if (arr[i] == 1) 
            {                 
                count ++;
            }             
            else if(arr[i] == 0)
            {                 
                if (count > max)
                {                    
                    max = count;
                }                 
                count = 0;
            }          
        }         
            if (count > max)         
            {             
                max = count;         
            }          
        System.out.println(max);      
    }      
}
    

