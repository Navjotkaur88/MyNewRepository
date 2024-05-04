package exception;



public class Nullpoint {

    public static void main(String[] args){

       String value = null;
       try{
           String x= value.toUpperCase();
          // System.out.println("Type" +x);
       }
       catch (NullPointerException e){
           e.printStackTrace();
    }
        System.out.println("Type" +value);
}
}