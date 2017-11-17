public class Main {

    public static void main(String[] args) {
	// write your code here

        for(int i=0; i<10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("line: "+i);
        }

    }
}
