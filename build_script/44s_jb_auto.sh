#+++Must env
export TERM=xterm
export SHELL=/bin/bash
#---Must env

#+++Must env or not. 
export ARMBIN_ARMSD=/pkg/qct/software/arm/RVDS/2.2BLD593/RDI/armsd/1.3.1/66/linux-pentium/armsd
export ARMCONF=/pkg/qct/software/arm/RVDS/2.2BLD593/RDI/armperip/1.3/50:/pkg/qct/software/arm/RVDS/2.2BLD593/RVARMulator/v6ARMulator/1.4.1/261/linux-pentium:/pkg/qct/software/arm/RVDS/2.2BLD593/RVARMulator/ARMulator/1.4.1/253/linux-pentium
export RVCT22BIN=/pkg/qct/software/arm/RVDS/2.2BLD593/RVCT/Programs/2.2/503/linux-pentium
export PATH=/bin:/pkg/qct/software/arm/RVDS/2.2BLD593/bin/linux-pentium:/pkg/qct/software/arm/RVDS/2.2BLD593/RVD/Core/1.8.1/464/linux-pentium/bin:/opt/rational/clearcase/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/pkg/CodeSourcery/Sourcery_G++_Lite/bin:/pkg/bin:/pkg/qct/software/arm/RVDS/2.2BLD593/RVCT/Programs/2.2/503/linux-pentium:/pkg/qct/software/arm/RVDS/2.2BLD593/Utilities/FLEXlm/9.2/release/linux-pentium:.:/opt/rational/clearcase/bin:/opt/rational/clearcase/etc/utils
export HLPPATH=/pkg/qct/software/arm/RVDS/2.2BLD593/Documentation/RVD/1.8.1/release/unix/onlinehelp
export JAVA_HOME=/pkg/jdk/jdk1.6.0_23
export ARMDLL=/pkg/qct/software/arm/RVDS/2.2BLD593/RVARMulator/v6ARMulator/1.4.1/261/linux-pentium:/pkg/qct/software/arm/RVDS/2.2BLD593/RDI/rdimsvr/1.3.1/91/linux-pentium:/pkg/qct/software/arm/RVDS/2.2BLD593/RDI/Targets/Remote_A/1.3.1/98/linux-pentium:/pkg/qct/software/arm/RVDS/2.2BLD593/RVARMulator/ARMulator/1.4.1/253/linux-pentium
export RVDS_TOPDIR=/pkg/qct/software/arm/RVDS/2.2BLD593
export RVDEBUG_WEB_BROWSER=/usr/bin/htmlview
export RVDEBUG_INSTALL=/pkg/qct/software/arm/RVDS/2.2BLD593/RVD/Core/1.8.1/464/linux-pentium
export RVDEBUG_HLPPATH=/pkg/qct/software/arm/RVDS/2.2BLD593/Documentation/RVD/1.8.1/release/unix/onlinehelp
export ARMROOT=/pkg/qct/software/arm/RVDS/2.2BLD593
export RVCT22LIB=/pkg/qct/software/arm/RVDS/2.2BLD593/RVCT/Data/2.2/503/lib
export HHHOME=/pkg/qct/software/arm/RVDS/2.2BLD593/Documentation/HyperHelp/5.2.0/release/linux-pentium/
export RVCT22INC=/pkg/qct/software/arm/RVDS/2.2BLD593/RVCT/Data/2.2/503/include/unix
export CMD_V_BD_VER=WS20
#---Must env or not

# customize below 

cd ~
# Optional, customize pdl path
#rm -f  ~/workspace/P12478_EF44S_ICS_Dev/MSM8960ICS_WTR/TOOLS/PDL/*.pdl
mkdir ~/log
rm -f ~/log/44s_result.txt
mkdir ~/pdl
mkdir ~/pdl/44S_EF
mv -f ~/workspace/EF44S_JB/MSM8960_WTR_LA15_JB/TOOLS/PDL/*.pdl ~/pdl/44S_EF/

echo "#############################################" >> ~/log/44s_result.txt
echo "auto build script start" >> ~/log/44s_result.txt
date >> ~/log/44s_result.txt
echo "---------------------------------------------" >> ~/log/44s_result.txt
cd ~
#customize workspace path
cd workspace
cd EF44S_JB
echo "Update workspace start" >> ~/log/44s_result.txt
date >> ~/log/44s_result.txt
echo "---------------------------------------------" >> ~/log/44s_result.txt
# customize pscm command or option
cm update . --override >> ~/log/44s_result.txt
echo "---------------------------------------------" >> ~/log/44s_result.txt
echo "Update workspace end" >> ~/log/44s_result.txt
date >> ~/log/44s_result.txt
echo "---------------------------------------------" >> ~/log/44s_result.txt
# customize workspace build shell path
cd MSM8960_WTR_LA15_JB
echo "clean build start" >> ~/log/44s_result.txt
date >> ~/log/44s_result.txt
echo "---------------------------------------------" >> ~/log/44s_result.txt
# customize build option
./EF44S_EXE.sh 81 >> ~/log/44s_result.txt

mv -f ~/workspace/EF44S_JB/MSM8960_WTR_LA15_JB/TOOLS/PDL/*.pdl ~/pdl/44S_EF/

echo "---------------------------------------------" >> ~/log/44s_result.txt
echo "clean build end" >> ~/log/44s_result.txt
date >> ~/log/44s_result.txt
echo "---------------------------------------------" >> ~/log/44s_result.txt
echo "auto build script end" >> ~/log/44s_result.txt
date >> ~/log/44s_result.txt
echo "#############################################" >> ~/log/44s_result.txt
