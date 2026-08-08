import os
import re

ROOT = "."
RANGES = ["0001-1000", "1001-2000", "2001-3000", "3001-4000", "4001-5000"]

def parse_filename(filename):
    """
    Extract problem number and title from filename like:
    1_two_sum.java
    20_valid_parentheses.java
    """
    match = re.match(r"(\d+)_(.*)\.java", filename)
    if match:
        number = int(match.group(1))
        title = match.group(2).replace("_", " ").title()
        return number, title
    return None, None

def generate_table(folder):
    """Generate markdown table for one folder"""
    path = os.path.join(ROOT, folder)

    if not os.path.exists(path):
        return f"*(No problems added yet in {folder})*"

    rows = [
        "| # | Title | Solution |",
        "|---|-------|----------|"
    ]

    files = sorted(os.listdir(path))

    for file in files:
        if file.endswith(".java"):
            num, title = parse_filename(file)

            if num:
                file_path = f"{folder}/{file}"

                rows.append(
                    f"| {num} | {title} | [Java]({file_path}) |"
                )

    return "\n".join(rows)

def main():
    readme_lines = [
        "# LeetCode Solutions (Number-wise)",
        "",
        "This repository contains my solutions to LeetCode problems, organized **by problem number**.",
        "",
        "---",
        "",
        "## 📂 Quick Navigation"
    ]

    for folder in RANGES:
        readme_lines.append(f"- [{folder}](#{folder})")

    readme_lines.append("")
    readme_lines.append("---")
    readme_lines.append("")

    for folder in RANGES:
        readme_lines.append(f"## {folder}")
        readme_lines.append("")
        readme_lines.append(generate_table(folder))
        readme_lines.append("")
        readme_lines.append("[🔼 Back to Top](#leetcode-solutions-number-wise)")
        readme_lines.append("")
        readme_lines.append("---")
        readme_lines.append("")

    with open("README.md", "w", encoding="utf-8") as f:
        f.write("\n".join(readme_lines))

    print("✅ README.md updated successfully!")

if __name__ == "__main__":
    main()
