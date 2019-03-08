# xpz_test
Repository for learning

Git是Linux之父Linus Torvalds（互联网大佬）编写的一个版本控制软件。目前我们接触的与Git有关系的有三种，分别是Git、GitHub以及GitLab。

Git
就是最原始的分布式版本控制系统，是开源的。

GitHub
与Git不同的是，Git是一个单独的软件，而GitHub是一个网站。众所周知，GitHub是目前最大的版本控制社区网站，用户可以在上面申请账号，并创建自己版本仓库。不过对于免费的仓库，用户必须公开自己仓库中的所有源代码，而付费仓库可以上传私密代码。

GitLab
GitLab是一款单独的软件，在Git的基础上搭建起来的Web服务。它可以创建私有库，解决了GitHub的免费仓库必须公开源码的问题。一般的企业或者工作室开发都会选择使用它，当初GitLab被程序员不小心删库事件可谓是轰动一时，元气大伤。

这里我们先就讲解GitHub社区的使用，Git的安装与配置，以及与GitHub的连接。
1.登录GitHub账号，如果没有账号的先注册一个，这个很简单我就不详细说了。

2.点击New repository

3.新建一个公共仓库

其中Repository name是仓库名称，与后期的仓库地址有关，Description是仓库描述，仓库类型选择公共的。

4.这样就得到了仓库的http和ssh地址

接下来安装本地Git服务
1.下载Git

Windows地址：https://git-scm.com/download/win

2.安装，过程参考Git-2.17版本Windows环境系统下安装教程，基本上都是默认选择就ok。

3.安装完成后的Git目录

4.目录中的git-bash.exe可以让我们使用Linux的命令去操作Git。而git-cmd.exe则是使用Windows命令操作Git。普遍认为Linux指令操作Git比较方便，所以我们双击git-bash.exe，在本地创建ssh key：

$ ssh-keygen -t rsa -C "your_email@youremail.com"

后面的是你注册GitHub时候的邮箱地址。

回车之后后面的一些操作我们继续默认回车就可以。如下：

成功后会在Users文件夹对应的用户下创建.ssh文件夹，其中有一个id_rsa.pub文件，我们复制其中的key:

之后返回github，进入 Account Settings（账户配置），左边选择SSH and GPG Keys选项：

其中的title随便填，下面的粘贴在你复制的key。点击添加之后，则添加成功：

5.验证是否绑定本地成功，在git-bash中验证，输入指令：

$ ssh -T git@github.com

如果第一次执行该指令，则会提示是否continue继续，如果我们输入yes就会看到成功信息：

由于GitHub每次执行commit操作时，都会记录username和email，所以要设置它们： 

此时我们需要将本地仓库上传至GitHub，我们在D盘下创建了一个名为GitRepository的文件夹， 作为本地仓库，然后在其中放置了一个源代码：

然后我们在GitRepository文件夹点击右键，选择git bash here，接着初始化本地仓库：

此时在D:\GitRepository下会到一个隐藏的.git文件夹，该文件夹是Git用来跟踪管理版本库的：

然后将所有文件添加到仓库，并提交文件：

此时我们的本地仓库就建立好了。 然后我们的本地仓库要关联GitHub的仓库，直接将本地仓库关联远程GitHub仓库地址即可：

其中origin后面跟的是我们的仓库地址。

下面要上传本地代码至GitHub，但是前提是远程仓库不能是空的，所以我们在远程仓库中创建一个README.md的文件：

然后执行如下命令提交代码

注意如果没有先执行git pull --rebase origin master进行代码合并，在本地仓库没有README.md文件时会报错：

然后在GitHub上就可以看到我们的代码已经成功提交:

创建新仓库的指令
git init //把这个目录变成Git可以管理的仓库

git add README.md //文件添加到仓库

git add . //不但可以跟单一文件，还可以跟通配符，更可以跟目录。一个点就把当前目录下所有未追踪的文件全部add了 

git commit -m “first commit” //把文件提交到仓库

git remote add origin git@github.com:yourname/youremail.git //关联远程仓库

git pull --rebase origin master //代码合并

git push -u origin master //把本地库的所有内容推送到远程库上

在github上只能删除仓库,却无法删除文件夹或文件, 所以只能通过命令来解决

 
删除仓库中的某个文件夹操作
首先进入你的master文件夹下, Git Bash Here ,打开命令窗口

$ git --help                                      # 帮助命令
$ git pull origin master                    # 将远程仓库里面的项目拉下来
$ dir                                                # 查看有哪些文件夹
$ git rm -r --cached foldername              # 删除target文件夹
$ git commit -m '删除了target'        # 提交,添加操作说明

$ git push -u origin master               # 将本次更改更新到github项目上去
