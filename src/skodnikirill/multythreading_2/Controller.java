/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skodnikirill.multythreading_2;

/**
 *
 * @author student
 */
public class Controller {

    private Data mData;
    private int mId;
    private int mNumber;

    public Controller(Data _data, int _id, int _number) {

        mData = _data;
        mId = _id;
        mNumber = _number;
    }

    public void doWork() throws InterruptedException {

        for (int i = 0; i < mNumber; i++) {

            synchronized (mData) {
                
                while(mData.getState() != mId) {
                
                    //уступаем ход
                    mData.wait();
                }
                
                if (mId == 1) {

                    System.out.print(i + ": ");
                    mData.tik();
                } else if(mId == 2){
                 

                    mData.tak();
                }
                else{
                    mData.tuk();
                }
                //оповещаем другие потоки, что работу выполнили
                mData.notifyAll();
            }
        }
    }
}
