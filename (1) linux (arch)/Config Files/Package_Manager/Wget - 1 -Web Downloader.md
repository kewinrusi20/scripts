>  **wget:** Simpler and focused specifically on downloading files and efficiently mirroring websites.


# Installation
- Windows: `choco install wget -y` or `choco install wget -y`
- Linux: 

+ Version Check: `wget --version`

Download **File**:
```bash
cd Desktop
wget https://kew.im/document.pdf
```

Download **Webpage**:
```bash
wget https://kew.im/cv
```
- It will download the webpage in the format of `.html`

Download the *entire* **Website**:
```bash
wget --mirror --page-requisites --convert-link --no-blobber --no-parent https://kew.im
```
- `--mirror`: copy the entire website
	- It is equivalent to `-r -N -l inf --no-remove-listing`. It turns on options suitable for mirroring.
	- `-r`: Recursive download.
	- `-N`: Timestamping.
	- `-l inf`: Infinite recursion depth.
	- `--no-remove-listing`: Keeps `.listing` files.
- `--page-requisites`: Downloads all the files necessary to display the pages properly
	- (e.g., images, CSS, JS).
- `--convert-link`: convert link that redirect into the downloaded files, instead of redirecting you to the online web pages
- `--no-clober`: do not duplicate anything
- `--no-parent`: do not redirect to other domains
- `--adjust-extension`: Adds suitable extensions to files based on their content-type
	- (e.g., `.html`)
- `--wait=5`: to avoid overloading the website’s server
- `--limit-rate=100k`: Limit the download bandwidth to 100k
- `--no-check-certificate`: If you encounter SSL certificate issues, but use this with caution as it makes the connection insecure.
- `--domains`: To avoid downloading specific external links
	- (e.g: `wget --mirror --domains example.com --no-parent https://www.example.com`)
- `--reject`: Exclude different files
	- (e.g.:`wget --mirror --reject jpg,jpeg,png,gif https://www.example.com`)
- `-P`: To specify the directory where files will be saved.
- `--user-agent`: Some websites may block Wget’s default user-agent. You can set a different one
	- (e.g.: `wget --mirror --user-agent="Mozilla/5.0 (Windows NT 10.0; Win64; x64)" https://www.example.com`)
