Terminal:
```bash
./.config/polybar/launcher.sh # Start the Status Bar
killall -q polybar # Close the Status Bar
```

---
Windows Manager `i3/config`:
```bash
exec_always --no-startup-id $HOME/.config/polybar/launch.sh
```

---
Polybar launch.sh file:
```
polybar-msg cmd quit

echo "---" | tee -a /tmp/polybar1.log /tmp/polybar2.log
polybar bar 2>&1 | tee -a /tmp/polybar1.log & disown

echo "Bars launched..."
```

```bash
# Give the Status Bar rights
sudo chmod +x .config/polybar/launch.sh
```