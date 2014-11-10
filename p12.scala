object p12
{
    // from List((4, 'a), (3, 'b)) => List('a, 'a...'b)
    def decode(ls:List[(Int, Symbol)]):List[Symbol] = ls match
    {
        case Nil => Nil
        case h :: tail => (((0 until h._1) map (_ => h._2:Symbol)) toList) ::: decode(tail)
    }
}