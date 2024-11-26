Package: `\usepackage{multicols}`
Example:
```latex
\begin{multicol}{2} % Segment the text in 2 columns
...
\end{multicol}
```

---
# Paracol
Package: `\usepackage{paracaol}`
Commands:
- `\begin{paracaol}{n}`, n: number of column
- `\end{paracol}`
- `\switchcolumn`

Example:
```latex
\begin{paracol}{3} % 3 Columns
col. 1

\switchcolumn
col. 2

\switchcolumn
col. 3
\end{paracol}
```

Tip:
- is used `\swtichcolumn` one more time to the number of the columns, it will switch to the first column.

---
# Tabulator
![[(0) LANGUAGE/LaTeX/Table|Table]]