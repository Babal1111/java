return Integer.hashCode(id); // unboxing occurs automatically if id is Integer

Java Quick Notes
1. String, StringBuilder, and String Methods

Strings are immutable in Java.

Example: w3.charAt(i) = Character.toUpperCase(...) → ❌ Not allowed

Correct way with StringBuilder:

StringBuilder sb = new StringBuilder("hello");
sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));


String methods examples:

if ("aeiouAEIOU".indexOf(c) != -1) // check if char is a vowel
if (Character.isLetter(c) && !"aeiouAEIOU".contains(String.valueOf(c))) // consonant check
return String.valueOf(productOfDigits); // convert int to string


Iterating over characters in a string:

for (int i = 0; i < combinedStr.length(); i++) {
    char c = combinedStr.charAt(i);
    if (Character.isLetter(c)) {
        if ("aeiouAEIOU".indexOf(c) != -1)
            vCount++;
        else
            cCount++;
    }
    else if (Character.isDigit(c)) {
        productOfDigits *= Character.getNumericValue(c);
        dCount++;
    } else {
        sCount++;
    }
}

2. Math.max()

Nested usage to find the maximum among multiple numbers:

int max = Math.max(Math.max(vCount, cCount), Math.max(dCount, sCount));

3. equals() and hashCode() in Classes

Important when using objects in collections like Set or Map.

Example for Employee:

@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Employee)) return false;
    Employee other = (Employee) obj;
    return this.id == other.id;
}

@Override
public int hashCode() {
    return Objects.hash(id);
}


For Student with multiple fields:

@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Student other = (Student) obj;
    return this.studentId == other.studentId ||
           this.emailId.equals(other.emailId);
}

@Override
public int hashCode() {
    return Objects.hash(studentId, emailId);
}

4. Array and List Notes

Array length: arr.length

Fixed-size list from Arrays.asList():

List<String> ls = Arrays.asList("Smith", "Allen", "John", "King", "Tyler");


⚠ Cannot add/remove elements

Resizable ArrayList:

ArrayList<String> ls = new ArrayList<>(Arrays.asList("Smith", "Allen", "John", "King", "Tyler"));

5. Double to Object
double d = 45.67;
Double a = d; // Autoboxing
System.out.println("Object Type: " + a.getClass().getName());
System.out.println("Object Value: " + a);

6. LinkedHashSet, LinkedHashMap, TreeSet
Feature	LinkedHashSet	LinkedHashMap	TreeSet
Type	Set	Map	Set
Maintains insertion order	✅	✅	❌
Sorted	❌	❌	✅
Allows duplicates	❌	Keys ❌ / Values ✅	❌
Time Complexity	O(1)	O(1)	O(log n)
7. Masking Passwords with StringBuilder
StringBuilder sb = new StringBuilder();
for (int i = 0; i < password.length() - 3; i++) {
    sb.append("*");
}
sb.append(password.substring(password.length() - 3));

8. Iterating Maps
for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}

9. replace(start, end, text) in StringBuilder

start = start index

end = start + length of substring to replace

text = replacement text

Example:

StringBuilder content = new StringBuilder("Hello Java World");
content.replace(6, 6+4, "Python"); // replaces "Java" with "Python"

10. Checking Email Domain
return getNormalizedEmail().endsWith("@example.com");

11. Object Printing / Formatting
"Employee " + employeeId + " works in " + shiftType.name() + " shift (" + shiftType.startingTime + " - " + shiftType.endingTime + ")";

12. PriorityQueue with Comparator
PriorityQueue<Patient> patientsQueue = new PriorityQueue<>(new Comparator<Patient>() {
    public int compare(Patient p1, Patient p2) {
        return Integer.compare(p2.getSeverityLevel(), p1.getSeverityLevel());
    }
});


Orders Patient by severity level descending

13. Iterator / Character Handling

Check vowel:

if ("aeiouAEIOU".indexOf(c) != -1)


Check consonant:

if (Character.isLetter(c) && !"aeiouAEIOU".contains(String.valueOf(c)))


Convert char to uppercase:

Character.toUpperCase(c)

14. Returning Values
return String.valueOf(productOfDigits); // convert int/long to string
