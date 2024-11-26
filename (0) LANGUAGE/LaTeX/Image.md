## Tags
```LaTeX
\includegraphics[]{}
\label{}...
\caption{\label{}...}
```

## Example 1
```LaTeX
\begin{figure}
\centering
\includegraphics[width=0.25\linewidth]{frog.jpg}
\caption{\label{fig:frog}This frog was uploaded via the file-tree menu.}
\end{figure}
```

![[Pasted image 20231020093748.png]]

## Example 2 with Float
```latex
\documentclass{article}
\usepackage{float} % Include the float package
\usepackage{graphicx} % Needed to include images

\begin{document}

Here is some text that comes before the figure.

\begin{figure}[H] % The figure will be placed right here
\centering
\includegraphics[width=0.5\textwidth]{example-image}
\caption{An example image.}
\label{fig:example}
\end{figure}

This text will appear right after the figure, with no text flowing around the figure.

\end{document}
```
