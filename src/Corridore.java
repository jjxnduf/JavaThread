class Corridore extends Thread{
     
    int metri = 0;

    public Corridore(String nome){
        super(nome);
    }

    
    
    @Override
    public void run(){

        
        while (metri < 100){

            metri++ ;
            System.out.println("Corridore:" + getName() + " ha corso " + metri);
            
            
        }


        System.out.println("Corridore " + getName() +  " ha finito");
     }

}