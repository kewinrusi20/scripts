Inhaltsverzeichnis: `\tableofcontents`

- `\tableofcontents` ist der Befehl, der das Inhaltsverzeichnis an der Stelle einfügt, an der er im Dokument steht. Normalerweise wird er direkt nach dem Titelblatt oder der Zusammenfassung platziert.
- `\newpage` wird verwendet, um eine neue Seite zu beginnen, sodass das Inhaltsverzeichnis auf einer eigenen Seite steht.
- `\section{}`, `\subsection{}`, und `\subsubsection{}` Befehle strukturieren Ihr Dokument und werden automatisch im Inhaltsverzeichnis aufgeführt.

---
# More
Für ein umfangreicheres Dokument, wie eine Diplomarbeit oder Dissertation, möchten Sie vielleicht das Paket `tocbibind` verwenden, um das Inhaltsverzeichnis zu erweitern und Einträge wie das Literaturverzeichnis, den Index und andere spezielle Abschnitte einzuschließen:

latexCopy code

`\usepackage[nottoc,numbib]{tocbibind}`

Die Option `nottoc` entfernt das Inhaltsverzeichnis aus dem Inhaltsverzeichnis selbst, was normalerweise bevorzugt wird, und `numbib` nummeriert das Literaturverzeichnis im Inhaltsverzeichnis.

Für noch spezifischere Anpassungen des Inhaltsverzeichnisses können Sie das Paket `tocloft` verwenden, das Ihnen eine feine Kontrolle über das Aussehen des Inhaltsverzeichnisses gibt.