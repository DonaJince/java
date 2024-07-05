read limit
a=0
b=1
for((i=0;i<limit;++i))
do
echo $a
((c=a+b))
((a=b))
((b=c))
done
