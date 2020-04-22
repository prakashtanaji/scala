object HelloWorld {
    def main(args:Array[String]): Unit = {
        println("hello World");   
        testHelper();    

        // scala has just type of variable mutable(var) and immutable(val)
        // Based on assigned value scala interprets the underlying primitive type
        //val res = testHelperWithArgs(5);// any re-assignment will result in exception
        var res = 0;
        println("Currently in result is " + res); 
        res = testHelperWithArgs(5);
        println("Result is " + res); 

        // No need of empty open/close brackets and also no need to semi-colon
        res = testHelperWithOutput

        println("Result is " + res); 
    } 

    // this helper method return void and no args
    def testHelper() = {
        println("In scala helper method");
        //return;
    }

    // this helper method with input arguement
    // You actually dont have to return anything
    def testHelperWithArgs(input: Int) = {
        input * input;
        //return;
    }

    // helper with return type
    def testHelperWithOutput() : Int = {
        
        return 10;
    }
}