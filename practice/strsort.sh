read s
len=${#s}
for((i=0;i<len;i++))
do
arr[i]=${s:$i:1}
done
echo ${arr[@]}
for ((i=0;i<len;i++))
do
for((j=i+1;j<len;j++))
do
if [[ ${arr[i]} > ${arr[j]} ]]
then 
temp=${arr[i]}
arr[i]=${arr[j]}
arr[j]=$temp
fi
done
done
echo ${arr[@]}

