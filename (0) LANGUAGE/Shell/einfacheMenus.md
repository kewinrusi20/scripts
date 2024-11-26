```bash
select <fileName> in *
do
    echo you picked $<fileName> \ ($REPLY\)
    break
done
```