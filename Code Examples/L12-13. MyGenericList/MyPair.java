

public class MyPair<T1, T2> {

    private T1 first;
    private T2 second;

    public MyPair(T1 f, T2 s){
        this.first = f;
        this.second = s;
    }

    public T1 getFirst(){
        return this.first;
    }

    public T2 getSecond(){
        return this.second;
    }


    public void setFirst(T1 f){
        this.first = f;
    }

    public void setSecond(T2 s){
        this.second = s;
    }

}
