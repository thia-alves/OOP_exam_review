# OOP Coding Test — Review and Reflection

## 1. My Original Examination Grade

### Task 1 — /40
**My mark:** 30

**Why I awarded this mark:** I got the first and second part of the workshop class working but I 
did not get the third part working, this makes it so I think I got 30 marks for the first one

### Task 2 — /40
**My mark:** 0

**Why I awarded this mark:** I was close to finnishing the first part of task 2 but i never got it fully right,
so I dont think i got any marks for task 2 at all


### Task 3 — /20
**My mark:** 0 

**Why I awarded this mark:** I could not get to this part because I never finshed part 2 and never even started part 3

**Total self-assessed grade:** 30/100

## 2. Corrections and Improvements

Describe two or three important problems you identified
in your original code. Explain what you changed and
why it works now.
public void setWorkshopName(String WorkshopName)
## first mistake
i had this in my workshop when it shouldve been in main instead

Scanner scan = new Scanner(System.in);

This doesnt work in workshop which was part of the reason my code wasnt working
i got rid of it from workshop
## second
Workshop setWorkshop = new Workshop("work",32);

my workshop value was just fixed instead of anything that was put in which clearly doesnt work
, i got rid of this line entirely 
## third
for(int i = 0; i < registrations; i++){
int studentsID = Integer.parseInt(scan.nextLine());
}

this loop doesnt work for a few reasons 
1. its not even registring anything nothing is being saved into the hashset its reads them but doesnt save anyhting
2. its using int which cant save letters 

soulition was to use a string and i probbaly wouldve solved it

## 3. Reflection

**What did you understand during the examination
but struggle to implement?** 

the scanner i knew how it worked but i just put it in the wrong location and sometimes just messed up with it in the exam

**What was the most important thing you learned
from correcting your code?** 

how a hash set works and hoe to implement it into code during the exam i didnt understand fully how it worked whcih lost me many marks

**What would you do differently in your next
coding test?** 

pay more attention to labels of the classes like string and write more code in genral instead of sitting there confused 

---

## Review lab assessment and mark recovery

The **review lab** is graded separately out of 20 marks:

| Review criterion | Maximum marks |
|---|---:|
| Original self-assessment and supporting evidence | 4 |
| Explanation of mistakes and Java concepts | 6 |
| Corrections and improvements | 4 |
| Testing and demonstration | 4 |
| Reflection | 2 |
| **TOTAL** | **20** |

You can recover **up to 30% of the marks you lost** in the original examination. The actual amount depends on your review lab grade. Your lecturer's examination grade, **not your self-awarded mark**, is used in the calculation.

**Marks recovered = (100 − original exam mark) × 0.30 × (review lab mark ÷ 20)**

**Revised exam mark = original exam mark + marks recovered**

For example, an original examination mark of 40/100 and a review lab mark of 16/20 would recover 14.4 marks, giving a revised result of **54.4/100**.

The aim is to show that you understand your mistakes and can explain your improvements. Simply copying a working solution does not demonstrate this understanding.

