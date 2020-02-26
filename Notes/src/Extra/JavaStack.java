package Extra;

public interface JavaStack {

    void push(Object x);
    

    void pop();

    Object top();

    Object topAndPop();

    boolean isEmpty();

    void makeEmpty();

}
