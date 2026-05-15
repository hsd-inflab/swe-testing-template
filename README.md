## Setup

For the this template you need to install

1) **Java 21** 
2) **VsCode** 
3) **Maven**

on your computer.

<details>
<summary>WINDOWS</summary>

- First, install Chocolatey for easier package and Software installation:
  - open powershell as administrator (right-click: open as administrator) and run:
      ```powershell
      Set-ExecutionPolicy Bypass -Scope Process -Force; [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://community.chocolatey.org/install.ps1'))
      ```
  - Once the installation is completed, close the Powershell (Admin) or Terminal (Admin) and open it again and run the following commands:        

- Temurin 21
  - via Chocolatey (recommended):
      ```powershell
      choco install Temurin21
      ```
    
- Visual Studio Code
  - via chocolatey (recommended):  
    ```powershell
    choco install vscode
    ```
  
- [VSCode Java extension pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

- Maven
  - via chocolatey (recommended):  
     ```powershell
     choco install maven
     ```
  - or via installer (slower):
    (https://maven.apache.org/install.html)

- If you used chocolatey for installation, you can use the command
  ```powershell
  choco list
   ```
- if all installations worked, the output should look like this:
   ```powershell
  maven 3.9.9
  Temurin21 21.0.0
  vscode 1.95.2
  vscode.install 1.95.2
   ```
   
</details>

<details>
<summary>MACOS</summary>

- Homebrew (If wanted)
  - If wanted you can use homebrew to complete the following installation steps. [Homebrew](https://brew.sh) is a unofficial package manager for macOS, which should help you with installing new software on your system. To get started with homebrew just paste the following command inside your terminal window:
    ```
    /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
    ```

- Java 21
  - via brew:
    ```
    brew install --cask temurin
    ```
- Visual Studio Code
  - Either via installer: [Visual Studio Code Installer](https://code.visualstudio.com/)
    1. Download the vscode App [from the official website.](https://code.visualstudio.com/)
    ![VSCode Download macOS](../images/macos_vscode_install_1.png)

    2. Install the app on your system. Simply drag and drop the downloaded `*.app` file into your Applications folder.
    ![VSCode Install macOS](../images/macos_vscode_install_2.png)
  - Or via brew:  
    ```
    brew install --cask visual-studio-code
    ```
- [VSCode Java extension pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

- Maven
  - Either manually using these setup instructions: [Maven - Installing](https://maven.apache.org/install.html)
  - Or via brew:
    ```
    brew install maven
    ```
</details>


<details>
<summary>UBUNTU</summary>

- Java Open JDK 21
  ```bash
  sudo apt install temurin21
  ```
- Visual Studio Code
  - Either via installer: [Visual Studio Code Installer](https://code.visualstudio.com/)
  - Or via snap:  
    ```bash
    sudo snap install code --classic
    ```
- [VSCode Java extension pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

- [Maven](https://maven.apache.org/install.html) 
  ```bash
  sudo apt install maven
  ```
</details>

<br>

### Setup VsCode (do not skip this step!)

1) Click on the "Extension" Icon in the left panel

2) search for `java extension pack` in the search field click on the first entry (NOTE: check that the distributor is MICROSOFT and no-one else) and click on the `Install` button to installer the extension pack. Wait until all extensions are installed.

You can check if your installations of java and maven were successful by typing

```mvn --version```

into your local terminal.

## Using this repo

1) 