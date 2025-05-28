# 🍜 VendingMachine‑Java
*A ramen‑themed vending‑machine simulator built with Java (GUI, MVC)*  
A simple Java program that lets you build and play with your own ramen‑dispensing vending machine. It uses a GUI and follows the Model‑View‑Controller (MVC) pattern for clean code separation.

**Developers**  
- Shanette Presas  
- Reina Althea Garcia  

---

## 🎮 What You Can Do

### 👩‍🍳 User Mode
| Mode | What happens |
|------|--------------|
| **Regular Machine** | Choose **one** ready‑made ramen, pay, and enjoy. |
| **Special Machine** | Assemble a custom recipe by adding ingredients, then buy it. |

- 💰 **Denomination Payment**  
  - Drop coins and bills; the machine checks if the total is enough.  
  - Not enough? Money is returned and the order is cancelled.

- 📦 **Stock Check**  
  - Machines can only sell if they still have ramen (or ingredients) in stock.

---

### 🧑‍🔧 Owner / Maintenance Mode
- **Add Coins & Bills** (for change)  
- **Set or Update Prices**  
- **Stock & Restock Products / Ingredients**  
- **Display Sales & Inventory Summary**  
- **Collect Earnings** (money taken from completed orders)

Everything is done through easy GUI dialogs so you can manage the machine without digging into code.

---

## 🛠 How to Build & Run

```bash
# Compile
javac MainDriver.java

# Run
java MainDriver
```         
