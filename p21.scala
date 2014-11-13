object p21
{
    def insertAt[A](n:Int, e:A, ls:List[A]):List[A] = ls.splitAt(n) match
    {
        case (pre, post) => pre ::: e :: post
    }
}