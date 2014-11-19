object p15
{
    def duplicateN[A](n:Int, ls:List[A]):List[A] = ls match
    {
        case Nil => Nil
        case h :: tail => ((0 until n) map (_ => h:A) toList) ::: duplicateN(n, tail)
    }

    def duplicateN[A](n: Int, ls: List[A]): List[A] =
    {
        ls flatMap { List.fill(n)(_) }
    }
}