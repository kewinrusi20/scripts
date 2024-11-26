
```latex
% No Package imports

\begin{verbatim}
...
\end{verbatim}
```

---
```latex
\usepackage{listings} % Code

\begin{lstlisting}[language=c]
...
\end{lstlisting}
```

---
Powered with Python
```latex
\usepackage{minted}

\begin{minted}{c}
...
\end{minted}
```
(<span style="color: red">!</span>) Please note that to compile a LaTeX document with `minted`, you have to pass the `-shell-escape` flag to the LaTeX compiler: `pdflatex -shell-escape mydocument.tex`
