# Maintenance Guide - College-Learning

**Repository**: https://github.com/Bgzs89/College-Learning  
**Local Path**: `D:\TUGAS KULIAH`  
**Owner**: Bgzs89

---

## Quick Reference

### What This Repo Is
Personal Java coursework collection. Contains fundamental Java exercises + OOP projects (Biodata, Kendaraan/Vehicle system).

### Folders to Update
```
D:\TUGAS KULIAH/
├── Course/              ← Add new mini-projects here
├── EclipseBagas/        ← Add new Eclipse IDE projects
└── *.java               ← Add new standalone Java exercises
```

### Update Workflow (Every Week/Month)

1. **New assignment file added locally** → `D:\TUGAS KULIAH\YourFile.java`
2. **Open terminal** → `cd "D:\TUGAS KULIAH"`
3. **Add & commit**:
   ```bash
   git add -A
   git commit -m "Add: [Assignment name/topic]"
   git push origin main
   ```
4. **Update README.md** if new package/project added (describe it in the appropriate section)

---

## Git Commands Cheat Sheet

**Check status**:
```bash
git status
```

**Add all changes**:
```bash
git add -A
```

**Commit with message**:
```bash
git commit -m "Add: NewAssignment.java - Topic description"
```

**Push to GitHub**:
```bash
git push origin main
```

**Pull latest (if updated elsewhere)**:
```bash
git pull origin main
```

---

## File Structure Rules

- **Standalone exercises** → Root folder (e.g., `ComputeAverage.java`)
- **Mini-projects** → `Course/` folder (e.g., `Market.java`, `Cardread.java`)
- **Eclipse projects** → `EclipseBagas/src/[PackageName]/` (e.g., `Biodata/`, `jalanberhenti/`)
- **Compiled files** → Auto-ignored by `.gitignore` (don't commit `.class` files)

---

## README.md Update Checklist

When adding new assignment/project, update `README.md`:

1. **Add to folder structure** section (if new folder)
2. **Add description** in "Deskripsi Program" section
3. **List new concept** in "Konsep yang Dipelajari" if applicable
4. **Commit & push**

---

## Common Issues & Fixes

| Issue | Fix |
|-------|-----|
| `.class` files accidentally committed | Already ignored by `.gitignore` |
| Need to update `.gitignore` | Edit file, commit, push |
| Forgot to commit before new chat | Just commit next time, no history loss |
| File merge conflict | Pull first: `git pull origin main` |

---

## Next Update Reminders

- **New assignment each week?** → Commit + push same day
- **End of semester?** → Add final project to `EclipseBagas/src/`
- **README outdated?** → Update structure & description sections

---

## Contact / Access

- **Repo URL**: https://github.com/Bgzs89/College-Learning
- **Branch**: `main` (only branch)
- **Visibility**: Public
- **Last Updated**: 2026-10-20 (Initial setup)

---

## For Future Me (Next Chat)

Hey! If you're updating this repo next week:
1. Check `D:\TUGAS KULIAH` for new `.java` files
2. `git add -A` → `git commit -m "..."` → `git push origin main`
3. Update README if needed
4. Done.

**Pro tip**: Keep file names descriptive (e.g., `InputOutput_Program.java`, not `Test.java`)
