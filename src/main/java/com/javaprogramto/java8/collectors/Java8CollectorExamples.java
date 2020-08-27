package com.javaprogramto.java8.collectors;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.DoubleSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Java 8 Collectors api Examples
 *
 * @author Venkatesh
 *
 */
public class Java8CollectorExamples {

    public static void main(String[] args) {

// Creating a Employee List - Example

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(100, "Sundar", 47, "North America", 450000));
        employeeList.add(new Employee(200, "Pichai", 25, "North America", 50000));
        employeeList.add(new Employee(300, "Larry", 30, "Asia", 450000));
        employeeList.add(new Employee(400, "Page", 59, "Africa", 450000));

// Collectors.toList() Example

        List<String> namesList = employeeList.stream().map(e -> e.getName()).collect(Collectors.toList());
        System.out.println(namesList);

// Collectors.toSet() Example
        Set<String> regionSet = employeeList.stream().map(e -> e.getRegion()).collect(Collectors.toSet());
        System.out.println(regionSet);
        regionSet.add("hello");
        System.out.println(regionSet);

// Collectors.toUnmodifiableSet() Example

        Set<Double> unmodifiableSet = employeeList.stream().map(e -> e.getSal())
                .collect(Collectors.toUnmodifiableSet());
        System.out.println(unmodifiableSet);
// unmodifiableSet.add(10983d);

// employeeList.add(null);

        Set<Employee> empSet = employeeList.stream().collect(Collectors.toUnmodifiableSet());

// Collectors.toUnmodifiableList(() Example
// employeeList.add(null);
        List<Double> unmodifiableList = employeeList.stream().map(e -> e.getSal())
                .collect(Collectors.toUnmodifiableList());
        System.out.println(unmodifiableList);

// Collectors.toCollection() Example

        List<String> namesLinkedList = employeeList.stream().map(e -> e.getName())
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(namesLinkedList);

        Set<String> regionTreeSet = employeeList.stream().map(e -> e.getRegion())
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(regionTreeSet);

// Collectors.toMap() Example
        Map<Integer, Employee> empMap = employeeList.stream()
                .collect(Collectors.toMap((e) -> e.getId(), Function.identity()));
        System.out.println(empMap);

// with duplicate key. uncomment to work with toMap() for duplicate merger.
// employeeList.add(new Employee(400, "Larry Page", 59, "Africa", 450000));

        Map<Integer, Employee> empDupMap = employeeList.stream()
                .collect(Collectors.toMap((e) -> e.getId(), Function.identity(), (emp, sameEmp) -> sameEmp));
        System.out.println(empDupMap);

// Collectors.toUnmodifiableMap() Example
        Map<Integer, Employee> empUnmodifiedMap = employeeList.stream()
                .collect(Collectors.toMap((e) -> e.getId(), Function.identity(), (emp, sameEmp) -> sameEmp));
        System.out.println(empUnmodifiedMap);

// Collector.summingInt() Example

        int sumOfEmpIds = employeeList.stream().collect(Collectors.summingInt((Employee e) -> e.getId()));
        System.out.println("Collectors.summingInt : " + sumOfEmpIds);

// Collector.summingInt() Example

        double sumOfEmpSalss = employeeList.stream().collect(Collectors.summingDouble((Employee e) -> e.getSal()));
        System.out.println("Collectors.summingDouble : " + sumOfEmpSalss);

// Collectors.averagingInt() / averagingLong() / averagingDouble() Examples

        double avgOfEmpSalss = employeeList.stream().collect(Collectors.averagingDouble((Employee e) -> e.getSal()));
        System.out.println("Collectors.averagingDouble avg sal: " + avgOfEmpSalss);

// Collectors.counting() Example

        long count = employeeList.stream().collect(Collectors.counting());
        System.out.println("Collectors.counting() : Count : " + count);

// Collectors.joining() Example
        String joinedStr = employeeList.stream().map(e -> e.getName()).collect(Collectors.joining());
        System.out.println("joinedStr by using joining() method : " + joinedStr);

        String joinedDelimiterStr = employeeList.stream().map(e -> e.getName()).collect(Collectors.joining(" * "));
        System.out.println("joinedDelimiterStr by using joining(Delimiter) method : " + joinedDelimiterStr);

        String joinePrePostStr = employeeList.stream().map(e -> e.getName()).collect(Collectors.joining("*", "@", "|"));
        System.out.println("joinePrePostStr by using joining(Delimiter) method : " + joinePrePostStr);

// Collectors.groupingBy() Example
        Map<String, List<Employee>> groupByRegion = employeeList.stream()
                .collect(Collectors.groupingBy((Employee e) -> e.getRegion()));
        System.out.println("groupByRegion :: " + groupByRegion);

// groupingBy for set.
        Map<String, Set<Employee>> groupByRegionSet = employeeList.stream()
                .collect(Collectors.groupingBy((Employee e) -> e.getRegion(), Collectors.toSet()));
        System.out.println("groupByRegionSet :: " + groupByRegionSet);

// Collectors.partitioningBy() Example
        Map<Boolean, List<Employee>> partitionByAge = employeeList.stream()
                .collect(Collectors.partitioningBy(e -> e.getAge() > 30));
        System.out.println("partitionByAge :: " + partitionByAge);

// Set as Map value
        Map<Boolean, Set<Employee>> partitionByAgeSet = employeeList.stream()
                .collect(Collectors.partitioningBy(e -> e.getAge() > 30, Collectors.toSet()));

// LinkedList as Map value
        Map<Boolean, LinkedList<Employee>> partitionByAgeLinedList = employeeList.stream()
                .collect(Collectors.partitioningBy(e -> e.getAge() > 30, Collectors.toCollection(LinkedList::new)));

// TreeSet as Map value
        /*
         * Map<Boolean, TreeSet<Employee>> partitionByAgeTreeSet = employeeList.stream()
         * .collect(Collectors.partitioningBy(e -> e.getAge() > 30,
         * Collectors.toCollection(TreeSet::new)));
         */

// Collectors.toConcurrentMap() Example
        Map<Integer, Employee> empConcurrentMap = employeeList.stream()
                .collect(Collectors.toConcurrentMap((e) -> e.getId(), Function.identity()));
        System.out.println(empConcurrentMap);

// with duplicate key. uncomment to work with toMap() for duplicate merger.
// employeeList.add(new Employee(400, "Larry Page", 59, "Africa", 450000));

        Map<Integer, Employee> empDupConcurrentMap = employeeList.stream()
                .collect(Collectors.toConcurrentMap((e) -> e.getId(), Function.identity(), (emp, sameEmp) -> sameEmp));
        System.out.println(empDupMap);

// Collectors.filtering() Example
        List<Employee> filteredEmpList = employeeList.stream()
                .collect(Collectors.filtering((Employee e) -> e.getAge() > 30, Collectors.toList()));
        System.out.println("Collectors.filtering() - filteredEmpList : " + filteredEmpList);

// Collectors.flatMapping() Example

        LineItem lineItem1 = new LineItem(1001, "Item 1", new Date(2010, 07, 01));
        LineItem lineItem2 = new LineItem(1002, "Item 2", new Date(2020, 07, 01));
        LineItem lineItem3 = new LineItem(1003, "Item 3", new Date(2030, 07, 01));
        LineItem lineItem4 = new LineItem(1004, "Item 4", new Date(2040, 07, 01));
        LineItem lineItem5 = new LineItem(1005, "Item 5", new Date(2050, 07, 01));

        List<LineItem> lineItemsList1 = new ArrayList<>();
        lineItemsList1.add(lineItem1);
        lineItemsList1.add(lineItem2);
        lineItemsList1.add(lineItem3);
        lineItemsList1.add(lineItem4);
        lineItemsList1.add(lineItem5);

        Customer customer1 = new Customer(100, "Customer 1", true, "M", lineItemsList1);

        LineItem lineItem6 = new LineItem(2001, "Item 6", new Date(2010, 07, 01));
        LineItem lineItem7 = new LineItem(2002, "Item 7", new Date(2020, 07, 01));

        List<LineItem> lineItemsList2 = new ArrayList<>();
        lineItemsList2.add(lineItem6);
        lineItemsList2.add(lineItem7);

        Customer customer2 = new Customer(200, "Customer 2", true, "F", lineItemsList2);

        LineItem lineItem8 = new LineItem(2003, "Item 8", new Date(2040, 07, 01));
        LineItem lineItem9 = new LineItem(3004, "Item 9", new Date(2070, 07, 01));
        LineItem lineItem10 = new LineItem(3005, "Item 10", new Date(2200, 07, 01));

        List<LineItem> lineItemsList3 = new ArrayList<>();
        lineItemsList3.add(lineItem8);
        lineItemsList3.add(lineItem9);
        lineItemsList3.add(lineItem10);

        Customer customer3 = new Customer(300, "Customer 3", true, "M", lineItemsList3);
        Customer customer4 = new Customer(400, "Customer 4", true, "F", new ArrayList<LineItem>());

        List<Customer> customersList = new ArrayList<>();
        customersList.add(customer1);
        customersList.add(customer2);
        customersList.add(customer3);
        customersList.add(customer4);

        Map<String, Set<LineItem>> itemsByGender = customersList.stream()
                .collect(Collectors.groupingBy((Customer c) -> c.getGender(),
                        Collectors.flatMapping(customer -> customer.getLineItems().stream(), Collectors.toSet())));
        System.out.println("itemsByGender : " + itemsByGender);

        Map<String, Long> itemsCountByGender = customersList.stream()
                .collect(Collectors.groupingBy((Customer c) -> c.getGender(),
                        Collectors.flatMapping(customer -> customer.getLineItems().stream(), Collectors.counting())));
        System.out.println("itemsCountByGender " + itemsCountByGender);

// Collectors.maxBy() Example
        Comparator<Employee> empComparator = (e1, e2) -> e1.getId() - e2.getId();
        Optional<Employee> empMaxOptional = employeeList.stream().collect(Collectors.maxBy(empComparator));
        if (empMaxOptional.isPresent()) {
            System.out.println("Max Emp : " + empMaxOptional.get());
        }

// Collectors.minBy() Example
        Optional<Employee> empminOptional = employeeList.stream().collect(Collectors.minBy(empComparator));
        if (empminOptional.isPresent()) {
            System.out.println("Min Emp : " + empminOptional.get());
        }

// Collectors.reducing() Example
        Optional<Employee> reducingOptinal = employeeList.stream()
                .collect(Collectors.reducing(BinaryOperator.minBy(empComparator)));
        if (reducingOptinal.isPresent()) {
            System.out.println("Min Emp using reducing() method : " + reducingOptinal.get());
        }

// Collectors.summarizingDouble() Example
        DoubleSummaryStatistics doubleSummaryStatistics = employeeList.stream()
                .collect(Collectors.summarizingDouble((Employee e) -> e.getSal()));
        System.out.println("Statistics summary on employees salary : " + doubleSummaryStatistics);

// Converting 1 to 100 numbers into Stream integer.
        List<Integer> intList = new ArrayList<>();
        IntStream.range(1, 100).forEach(i -> intList.add(i));

// Calling teeing method.
        Double average = intList.stream().collect(
                Collectors.teeing(Collectors.summingDouble(i -> i), Collectors.counting(), (sum, n) -> sum / n));

        System.out.println("Average of first 100 numbers: " + average);

    }
}

class Customer {
    private int id;
    private String name;
    private boolean active;
    private String gender;
    private List<LineItem> lineItems;

    public Customer(int id, String name, boolean active, String gender, List<LineItem> lineItems) {
        super();
        this.id = id;
        this.name = name;
        this.active = active;
        this.gender = gender;
        this.lineItems = lineItems;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

}

class LineItem {

    private int itemId;
    private String itemName;
    private Date manfacturedDate;

    public LineItem(int itemId, String itemName, Date manfacturedDate) {
        super();
        this.itemId = itemId;
        this.itemName = itemName;
        this.manfacturedDate = manfacturedDate;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Date getManfacturedDate() {
        return manfacturedDate;
    }

    public void setManfacturedDate(Date manfacturedDate) {
        this.manfacturedDate = manfacturedDate;
    }

    @Override
    public String toString() {
        return "LineItem [itemId=" + itemId + ", itemName=" + itemName + ", manfacturedDate=" + manfacturedDate + "]";
    }

}

class Employee {
    private int id;
    private String name;
    private int age;
    private String region;
    private double sal;

    public Employee(int id, String name, int age, String region, double sal) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.region = region;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", region=" + region + ", sal=" + sal + "]";
    }

}

/*
Output:
[Sundar, Pichai, Larry, Page]
[Asia, Africa, North America]
[Asia, Africa, hello, North America]
[50000.0, 450000.0]
[450000.0, 50000.0, 450000.0, 450000.0]
[Sundar, Pichai, Larry, Page]
[Africa, Asia, North America]
{400=Employee [id=400, name=Page, age=59, region=Africa, sal=450000.0], 100=Employee [id=100, name=Sundar, age=47, region=North America, sal=450000.0], 200=Employee [id=200, name=Pichai, age=25, region=North America, sal=50000.0], 300=Employee [id=300, name=Larry, age=30, region=Asia, sal=450000.0]}
{400=Employee [id=400, name=Page, age=59, region=Africa, sal=450000.0], 100=Employee [id=100, name=Sundar, age=47, region=North America, sal=450000.0], 200=Employee [id=200, name=Pichai, age=25, region=North America, sal=50000.0], 300=Employee [id=300, name=Larry, age=30, region=Asia, sal=450000.0]}
{400=Employee [id=400, name=Page, age=59, region=Africa, sal=450000.0], 100=Employee [id=100, name=Sundar, age=47, region=North America, sal=450000.0], 200=Employee [id=200, name=Pichai, age=25, region=North America, sal=50000.0], 300=Employee [id=300, name=Larry, age=30, region=Asia, sal=450000.0]}
Collectors.summingInt : 1000
Collectors.summingDouble : 1400000.0
Collectors.averagingDouble avg sal: 350000.0
Collectors.counting() : Count : 4
joinedStr by using joining() method : SundarPichaiLarryPage
joinedDelimiterStr by using joining(Delimiter) method : Sundar * Pichai * Larry * Page
joinePrePostStr by using joining(Delimiter) method : @Sundar*Pichai*Larry*Page|
groupByRegion :: {Asia=[Employee [id=300, name=Larry, age=30, region=Asia, sal=450000.0]], Africa=[Employee [id=400, name=Page, age=59, region=Africa, sal=450000.0]], North America=[Employee [id=100, name=Sundar, age=47, region=North America, sal=450000.0], Employee [id=200, name=Pichai, age=25, region=North America, sal=50000.0]]}
groupByRegionSet :: {Asia=[Employee [id=300, name=Larry, age=30, region=Asia, sal=450000.0]], Africa=[Employee [id=400, name=Page, age=59, region=Africa, sal=450000.0]], North America=[Employee [id=100, name=Sundar, age=47, region=North America, sal=450000.0], Employee [id=200, name=Pichai, age=25, region=North America, sal=50000.0]]}
partitionByAge :: {false=[Employee [id=200, name=Pichai, age=25, region=North America, sal=50000.0], Employee [id=300, name=Larry, age=30, region=Asia, sal=450000.0]], true=[Employee [id=100, name=Sundar, age=47, region=North America, sal=450000.0], Employee [id=400, name=Page, age=59, region=Africa, sal=450000.0]]}
{400=Employee [id=400, name=Page, age=59, region=Africa, sal=450000.0], 100=Employee [id=100, name=Sundar, age=47, region=North America, sal=450000.0], 200=Employee [id=200, name=Pichai, age=25, region=North America, sal=50000.0], 300=Employee [id=300, name=Larry, age=30, region=Asia, sal=450000.0]}
{400=Employee [id=400, name=Page, age=59, region=Africa, sal=450000.0], 100=Employee [id=100, name=Sundar, age=47, region=North America, sal=450000.0], 200=Employee [id=200, name=Pichai, age=25, region=North America, sal=50000.0], 300=Employee [id=300, name=Larry, age=30, region=Asia, sal=450000.0]}
Collectors.filtering() - filteredEmpList : [Employee [id=100, name=Sundar, age=47, region=North America, sal=450000.0], Employee [id=400, name=Page, age=59, region=Africa, sal=450000.0]]
itemsByGender : {F=[LineItem [itemId=2001, itemName=Item 6, manfacturedDate=Mon Aug 01 00:00:00 IST 3910], LineItem [itemId=2002, itemName=Item 7, manfacturedDate=Sun Aug 01 00:00:00 IST 3920]], M=[LineItem [itemId=1001, itemName=Item 1, manfacturedDate=Mon Aug 01 00:00:00 IST 3910], LineItem [itemId=1005, itemName=Item 5, manfacturedDate=Tue Aug 01 00:00:00 IST 3950], LineItem [itemId=1004, itemName=Item 4, manfacturedDate=Thu Aug 01 00:00:00 IST 3940], LineItem [itemId=1002, itemName=Item 2, manfacturedDate=Sun Aug 01 00:00:00 IST 3920], LineItem [itemId=1003, itemName=Item 3, manfacturedDate=Fri Aug 01 00:00:00 IST 3930], LineItem [itemId=2003, itemName=Item 8, manfacturedDate=Thu Aug 01 00:00:00 IST 3940], LineItem [itemId=3004, itemName=Item 9, manfacturedDate=Sat Aug 01 00:00:00 IST 3970], LineItem [itemId=3005, itemName=Item 10, manfacturedDate=Sun Aug 01 00:00:00 IST 4100]]}
itemsCountByGender {F=2, M=8}
Max Emp : Employee [id=400, name=Page, age=59, region=Africa, sal=450000.0]
Min Emp : Employee [id=100, name=Sundar, age=47, region=North America, sal=450000.0]
Min Emp using reducing() method : Employee [id=100, name=Sundar, age=47, region=North America, sal=450000.0]
Statistics summary on employees salary : DoubleSummaryStatistics{count=4, sum=1400000.000000, min=50000.000000, average=350000.000000, max=450000.000000}
Average of first 100 numbers: 50.0

*/