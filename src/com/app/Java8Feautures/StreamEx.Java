class StreamsEx{
   public static void main(String[] args) {
       List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
         Stream<Integer> stream = list.stream();
            stream.forEach(System.out::println);
   }
}