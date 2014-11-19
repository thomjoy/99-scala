object p22
{
    def range(x:Int, y:Int):List[Int] =
    {
        ((x to y).toList)
    }

    def rangeR(x:Int, y:Int):List[Int] =
        if (x > y) Nil else x :: rangeR(x + 1, y)
}