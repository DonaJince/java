read h
for((i=0;i<h;++i))
do
for((j=0;j<2*h-1;++j))
do
if((i+j>=h-1 && i-j>=1-h))
then
echo -n "* "
else
echo -n "  "
fi
done
echo ""
done
