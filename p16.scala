object p16
{
    // drop every Nth element from a list
    def dropN[A](n:Int, ls:List[A]):List[A] =
    {
        val dropList:List[Int] = ls.indices.filter({_:Int % 3 == 0 && _:Int > 0}) toList
        dropList foreach {ls drop(_)}
    }
}