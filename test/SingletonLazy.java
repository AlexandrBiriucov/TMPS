package test;

public class SingletonLazy {
    
int a;
int b;

private static SingletonLazy obj;


private SingletonLazy(){


}

public int sum(int a, int b){

    return a+b;
    
}

public static SingletonLazy getInstance(){
        if (obj == null ){
            obj = new SingletonLazy();
                
        }
    
    return obj;


    }

}