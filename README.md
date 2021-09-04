## Functional Programming

### Type 1 : Intermediate Operations(Returns Stream)
* stream() : Gets one element of collection each
* filter(x->x%2) : Filters based on condition
* map(x->y) : Converts x to y and returns y
* List<String> stringWords = List.of("A","B");
  stringWords.stream().filter(x->x.length()=1).map(x->System.out::println)
 [System : Class & println : Static method reference]
* distinct() : Distinct inputs
* courses.stream().sorted(Comparator.naturalOrder).forEach(System.out::println)

### Type 2 : Terminal Operations(Returns one or list of variables)
* numbers.stream().reduce(0,(x,y->Integer::sum) [0: Identity Value; x,y : Input ; sum : Result ; Addition of numbers]
* numbers.stream().map(x->x*x).collect(Collectors.toList())

## Functional Interfaces
* Has only 1 abstract method 

## TODO
* In progres
