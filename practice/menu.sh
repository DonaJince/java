read a
read b
select i in add sub mul div
do
case $i in
"add" ) echo $((a+b));;
"sub" ) echo $((a-b));;
"mul" ) echo $((a*b));;
"div" ) echo $((a/b));;
*) echo 'poda thendi'
esac
done
