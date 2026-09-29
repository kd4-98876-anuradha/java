class StackIsEmptyException extends RuntimeException{
    private String message ;


    public StackIsEmptyException(String message){
        this.message = message;

    }

    public void display(){
        System.out.println(message);
    }
}



class StackIsFullException extends RuntimeException{
    private String message ;


    public StackIsFullException(String message){
        this.message = message;

    }

    public void display(){
        System.out.println(message);
    }
}

class CustomStack implements Stack{
    private final int size = 10;
    private int index = -1;
    private Employee[] arr;


    public CustomStack(){
        arr = new Employee[size];
    }

    public void push(Employee obj) {
        if(index == arr.length-1){
            throw new StackIsFullException("Stack is full");
        }
        index++;
        arr[index] = obj;
    }
    public void peek(){
        if(index == -1){
            throw new StackIsEmptyException("Stack is empty");
        }
        System.out.println(arr[index]);
    }

    public void pop(){

        if(index == -1){
           throw new StackIsEmptyException("Stack is empty");
        }
        index--;
    }



}

class CustomGrowableStack implements Stack{
    private final int size = 10;
    private int index = -1;
    private Employee[] arr;


    public CustomGrowableStack(){
        arr = new Employee[size];
    }

    public void push(Employee obj) {
        if(index == arr.length-1){
            Employee[] old = arr;
            arr = new Employee[(old.length)* 2];

            for(int i = 0; i < old.length; i++){
                arr[i] = old[i];
            }
            index++;
            arr[index] = obj;
        }else{
            index++;
        arr[index] = obj;
        }
        
    }
    public void peek(){
        if(index == -1){
            throw new StackIsEmptyException("Stack is empty");
        }
        System.out.println(arr[index]);
    }

    public void pop(){

        if(index == -1){
           throw new StackIsEmptyException("Stack is empty");
        }
        index--;
    }

}