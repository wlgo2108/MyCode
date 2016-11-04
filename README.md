# MyCode
echo "# MyStu" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/wlgo2108/MyStu.git
git push -u origin master



#已经存在的文件
git remote add origin https://github.com/wlgo2108/MyStu.git
git push -u origin master

#更新代码:
git add .
git commit -m "update test"
git push -u origin master 

#github 常用命令
git push origin master //把本地源码库push到github上
git pull origin master //从github上pull到本地源码库
git config --list //查看配置信息
git status //查看项目状态信息
git branch //查看项目分支
git checkout -b host//添加一个名为host的分支
git checkout master //切换到主干
git merge host //合并分支host到主干
git branch -d host //删除分支host
