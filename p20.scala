object p20
{
    def removeAt[A](i:Int, ls:List[A]):(List[A], A) =
    {
        val part = ls.slice(0, i)
        (ls.filter ({x:A => x != part.last}), part.last)
    }
}