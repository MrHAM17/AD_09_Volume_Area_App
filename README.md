## AD_09_Volume_Area_App

### 📱 Short Description

A calculator application using a **GridView** to select different geometric shapes and navigate to separate activities to calculate their **volume**.

---

### 🧩 Concepts Covered

* **GridView** (UI widget for displaying items in a two-dimensional grid)
* **Custom Adapters** (extending `ArrayAdapter<Shape>`)
* **Model Class** (`Shape`) (containing image resource and name)
* Setting the **Number of Columns** programmatically or in XML
* **Intent** usage for navigation based on item click position

---

### 🎯 Learning / Discovery Points

* Designing the custom grid item layout (Image View and Text View).
* Implementing the **`ArrayAdapter`** to bind the `Shape` model objects to the custom grid items.
* Using **`setNumColumns()`** to define how items are organized in the grid.
* Handling **`onItemClickListener`** on the GridView to launch a specific calculation activity based on which shape was clicked.

---

### ⚙️ App Features / Usage

* Displays geometric shapes (e.g., sphere, cylinder) in a grid format.
* Clicking a shape opens a corresponding activity (e.g., `SphereActivity`) to input dimensions and calculate the volume.

---

### 📝 Note

The project demonstrates building a UI using **GridView** and reinforces the need for **Custom Adapters** and **Model Classes** when dealing with complex data items in grid or list views.

---

### Screenshots
<table style="width:100%;"> 
  <tr> 
    <td align="center" style="width:50%;"> 
      <strong>Main Screen
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_08_Planet_App/blob/main/Result%20Pics/1%20Main%20Screen.jpg" height="510" width="240"> 
  </td> 
    <td align="center" style="width:50%;"> 
      <strong>GridView Screen - Shapes
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_08_Planet_App/blob/main/Result%20Pics/2.1%20ListView-ArrayAdapter.jpg" height="510" width="240"> 
  </td> 
    <td align="center" style="width:50%;"> 
      <strong>Shape Sphere - input
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_08_Planet_App/blob/main/Result%20Pics/2.1%20ListView-ArrayAdapter.jpg" height="510" width="240"> 
  </td> 
    <td align="center" style="width:50%;"> 
      <strong>Shape Sphere - output
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_08_Planet_App/blob/main/Result%20Pics/2.1%20ListView-ArrayAdapter.jpg" height="510" width="240"> </td> </tr> </table>

<table style="width:100%;"> 
  <tr> 
    <td align="center" style="width:50%;"> 
      <strong>Shape Cylinder - input
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_09_Volume_Area_App/blob/main/Result%20Pics/05%20-%20Shape%20Cylinder%20%40%20input.jpg" height="510" width="240"> 
  </td> 
    <td align="center" style="width:50%;"> 
      <strong>Shape Cylinder - output
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_09_Volume_Area_App/blob/main/Result%20Pics/06%20-%20Shape%20Cylinder%20%40%20output.jpg" height="510" width="240"> 
  </td> 
    <td align="center" style="width:50%;"> 
      <strong>Shape Cube - input
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_09_Volume_Area_App/blob/main/Result%20Pics/07%20-%20Shape%20Cube%20%40%20input.jpg" height="510" width="240"> 
  </td> 
    <td align="center" style="width:50%;"> 
      <strong>Shape Cube - output
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_09_Volume_Area_App/blob/main/Result%20Pics/08%20-%20Shape%20Cube%20%40%20output.jpg" height="510" width="240"> </td> </tr> </table>

<table style="width:100%;"> 
  <tr> 
    <td align="center" style="width:50%;"> 
      <strong>Shape Prism - input
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_09_Volume_Area_App/blob/main/Result%20Pics/09%20-%20Shape%20Prism%20%40%20input.jpg" height="510" width="240">
  </td> 
    <td align="center" style="width:50%;"> 
      <strong>Shape Prism - output
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_09_Volume_Area_App/blob/main/Result%20Pics/10%20-%20Shape%20Prism%20%40%20output.jpg" height="510" width="240"> </td> </tr> </table>


---
