package OOPS1
import scala.collection.mutable.ListBuffer


//To insert double of an element
  class DoubleQueue(queue : ListBuffer[Int]) extends Queue {

    override def enqueue(elementToBePushed: Int): Unit = {

      queue += (elementToBePushed * 2)
    }

  }

//To insert Sqaure of an element
  class SquareQueue(queue: ListBuffer[Int]) extends Queue {

    override def enqueue(elementToBePushed: Int): Unit = {

      queue += (elementToBePushed * elementToBePushed)
    }



  }
