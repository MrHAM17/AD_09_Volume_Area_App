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
