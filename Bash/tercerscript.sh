#!/bin/bash
numA=15
numB=5

echo "Operadores entre $numA y $numB"
echo "$numA + $numB = "$((numA + numB))
echo "$numA - $numB = "$((numA - numB))
echo "$numA * $numB = "$((numA * numB))
echo "$numA / $numB = "$((numA/numB))
echo "========================================="
echo "$numA > $numB = " $((numA > numB))
echo "$numA < $numB = " $((numA < numB)) 
echo "$numA >= $numB = " $((numA >= numB)) 
echo "$numA <= $numB = " $((numA <= numB)) 
echo "$numA == $numB = " $((numA == numB)) 
echo "$numA != $numB = " $((numA != numB))  
echo "========================================="
echo "$numA += $numB = " $((numA += numB)) 
echo "$numA -= $numB = " $((numA -= numB)) 
echo "$numA *= $numB = " $((numA *= numB)) 
echo "$numA /= $numB = " $((numA /= numB)) 
