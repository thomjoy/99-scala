object p24
{
    // doesn't dedupe
    def lotto(num:Int, end:Int) =
    {
        for(i <- 1 to num) yield scala.util.Random.nextInt(nums.size)
    }

    def lottoR(num:Int, max:Int) =
    {
        def randomSelect(i:Int, ls:List[Int]):List[Int] = (i > 0) match
        {
            case false => Nil
            case true => {
                val (pre, post) = ls.splitAt(scala.util.Random.nextInt(ls.size))
                pre.last :: randomSelect(i - 1, pre.slice(0, pre.last) ::: post)
            }

        }

        randomSelect(num, List.range(1, max + 1))
    }
}