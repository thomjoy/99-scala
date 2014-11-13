object p23
{
    def randomSelect[A](i:Int, ls:List[A]):List[A] =
    {
        if (i == 0) Nil else ls(scala.util.Random.nextInt(ls.size)) :: randomSelect(i-1, ls)
    }
}