public class Bolt extends Animal implements Runable,Barkable{
    @Override
    public void run() {

        System.out.println("this dog can run");
    }

    @Override
    public void bark() {
        System.out.println("my dog sua woof woof");
    }
}
