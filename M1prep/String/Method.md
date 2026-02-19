📘 String (Immutable)

🔹 Definition:
String objects are immutable → once created, their value cannot be changed.

String s = "Hello";
s = s + " World"; // creates new object

✅ Common String Methods
1️⃣ Length & Character Access
s.length();          // number of characters
s.charAt(index);     // character at index

2️⃣ Comparison
s.equals(str);               // case-sensitive comparison
s.equalsIgnoreCase(str);     // case-insensitive
s.compareTo(str);            // lexicographic comparison

3️⃣ Searching
s.contains("Java");     // true/false
s.indexOf('a');         // first index
s.lastIndexOf('a');     // last index
s.startsWith("He");
s.endsWith("lo");

4️⃣ Case Conversion
s.toUpperCase();
s.toLowerCase();

5️⃣ Substring
s.substring(start);
s.substring(start, end); // end exclusive

6️⃣ Replace
s.replace('a', 'b');
s.replace("Java", "Python");

7️⃣ Trim & Strip
s.trim();   // remove leading & trailing spaces

8️⃣ Split
String[] arr = s.split(" ");

9️⃣ Convert to Other Types
String.valueOf(123);
Integer.parseInt("123");
Double.parseDouble("45.6");

📘 StringBuilder (Mutable)

🔹 Definition:
StringBuilder is mutable → you can modify without creating new objects.

StringBuilder sb = new StringBuilder("Hello");

✅ Common StringBuilder Methods
1️⃣ Append
sb.append(" World");

2️⃣ Insert
sb.insert(5, " Java");

3️⃣ Replace
sb.replace(start, end, "Text");

4️⃣ Delete
sb.delete(start, end);
sb.deleteCharAt(index);

5️⃣ Reverse
sb.reverse();

6️⃣ Length & Capacity
sb.length();
sb.capacity();

7️⃣ Modify Character
sb.setCharAt(index, 'A');

8️⃣ Convert to String
String result = sb.toString();

🔎 String vs StringBuilder Comparison
Feature	String	StringBuilder
Mutable	❌ No	✅ Yes
Memory Efficient for Modifications	❌	✅
Thread Safe	✅	❌
Performance	Slower (many changes)	Faster
🎯 When to Use What?

✅ Use String:

When value does not change frequently

For constants

For small operations

✅ Use StringBuilder:

When modifying string in loops

For heavy concatenation

For better performance