```python
surface = pygame.display.set_mode((width, height))

pygame.draw.cirle(surface, color, center, circle_radius)
```

---
## Example

```python
surface = pygame.display.set_mode((width, height))
color = (255, 0, 0)

box_x = 100
box_y = 100
box_width = 200
box_height = 100
rect = pygame.Rect(box_x, box_y, box_width, box_height)

corner_radius = 20

draw_rounded_rect(surface, color, rect, corner_radius)
```

```python
def draw_rounded_rect(surface, color, rect, radius):
    pygame.draw.rect(surface, color, rect)
    width, height = rect.size
    radius = min(radius, width // 2, height // 2)

    if radius <= 0:
        return

    corner_radius = radius
    circle_radius = radius

    # Create four circles at each corner
    circles = [
        (rect.left + corner_radius, rect.top + corner_radius),
        (rect.right - corner_radius, rect.top + corner_radius),
        (rect.left + corner_radius, rect.bottom - corner_radius),
        (rect.right - corner_radius, rect.bottom - corner_radius),
    ]

    for center in circles:
        pygame.draw.circle(surface, color, center, circle_radius)

    # Draw lines to connect the circles and create the rounded corners
    pygame.draw.rect(surface, color, (rect.left, rect.top + corner_radius, width, height - 2 * corner_radius))
    pygame.draw.rect(surface, color, (rect.left + corner_radius, rect.top, width - 2 * corner_radius, height))
```
