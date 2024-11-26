Package: `\usepackage{hyperref}`

### Alterations:
```latex
% Better Version
\usepackage[colorlinks=true, allcolors=blue]{hyperref}
```
- `colorlinks=true`: This option colors the text of the links instead of putting a colored box around them]
- `allcolors=blue`: This option sets the color of all links in the document to blue]

---
## Keywords
### URLs
```LaTeX
\href{}{} % link + name replacment for the link
\url{} % display the pure unedited link
```

### Within the Doc
```latex
\ref{} % jump to a portion of the documentation
% Used in combination with:
	\label{}

\pageref{} % jump to a page of the documentation
% Used in combination with:
	\label{}
```

### References
```latex
\cite{} & source of the text
% Used in combination with:
	\bibliography{sample} % Name of the file (sample.bib)
	\bibliographystyle{alpha} % style of the displayed Source
	List of Styles: plain, abbrv, alpha, apalike, ieeetr, siam, unsrt, amsalpha, amsplain, gerabbrv, geralpha, gerapali, gerplain, gerunsrt, addrconv, birthday, email, acm, abbrvnat, plainnat, unsrtnat, jphysicsB, agsm, apsr, dcu, jmr, nederlands, kluwer, prsty, achicago, osa, 
```

---
# Example
```LaTeX
\label{fig:frog} % Assign Label(Tag)
\ref{fig:frog} % Redirect back to the Label
```

```LaTeX
From the Famouse Novel \cite{mobidic}, ...

\bibliography{mobidic} & tipycal paster at the very end (before the last /end{})

% (inside a .bib file)
@article{mobidic,
	author = "...",
	...
}
```
