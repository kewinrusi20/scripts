```python
surf = pygame.Surface((width, height))
```

Variables
```python
surf.get_rect().height
surf.get_rect().width
surf.get_rect().left
surf.get_rect().right
surf.get_rect().topleft
surf.get_rect().center
surf.get_rect().centerx
surf.get_rect().centery
```

![[Clear Code - The ultimate introduction to Pygame [AY9MnQ4x3zk - 1408x792 - 53m08s].png]]

---
## Set Transparency
```python
box = pygame.Surface((box_width, box_height), pygame.SRCALPHA)  
box.fill((255, 255, 255, 100))
```
