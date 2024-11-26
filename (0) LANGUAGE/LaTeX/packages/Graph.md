Example:
```latex
\documentclass{article}
\usepackage{pgfplots}

\begin{document}

\begin{tikzpicture}
\begin{axis}[
    title={Effort and time consumption vs. Document complexity and size},
    xlabel={Document complexity and size},
    ylabel={Effort and time consumption},
    xmin=0, xmax=10,
    ymin=0, ymax=10,
    xtick={0,2,4,6,8,10}, 
    ytick={0,2,4,6,8,10},
    legend pos=north west,
    ymajorgrids=true,
    grid style=dashed,
]

\addplot[
    color=red,
    domain=0:10,
] {x^2/10};
\addlegendentry{MS Word}

\addplot[
    color=blue,
    domain=0:10,
] {sqrt(x)};
\addlegendentry{LaTeX}

\node[align=center, font=\bfseries, scale=0.9] (impossible) at (axis cs:8,9) {Impossible\\to do};

\end{axis}
\end{tikzpicture}

\end{document}
```

Extra:
```latex
xtick=\empty, % Set empty x ticks
ytick=\empty, % Set empty y ticks
```