package lec_02;

public class Ex000_lecture_StringBuilder_time {
   
        public static void main(String[] args) {
            var s = System.currentTimeMillis();
            //String str = "";
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 1_000_000; i++) {
                //str += "+";
                sb.append("+");
            }
            System.out.println(System.currentTimeMillis() - s);
            //System.out.println(str);
            //System.out.println(sb);
        }
  
}
