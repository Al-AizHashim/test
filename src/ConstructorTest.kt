fun main() {
    var sum=ConstructorTest(5,7)
    println("the result of summation ="+sum.y)
}

class ConstructorTest {
    var y:Int;
    constructor(n1:Int, n2:Int){
        y=n1+n2

    }
}