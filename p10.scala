object p10
{
  def encodeModified(ls: List[Any]): List[Any] =
  {
      if (ls.isEmpty) List()
      else
      {
        val (packed, next) = ls span { _ == ls.head }

        if (next == Nil)
          if(packed.size > 1) List((packed.size, packed.head))
          else List(packed.head)
        else
          if (packed.size > 1) (packed.size, packed.head) :: encodeModified(next)
          else packed.head :: encodeModified(next)
      }
  }
}