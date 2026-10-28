package test;

//eager initialization   no matter if call the method or not the object is present in memory;
class SingletonEager{

int a;
int b;

private static SingletonEager obj = new SingletonEager();


private SingletonEager(){


}

public int sum(int a, int b){

    return a+b;
    
}

public static SingletonEager getInstance(){
    return obj;

}

}





