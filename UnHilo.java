package desktop;

import javax.swing.DefaultListModel;

class UnHilo implements Runnable{
    DefaultListModel modelo=new DefaultListModel();
    
    @Override
    public void run(){
        System.out.println("SubProceso Hilo");
        int i=0;
        for(i=0;i<5;i++){
            System.out.println("Hilo"+i);
            modelo.addElement("Hilo"+i);
            Ventana1Interna.miLista.setModel(modelo);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex){
                System.out.println("Interrupcion del Hilo");
            }
        }
        System.out.println("Termina SubProcesoHilo");
    }
}
