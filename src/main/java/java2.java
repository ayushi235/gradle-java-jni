class java2 
{
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("currentThread:"+t);
        t.setName("MyThread");
        System.out.println("Thread2:"+t);
        try{
            for(int n=5;n>0;n--){
                System.out.println(n);
                Thread.sleep(1000); 
            }
        }
        catch(InterruptedException e){
            System.out.println("main Thread Interupted");
        
    }
}
}