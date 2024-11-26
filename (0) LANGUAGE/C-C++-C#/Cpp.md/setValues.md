## v1 member name
```cpp
World::World(int enter_age)
: saved_age(enter_age) {}
```


## v2
```cpp
World::World(int enter_age) {
    saved_age = enter_age;
}
```

# v3 setter
```cpp
World::World(int enter_age) {}
void World:setAge(enter_age) {
    saved_age = enter_age;
}
```
