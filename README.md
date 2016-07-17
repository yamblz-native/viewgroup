# viewgroup
Homework for the Avstaim's lecture about ViewGroups

В проекте находится два лейаута с набором контролов для плеера реализованных при помощи FrameLayout'a и LinearLayout'a.

Сделать схожую верстку используя RelativeLayout, TableLayout, ConstraintLayout, FlexLayout.

Измерить производительность получившихся лейаутов используя HierarchyViewer.

Layout        | measure | layout | draw
------------- | ------- | ------ | -----
frame         |  0,014  |  0,092 | 0,901
linear        |  0,024  |  0,017 | 1,442
relative      |  0,028  |  0,006 | 1,076
table         |  0,046  |  0,016 | 9,541
constraint    |  0,227  |  0,008 | 6,630
flexybox      |  0,054  |  0,015 | 1,272