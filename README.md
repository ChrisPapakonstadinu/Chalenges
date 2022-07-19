 <h1>Chalenges</h1>
Deep dive in Advent of Code
https://adventofcode.com

The purpose of this project is to sharpen my skills and get more familiar by solving coding problems.
I am currently learnig java ,so this project is accomplished with java.
You may need to hope in the AoC site to get your input files.


<h2><a href="#1">--- Day 1: Sonar Sweep ---</a></h2>


<h2><a href="#2">--- Day 2: Dive! ---</a></h2>


<h2><a href="#3">--- Day 3: Binary Diagnostic ---</a></h2>




<h3><a id="1">Day 1</a></h3>

<h1>--- Sonar Sweep ---</h1>
You're minding your own business on a ship at sea when the overboard alarm goes off! You rush to see if you can help. Apparently, one of the Elves tripped and accidentally sent the sleigh keys flying into the ocean!

Before you know it, you're inside a submarine the Elves keep ready for situations like this. It's covered in Christmas lights (because of course it is), and it even has an experimental antenna that should be able to track the keys if you can boost its signal strength high enough; there's a little meter that indicates the antenna's signal strength by displaying 0-50 stars.

Your instincts tell you that in order to save Christmas, you'll need to get all fifty stars by December 25th.

Collect stars by solving puzzles. Two puzzles will be made available on each day in the Advent calendar; the second puzzle is unlocked when you complete the first. Each puzzle grants one star. Good luck!

As the submarine drops below the surface of the ocean, it automatically performs a sonar sweep of the nearby sea floor. On a small screen, the sonar sweep report (your puzzle input) appears: each line is a measurement of the sea floor depth as the sweep looks further and further away from the submarine.

For example, suppose you had the following report:

<br>199
<br>200
<br>208
<br>210
<br>200
<br>207
<br>240
<br>269
<br>260
<br>263
<br>This report indicates that, scanning outward from the submarine, the sonar sweep found depths of 199, 200, 208, 210, and so on.

The first order of business is to figure out how quickly the depth increases, just so you know what you're dealing with - you never know if the keys will get carried into deeper water by an ocean current or a fish or something.

To do this, count the number of times a depth measurement increases from the previous measurement. (There is no measurement before the first measurement.) In the example above, the changes are as follows:

<br>199 (N/A - no previous measurement)
<br>200 (increased)
<br>208 (increased)
<br>210 (increased)
<br>200 (decreased)
<br>207 (increased)
<br>240 (increased)
<br>269 (increased)
<br>260 (decreased)
<br>263 (increased)
<br>In this example, there are 7 measurements that are larger than the previous measurement.

How many measurements are larger than the previous measurement?




<h3><a id="2">Day 2</a></h3>


<h1>--- Dive! ---</h1>
Now, you need to figure out how to pilot this thing.

It seems like the submarine can take a series of commands like forward 1, down 2, or up 3:

forward X increases the horizontal position by X units.
down X increases the depth by X units.
up X decreases the depth by X units.
Note that since you're on a submarine, down and up affect your depth, and so they have the opposite result of what you might expect.

The submarine seems to already have a planned course (your puzzle input). You should probably figure out where it's going. For example:

<br>forward 5
<br>down 5
<br>forward 8
<br>up 3
<br>down 8
<br>forward 2
<br>Your horizontal position and depth both start at 0. The steps above would then modify them as follows:

<br>forward 5 adds 5 to your horizontal position, a total of 5.
<br>down 5 adds 5 to your depth, resulting in a value of 5.
<br>forward 8 adds 8 to your horizontal position, a total of 13.
<br>up 3 decreases your depth by 3, resulting in a value of 2.
<br>down 8 adds 8 to your depth, resulting in a value of 10.
<br>forward 2 adds 2 to your horizontal position, a total of 15.
<br>After following these instructions, you would have a horizontal position of 15 and a depth of 10. (Multiplying these together produces 150.)

Calculate the horizontal position and depth you would have after following the planned course. What do you get if you multiply your final horizontal position by your final depth?



<h3><a id="3">Day 3</a></h3>

<h1>--- Binary Diagnostic ---</h1>
The submarine has been making some odd creaking noises, so you ask it to produce a diagnostic report just in case.

The diagnostic report (your puzzle input) consists of a list of binary numbers which, when decoded properly, can tell you many useful things about the conditions of the submarine. The first parameter to check is the power consumption.

You need to use the binary numbers in the diagnostic report to generate two new binary numbers (called the gamma rate and the epsilon rate). The power consumption can then be found by multiplying the gamma rate by the epsilon rate.

Each bit in the gamma rate can be determined by finding the most common bit in the corresponding position of all numbers in the diagnostic report. For example, given the following diagnostic report:

<br>00100
<br>11110
<br>10110
<br>10111
<br>10101
<br>01111
<br>00111
<br>11100
<br>10000
<br>11001
<br>00010
<br>01010
<br>Considering only the first bit of each number, there are five 0 bits and seven 1 bits. Since the most common bit is 1, the first bit of the gamma rate is 1.

The most common second bit of the numbers in the diagnostic report is 0, so the second bit of the gamma rate is 0.

The most common value of the third, fourth, and fifth bits are 1, 1, and 0, respectively, and so the final three bits of the gamma rate are 110.

So, the gamma rate is the binary number 10110, or 22 in decimal.

The epsilon rate is calculated in a similar way; rather than use the most common bit, the least common bit from each position is used. So, the epsilon rate is 01001, or 9 in decimal. Multiplying the gamma rate (22) by the epsilon rate (9) produces the power consumption, 198.

Use the binary numbers in your diagnostic report to calculate the gamma rate and epsilon rate, then multiply them together. What is the power consumption of the submarine? (Be sure to represent your answer in decimal, not binary.)

