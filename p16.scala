object p16
{
    // drop every Nth element from a list
    def dropN[A](n:Int, ls:List[A]):List[A] =
    {
        val L:List[Int] = ls indices toList filter({_ % 3 == 0})
    }
}