/* 
  elements: 15, 9, 20, 35, 17, 64, 32, 6, 18
  step:1 divide into 2 parts
    :- 15, 9, 20, 35, 17
    :- 64, 32, 6, 18
  step:2 divide each part into 2 parts for each sub part
    :- 15, 19, 20
    :- 35, 17
    :- 64, 32
    :- 6, 18
  step:3 repeat again
    :- 15, 19
    :- 20
    :- 35
    :- 17
    :- 64
    :- 32
    :- 6
    :- 8
  step4: divide first array into 2 parts
    :- 15
    :- 19
    :- 20
    :- 35
    :- 17
    :- 64
    :- 32
    :- 6
    :- 8
*/