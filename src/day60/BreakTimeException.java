package day60;

// This is my own type Exception
// Domain specific language
// instead of dealing with fancy words, I create my own exception in my language in my application
// Programmer usually create their own exception to understand their application much better.

public class BreakTimeException extends RuntimeException {

}

class Main {

    public static void main(String[] args) {

        throw new BreakTimeException(); // WHOLAAA !!!
    }
}
