object p25
{
    def randomPermute(ls:List[Int]):List[Int] =
    {
        def randomSelect(i:Int, ls:List[Int]):List[Int] = (i > 0) match
        {
            case false => Nil
            case true => {
                val (pre, post) = ls.splitAt(scala.util.Random.nextInt(ls.size))
                pre.last :: randomSelect(i - 1, pre.slice(0, pre.last) ::: post)
            }

        }

        randomSelect(ls.size, ls)
    }
}