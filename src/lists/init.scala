/**
  * Created by Own on 3/8/2019.
  */

// Init process

def init[T](xs: List[T]):List[T] = xs match{
  case List() => throw new Error("init of Empty List")
  case List(x) => List()
  case y::ys => y::init(ys)
}

//Concat process

def conCat[T](xs: List[T], ys: List[T]):List[T] = xs match{
  case List() => ys
  case z::zs => z::conCat(zs,ys)
}

//Reverse process

def rev[T](xs:List[T]):List[T] = xs match {
  case List() => xs
  case y::ys => rev[ys]++ List(y)

}


