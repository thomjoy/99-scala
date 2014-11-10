object p9
{
    // Given: List('a','a','a','b','b','c')
    // return a list of tuples encoding the runlength: List((3,'a'), (2, 'b'), (1, 'c'))
    def runLength(ls: List[Char]): List[(Int, Char)] =
    {
        if (ls.isEmpty) List((0, 'a'))
        else
        {
          val (packed, next) = ls span { _ == ls.head }
          if (next == Nil) List((packed.size, packed.head))
          else (packed.size, packed.head) :: runLength(next)
        }
    }
}