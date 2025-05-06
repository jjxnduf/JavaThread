public class App {
    public static void main(String[] args) throws Exception {
        
        String nomi[] = {"Luca", "Giacomo", "Andrea", "Federica"};
        Corridore lista[] = new Corridore[4];
        

        System.out.println("Pronti, partenza , via ...");

        for (int i = 0; i < 4 ; i ++){
            lista[i] = new Corridore(nomi[i]);
            lista[i].start();
        }
        
        for (int i = 0; i < 4 ; i ++){
            
            lista[i].join();
        }

        System.out.println("Gara finita");


        
    }

}


