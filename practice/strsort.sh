s1="dona"
temp=""
for((i=0;i<${#s1};i++))
do
for((j=i+1;j<${#s1};j++))
do
if [[ ${s1:$i:1}>${s1:$j:1}  ]]
then
s1=${s1:0:$i}${s1:$j:1}${s1:$i+1:$j-$i-1}${s1:$i:1}${s1:$j+1}
fi
done
done
echo $s1
