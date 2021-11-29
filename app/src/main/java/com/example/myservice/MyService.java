 package com.example.myservice;

 import android.app.Service;
 import android.content.Intent;
 import android.os.IBinder;
 import android.os.RemoteException;

 import SeparatePackage.aidlInterface;


 public class MyService extends Service {


     public MyService() {
    }

     @Override
     public IBinder onBind(Intent intent) {
         return iBinder;
     }

     aidlInterface.Stub iBinder = new aidlInterface.Stub(){
         @Override
         public int calculateData(int value1, int value2) throws RemoteException {
             return 10; //value passing to hmi as result of addition(on click button)

         }
     };



 }