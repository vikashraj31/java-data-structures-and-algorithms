package Array;

public class mark {


    public static void update(int mark[]){

        for(int i =0 ; i<mark.length; i++){
            mark[i] = mark[i]+6;

        }
    }

    public static void main(String[] args) {
        int marks[] = {2,55,32};

        update(marks);

        for(int i =0; i<marks.length; i++){
            System.out.println("mark is -> "+ marks[i]);
        }
    }
    
}
