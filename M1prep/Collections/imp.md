Your logic is almost correct, but duplicate prevention will NOT work right now.

Why?
Because LinkedHashSet uses equals() and hashCode() to detect duplicates — and you have not overridden them in Student.

So currently:

studentSet.contains(student)


compares object reference, not studentId or emailId.

That means your duplicate student will still be adde 
✅ What You Must Fix

Override equals() and hashCode() inside Student class.

Duplicates must be detected if:

Same studentId
OR

Same emailId 

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;

    if (obj == null || getClass() != obj.getClass())
        return false;

    Student other = (Student) obj;

    return this.studentId == other.studentId ||
           this.emailId.equals(other.emailId);
}

@Override
public int hashCode() {
    return Objects.hash(studentId, emailId);
}

---
 Map<String, List<Rental>> grouped = new LinkedHashMap<>();

        for (Rental rental : list) {
            if (grouped.containsKey(rental.vehicleType)) {
                // just add to the existing list
                // not       grouped.put(rental.vehicleType,grouped.get(rental.vehicleType).add(rental));

                grouped.get(rental.vehicleType).add(rental);
            } else {
                List<Rental> li = new ArrayList<>();
                li.add(rental);
                grouped.put(rental.vehicleType, li);
            }
        }
---