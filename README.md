## INSTRUCTIONS

1. Write a robot class that handles a message.
1. At any moment during movement, robot can hit an obstacle.
1. If a robot hits an obstacle, it will stop.

**MUST HAVE METHODS:**

```java
void travel() {};
// Robot moves forward as far as it can

void travel(int n) {};
// Robot checks if there are obstacles
// Robot moves forward a set number of steps

void changeDirection(String direction)
// INPUT: WASD
// Change robot orrientation (NORTH, EAST, SOUTH, WEST)
```

---

### SAMPLE INPUT / OUTPUT

> Note:
> Default direction: East

**Controls**

```
Orrientation:
  W → North
  D → East (Default)
  S → South
  A → West

Traveling:
  [enter] → Move 1 cell forward
  [number] → Move n times of cell forward

Note:
  H → Show Help
  M → Show Map
  R → Generate New Map
  X → Exit
```

---

**Welcome Message**

```
iRobot is starting its journey.
Press any key to continue.
```

**No Input**

```
$ [enter]
iRobot moved 1 square East

$ [enter]
iRobot moved 1 square East

etc...
```

**Changing Directions**

```
$ [enter]
iRobot moved 1 square East

$ W
iRobot moved 1 square North

$ [enter]
iRobot moved 1 square North

$ S
iRobot moved 1 square South

$ [enter]
iRobot moved 1 square South
```

**Traveling Long Distance**

```
$ 3
iRobot moved 1 square South
iRobot moved 1 square South
iRobot moved 1 square South

$ 2
iRobot moved 1 square South
iRobot moved 1 square South
```

**Encountering Obstacles I.**

```
$ [enter]
iRobot has encountered an obstacle. Please change your direction.

$ [enter]
iRobot has encountered an obstacle. Please change your direction.

$ A
iRobot moved 1 square West

$ [enter]
iRobot moved 1 square West
```

**Encountering Obstacles II.**

```
$ 4
iRobot moved 1 square South
iRobot moved 1 square South
iRobot has encountered an obstacle. Please change your direction.

$ 3
iRobot has encountered an obstacle. Please change your direction.
```
