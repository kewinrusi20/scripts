## Commands
```latex
\hline % create a vertical line
\\ goes to a new line


% c: center
% r: right
% l: left
```


# Example v1
```latex
\begin{tabular}{|c|c|c|}
\hline
Header 1 & Header 2 & Header 3 \\
\hline
Cell 1 & Cell 2 & Cell 3 \\
\hline
\end{tabular}
```

# Example v2
```LaTeX
\begin{table}
\centering
\begin{tabular}{l|r}
Item & Quantity \\
\hline
Widgets & 42 \\
Gadgets & 13
\end{tabular}
\caption{\label{tab:widgets}An example table.}
\end{table}
```