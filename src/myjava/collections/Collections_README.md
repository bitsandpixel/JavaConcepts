# Collections

* [Introduction](#introduction)
* [Concepts](#concepts)
* [Random Notes](#random-notes)

## Introduction
* Any group of individual objects which are represented as a single unit is known as the collection of the objects.

* Java Collection Framework was introduced in JDK 1.2 to provide a separate common framework to group the java objects.
  before the introduction of Collection framework the standard methods to perform this task are Arrays, Vectors, Hashtables.
  All of these collections had no common interface as you can observe here in `ProblemBeforeCollectionsIntroductionDemo` class.
  They were defined independently and had no correlation among them 
  which was difficult for the users to remember different implementations.
  
* The Collection interface `(java.util.Collection)` and Map interface `(java.util.Map)` 
  are the two main “root” interfaces of Java collection classes.
  

## Concepts
* [ArrayList](#arraylist)
* [LinkedList](#linkedlist)
## Random Notes
* ArrayList is better to access data whereas LinkedList is better to manipulate data. Both classes implements List interface.
* ### ArrayList
  * ArrayList has developed with the concept of Dynamic array.
  * Index starts from 0.
  * Initial size of any array list would always be 10 at the time of creation given the 
    condition that the size of the array list is less than or equal to 10, If the size 
    exceeds the limit it always increments the size by 50%.
  * ArrayList provides constant time for search operation, so it is better to use ArrayList 
    if searching is more frequent operation than add and remove operation.
* ### LinkedList
  * LinkedList has developed with the concept of Double linked list.
  * The LinkedList provides constant time for add and remove operations. So it is better to use 
    LinkedList for manipulation.
