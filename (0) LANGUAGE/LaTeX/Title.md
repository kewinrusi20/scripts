# Default Title
```LaTeX
\title{Tesla}
\author{Mr. Elon}
\date{October 2023}

\begin{document}
	\maketitle % Án automatic format of title, author and date
\end{document}
```

---
# Custom Title
> Create a custom Title with a custom Command
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

---
# Title Page
```latex
\bagin{titlepage}
...
\end{titlepage}
```

## Examples
```latex
\documentclass[12pt]{article}
\usepackage[utf8]{inputenc}

\begin{document}

\begin{titlepage}
    \centering
    \vspace*{1cm}
    
    \Huge
    \textbf{The Title of Your Document}
    
    \vspace{1.5cm}
    
    \Large
    Your Name
    
    \vfill
    
    A thesis presented for the degree of\\
    Doctor of Philosophy
    
    \vspace{0.8cm}
    
    \Large
    Department Name\\
    University Name\\
    \today
    
    \vspace{1cm}
\end{titlepage}

% Document content starts here
\section{Introduction}
Your content goes here.

\end{document}

```


---
## Extra
```latex
\date{/today}
```

---
