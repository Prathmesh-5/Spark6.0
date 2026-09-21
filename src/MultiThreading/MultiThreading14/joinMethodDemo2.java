package MultiThreading.MultiThreading14;

class Download extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=4;i++){
            if(i!=4) System.out.println(i+" song is downloaded then after 2 sec next song start to downloading");
            else System.out.println(i+" song is downloading means Last song is now downloading");

            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                throw new RuntimeException(e);
            }

        }
    }
}

public class joinMethodDemo2 {
    public static void main(String[] args) {

        Download t1=new Download();
        t1.start();

        try{
            t1.join();
        }
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("So, our all song is downloaded NOW, Lets play the song ......");
    }
}
