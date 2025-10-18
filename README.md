# Thinking in Java

## Prolog
I'm currently reading _Thinking in Java_ and writing notes and test programs along the way.  
I've highlighted the key ideas from the book for future reference and written several test programs to deepen my understanding.

## About the Book
- Author: Bruce Eckel
- Version: Fourth Edition

## Gist of the Book
Preface

Introduction

Introduction to Objects

Everything Is an Object
- Storage: P63
- Primitive types: P65
- **static**: P76, P172(global feature), P186(initialization), P262(**final**)
- Embedded documentation: P81

Operators
- Literals(systems & trailing characters): P108
- Shift operators(**<<**, **>>**, **>>>**): P112
- Operators: P123

Controlling Execution
- Foreach: P140
  - Implement **Iterable** to use foreach: P431
- Label (**goto**): P147

Initialization & Cleanup
- Overloading with primitives: P161
- **finalize()**, **System.gc()**: P176
- Garbage Collector, JIT compiler: P178
- Explicit initialization: P190
- Array: P193, P747
- Varargs: P198
- **Object.getClass()**: P201, P320
- **enum**: P204

Access Control
- **package**: P212
- **System.out.printf()**: P218
- **protected** & **extends**: P226, P241(inheritance & **super**)
- Singleton: P231

Reusing Classess
- **Object.toString()**: P238, P319(define it in implementation of **interface**), P509(print the address of an object with **super.toString()**)
- **main()** acted as a test bed: P242, P367(use a nested class instead)
- **try** & **finally**: P254, P473
- **@override**: P256
- Composition vs. inheritance: P256, P304
- Upcasting & downcasting: P260, P308(downcasting)
- **final**: P262
  - **final** data, **static** data & blank **final**s: P262
  - **final** arguments: P266
  - **final** methods & **private** methods: P267
  - **final** classes: P270

Polymorphism
- Early binding & late binding: P281
- Constructor: P293
  - Order of constructor calls: P293
  - Methods inside constructors: P301
- **depose()**: P295
- Composition vs. inheritance: P304
- Downcasting:
  - Substitution vs. extension: P306
  - Downcasting & RTTI: P308

Interfaces
- **abstract** & **extends**: P311
- **interface** & **implements**: P316
  - Adapter(add an **interface** onto an existing **class**): P325, P333(to implement **Readable**)
  - Use **extends** to build a new **interface**: P329
- Multiple inheritance: P326
- **class** **Scanner** & **interface** **Readable**: P332
  - Use the adapter pattern: P333
- Initialize fields in **interface**s: P335
- Nesting **interface**s: P336
- Factory method design pattern: P339, P361(inner classes)
- Control frameworks(event-driven systems): P375

Inner Classes
- Implement selector within a class: P347, P352(upcasting)
- **.this** & **.new**: P350 & P368(in a multiply nested class)
- More about inner classes: P354
  - Inner classes with a method or any arbitrary scope: P355
  - Local inner classes: P385
  - Anonymous inner classes: P356
  - Interit from inner classes: P382
  - Override inner classes: P383
  - Factory method: P361
  - Control frameworks: P375
  - Identifiers(**$**): P387
- Nested classes(**static** inner classes): P364
  - Classes inside interfaces(**public** **static** inner classes): P366, P387(identifiers)
  - Use a nested class as a test bed: P367
- Why inner classes(to inherit from more than one non-interface): P369
  - Use closures to allow callbacks: P372

Holding Your Objects
- **ArrayList**, **@SuppressWarnings** : P390
- **Arrays.asList()** & **Collections.addAll()**: P396
- containers(**Collection**, **Map**): P398
  - Methods: P439
- **List**: P401
  - **ArrayList**: P401
  - **LinkedList**(**Queue**): P410, P423(**Queue**)
  - Implement a **Stack\<T\>** using **LinkedList**: P412 & P759(generics)
- **Iterator**: P406
  - **ListIterator**: P409
  - Implement customized **Iterator**: P429
  - Implement **Iterable** to use foreach: P431
  - Reverse & random: P434
- **Set**: P415
  - **HashSet** & **LinedHashSet**: P415
  - **TreeSet** & comparators: P417, P425(**PriorityQueue**)
- **Map**: P419
  - Expanded **Map**: P420
- **Queue**: P423
  - **PriorityQueue** & comparators: P425
- Operating system environment variables: P432

Error Handling with Exceptions
- **throw** & **Throwable**: P446, P458(**Throwable** methods)
- **try** & **catch**: P447
  - Exception matching: P489
- Create exceptions: P449
  - Standard error stream(**System.err**): P450
  - **Throwable.printStackTrace()**: P451
  - logging: P452
  - Exception specification with **throws**: P457
- **Exception** methods: P458
  - Print stack trace with **Throwable.getStackTrace()**: P460
  - Rethrow an exception with **Throwable.fillInStackTrace()**: P461
- Create exception chaining with cause object(constructor taking a cause argument or **Throwable.initCause()**) & StringBuilder: P464
- **RuntimeException**: P469
- **finally**: P473
- Exception handling during inheritance: P479
- Exception during constrction & cleanup(**FileReader**, **BufferedReader**): P483
- Handle exceptions: P497
  - Pass it out to the console: P497
  - Convert it to an unchecked exception: P497

String
- immutability: P503
- Overloaded operator '+' vs. **StringBuilder**: P504
  - Decompile with **javap**: P505
  - **StringBuffer**: P509
- **Object.toString()**: P509
- Basic methods: P511
- Formatting output: P514
  - **System.out.format()**, **System.out.printf()**: P514
  - **Formatter** & **PrintStream**: P515
  - Format specifiers: P516
  - Conversions: P518
  - **String.format()**: P521
- Regular expressions: P523
  - **String.matches()**, **String.split()**, **String.replaceFirst()** & **String.replaceAll()**: P524, P540(**Pattern.split()**), P541(**Pattern.replaceFirst()**, **Pattern.replaceAll()**)
  - Regex patterns: P527
  - Quantifiers(greedy, reluctant, possessie): P529
  - **CharSequence** interface: P530
  - **Pattern**: P531
    - Use **static Pattern.compiile()** to produce a **Pattern** object: P531
    - Use **Pattern.matcher()** to produce a **Matcher** object: P532
    - **static Pattern.matches()** & **static Pattern.split()** with **CharSequence**: P532
    - **Pattern.split()**: P540
    - Replace operations: P541
    - **Pattern** flags(**(?i)**, **(?m)**, **(?x)**): P538
  - **Matcher**: P532
    - **Matcher.matches()**, **Matcher.lookingAt()**: P532, P536
    - **Matcher.find()**: P533
    - **Matcher.groupCount()**, **Matcher.group()**: P534
    - **Matcher.start()**, **Matcher.end()**: P536
    - **Matcher.reset()**: P544
- Input: P546
  - **BufferedReader.readLine()**, **Integer.parseInt()** & **Double.parseDouble()**: P546
  - **Scanner.nextLine()**, **Scanner.nextInt()** & **Scanner.nextDouble()**: P548
  - **Scanner.useDelimiter()**, **Scanner.delimiter()**: P549
  - **Scanner.match()** & **MatchResult**: P550
  - **StringTokenizer** vs. **Scanner**: P551

Type Information
(to be continued)

Generics
(to be continued)

Arrays
- **Arrays.toString()**: P748
- Initialization: P750
- Multidimensional arrays: P754
  - **Arrays.deepToString()**: P755
  - Ragged array: P755
- Generics: P759
  - Parameterized class and parameterized method: P759
  - An array of generics with **@SuppressWarnings("unchecked")**: P760


## My Test Program
- Test1.java: **Random**(Page 100), **Integer.valueOf()**(Page 65), **Integer.toBinaryString()**(Page 109)
- Test2.java: foreach(Page 140), **String.toCharArray()**(Page 141)
- Test3.java: overloading(Page 158), **this**(Page 167)
  - Test3.cpp: the counterpart of Test3.java in C++
- Test4.java: **static**(Page 172), initialization(Page 186, Page 272)
- Test5.java: array(Page 193), **Arrays.toString()**(Page 195)
- Test6.java: **Object.toString()**(Page 238), **extends**(Page 241), **main()**(Page 242), **super**(Page 243)
- Test7.java: **final**(Page 262)
- Test8.java: containers(Page 398)
- Test9.java: **ListIterator**(Page 409)
- Test10.java: **abstract**(Page 311), downcasting(Page 308), **Object.toString()**(Page 238, Page 319)
- Test11.java: **interface**(Page 316), **Object.getClass()**(Page 201, Page 320)
- Test12.java: anonymous inner classes(Page 356), identifiers(Page 387)
- Test13.java: exceptions(Page 499), **System.err**(Page 450), **Throwable.printStackTrace()**(Page 451)
- Test14.java: **finally**(Page 473), Cleanup(Page 483), Exception matching(Page 489)
- Test15.java: **RuntimeException**(Page 469)
- Test16.java: **Object.toString()**(Page 509)
- Test17.java: shift operators(Page 112)
