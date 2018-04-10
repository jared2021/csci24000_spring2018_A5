#Honor Pledge
#
#I pledge that I have neither given nor 
#received any help on this assignment.
#
#jascho
all:Driver.class Employee.class StaffPharmacist.class PharmacyManager.class StaffTechnician.class SeniorTechnician.class

Driver.class: Driver.java
	javac Driver.java

Employee.class: Employee.java
	javac Employee.java

StaffPharmacist.class: StaffPharmacist.java
	javac StaffPharmacist.java

PharmacyManager.class: PharmacyManager.java
	javac PharmacyManager.java

StaffTechnician.class: StaffTechnician.java
	javac StaffTechnician.java

SeniorTechnician.class: SeniorTechnician.java
	javac SeniorTechnician.java

run:
	java Driver

clean:
	rm *.class
