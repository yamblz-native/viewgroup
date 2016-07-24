# viewgroup
Homework for the Avstaim's lecture about ViewGroups

В проекте находится два лейаута с набором контролов для плеера реализованных при помощи FrameLayout'a и LinearLayout'a.

Сделать схожую верстку используя RelativeLayout, TableLayout, ConstraintLayout, FlexLayout.

Измерить производительность получившихся лейаутов используя HierarchyViewer.

constraint Measure - 0.149ms Layout - 0.007ms Draw 6.706ms
frame      Measure - 0.019ms Layout - 0.012ms Draw 8.786ms
linear     Measure - 0.020ms Layout - 0.011ms Draw 8.239ms
relative   Measure - 0.072ms Layout - 0.010ms Draw 1.095ms
table      Measure - 0.034ms Layout - 0.011ms Draw 1.385ms
flex       Measure - 0.069ms Layout - 0.016ms Draw 1.157ms