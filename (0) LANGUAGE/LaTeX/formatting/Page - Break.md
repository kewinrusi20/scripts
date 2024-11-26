All the page break commands listed below, serve to ends the current page and start a new one, but with some differences one from the other.

## 1. `\newpage`
- Simple Page Break.
- (<span style="color:red">!</span>) Does not handle any pending floats.
- In case of columns, the jump will occur to the next column available.

---
## 2. `\pagebreak`
- Breaks the current Page with an additional argument that indicates the urgency.
- (<span style="color:red">!</span>) Does not handle any pending floats if the argument level is low, and it does not works of every float (e.g.: `multicols`)
- `\pagebreak` is the abbreviation of `\pagebreak[4]`

```latex
\pagebreak[4] or \pagebreak % Force the break
\pagebreak[3]
\pagebreak[2]
\pagebreak[1]
\pagebreak[0] % Weak Break, the command will work only on favorable conditions
			  % e.g.: esthetics, at the end of each subsection, text block
```

## 3. `\nopagebreak`
- Prevents the Breaking of the page.
- Additional arguments can be added to set the intensity.
- (<span style="color:red">!</span>) Not an absolute guarantee, extremely insistent floats or other conditions can override it.
- `\nopagebreak` is the abbreviation of `\nopagebreak[4]`

---
## 4. `\clearpage`
- Breaks the current page and flushes all the pending floats.
- (<span style="color:red">!</span>) By Flushing the pending floats, there may be blanks/empty spaces from the incomplete Floats.

## 5. `\cleardoublepage`
- Similar to `\clearpage` but it ensures, that the next page with the right-hand page (book).
- (<span style="color:red">!</span>) It may create blank left-hand pages.

---
## 6. `\afterpage`
- (<span style="color:red">!</span>) It needs to be imported  with: `/usepackage{afterpage}`.
- The `afterpage` command allows you to specify something that LaTeX will execute after the current page has been completely output. It's a way to defer the execution of some commands until the current page is finished. This can be particularly useful when dealing with complex floating environments or when you want a certain change to occur on the next page, but not disrupt the current page layout.

```latex
% ... some text before the afterpage command ...

\afterpage{\clearpage}

% ... some text after the afterpage command ...
```

- In this example, the `\clearpage` command will be executed after the current page has been completely processed, effectively placing all the floats and then starting a new page.
- The `afterpage` package can be particularly useful in complex documents where the exact placement of figures, tables, or other blocks is critical, and you want to ensure that certain content appears only after the current page.

---
## 7. Float: `H`, `t`, `b`, `p`, `!`
- (<span style="color:red">!</span>) It needs to be imported with: `\usepackage{float}`
- Sure! The `float` package in LaTeX provides an additional placement specifier, `H`, which stands for "Here." It is used to strictly position a float (like a figure or a table) at precisely the location where it appears in the source code.

Example: 
```latex
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

- In this example, the figure will not "float" to another position if LaTeX decides there's not enough room on the current page or for better page layout aesthetics. Instead, it will be placed exactly where the figure environment appears in the LaTeX source code, which is where the `H` specifier is indicated. If there is not enough room on the page for the figure, LaTeX will leave the space at the bottom of the page empty and start a new page immediately after the figure.

- This can be very useful when you need to ensure that a figure appears in a specific location, such as in a precise order or to maintain the coherence of the narrative in the text.

**Pros of using the `H` specifier:**
- The float (figure, table, etc.) is placed exactly where you want it in the text.
- There is no need to worry about LaTeX moving the float to another page or column.

**Cons of using the `H` specifier:**
- It can lead to poor page layout with excessive white space, especially if the float does not fit well in the remaining space on the page.
- The document may require manual adjustment if the content of the pages changes, affecting the float placement.

Other Specifications:
1. `h` - Place the float here, i.e., approximately at the same point it occurs in the source text (however, not exactly at the spot).
2. `t` - Position at the top of the page.
3. `b` - Position at the bottom of the page.
4. `p` - Put on a special page for floats only.
5. `!` - Override the internal parameters LaTeX uses for determining "good" float positions.
