object p7
{
    def flatten(ls: List[Any]):List[Any] = ls flatMap {
        // is x of type List?
        case x: List[_] => flatten(x)
        case x => List(x)
    }
}

