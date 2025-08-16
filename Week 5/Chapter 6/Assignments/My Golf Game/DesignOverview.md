# Golf Game

## First time trying this and in the end there were so many elements i had to add outside of this plan
## Practice is practice, though... It did help.

## 1. Requirements

#### - Object oriented Programming Techniques
#### - 3 Required Classes:
<ol style="margin-left: 20px; font-size: 1.2em;">
<li>GolfGame.java</li>
<li>GolfHole.java</li>
<li>GolfClub.java</li>
</ol>

#### - Game:
<ul style="margin-left: 20px; font-size: 1.2em;">
<li>18 holes</li>
<li>300 yards each</li>
<li>par 4</li>
</ul>

#### - UI:
<ul style="margin-left: 20px; font-size: 1.2em;">
<li>Show Hole #</li>
<li>Distance to hole</li>
<li>Stroke #</li>
<li>Par Status</li>
</ul>

---

## 2. Classes

> ### GolfHole
#### Fields:
##### - `holeNumber`, `distanceToHole`, `par`, `strokeCount`

#### Constructor:
```java
public GolfHole() {
    setHoleNumer(0);
    setDistanceToHole(300);
    setPar(4);
    setStrokeCount(0);
}
```

#### Getters & Setters (May not need all of them):
##### - `getHoleNumber`, `getDistanceToHole`, `getPar`, `getStrokeCount`
##### - `setHoleNumber`, `setDistanceToHole`, `setPar`, `setStrokeCount`




> ### GolfClub
#### Fields:
##### - `String clubSelected`, `int minRange`, `int maxRange`, `int hitDistance`

#### Getters & Setters (Use ALL):
##### - `public getClubSelected`, `public getMinRange`, `public getMaxRange`, `public getHitDistance`, `getClubId`
##### - `public setClubSelected`, `private setMinRange`, `private setMaxRange`, `private setHitDistance`

```java
public int getClubId(Scanner kb) {
    displayMenu();
    return kb.nextInt();
}
```

#### Methods:
##### - Select a club (User input)
##### - Set respective field values
##### - Hit ball within club's range
##### - Add Strokes to total when holed

```java
private void displayMenu() {
    // Display Club Selectioin Menu with IDs
}

public void lubAttributes() {
    switch (getClubID) {
        case 1 -> {
            setClubSelected("Putter");
            setMinRange(1);
            setMaxrange(10);
        }
        case 2 -> {
            setClubSelected("Wedge");
            setMinRange(10);
            setMaxRange(50);
        }
        case 3 -> {
            setClubSelected("7 iron");
            setMinRange(20);
            setMaxRange(100)
        }
        case 4 -> {
            setClubSelected("5 iron");
            setMinRange(30);
            setMaxRange(150);
        }
        case 5 -> {
            setClubSelected("3 wood");
            setMinRange(40);
            setMaxRange(250);
        }
        case 6 -> {
            setClubSelected("Driver");
            setMinRange(100);
            setMaxRange(300);
        }
    }
}

public void hitBall() {
    setHitDistance(RNG(getMinRange(), getMaxRange()));
}
```




> ### GolfGame
#### - Main
- improv it lol I can't think of the end result rn
- basically follow the game flow design and ull be good :)



## 3. Game Flow

  1. Welcome User to game
  2. Display the rules and course info
  3. Main Game Loop for `18` holes
     1. Display menu
        1. Starting Distance `300`
        2. User Input `1-6`
     2. Hit Ball
     3. Display Results and info
        1. Hole #
        2. Distance Hit
        3. Distance to the hole
        4. Number of strokes
        5. Count under/over par
     4. move to next hole once ball is holed
  4. display overall stroke count and compared par for the course

## 4. Club Ranges
| Club | Range |
|------|-------|
| Putter | 1-10 |
| Wedge | 10-50 |
| 7 iron | 20-100 |
| 5 iron | 30-150 |
| 3 wood | 40-250 |
| Driver | 100-300 |

## Notes:
- Putter auto holes within `5` FEET not yards `(5.0ft / 3.0ft) = 1.666667yrds`
- Handle overshooting `Math.abs()`
- Show par status (`+X`, `-X`, `Even`)
- Total Course Par -> `72`



