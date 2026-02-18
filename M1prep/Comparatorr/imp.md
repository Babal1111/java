  patientsQueue = new PriorityQueue<Patient>(new Comparator<Patient>(){
            public int compare(Patient p1,Patient p2){
                
                return Integer.compare(p2.getSeverityLevel(),p1.getSeverityLevel());
            }
        });
way to define comparator in pq
---