```latex
\newcommand
{} % Name of the Command
[] % Number of imputs
{} % Format
   % You Need to use the tag "#<number>" to assign a imput

<newCommand>{<imput1>}{<imput2>}...
```

# Example Custom Title
```latex
\newcommand{\customtitle}[3]{
    \centering
    \Large\textbf{#1}\\[1em] % Title
    \normalsize #2 \\ % Author
    \small #3 % Date
    \vspace{1em}
}

\begin{document}
\customtitle{Tests}{Kewin Rusilowski}{November 2023}
\end{document}
```
