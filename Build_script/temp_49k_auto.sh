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
#---Must env or not

#CHANGESET_LIST=changeset_list.txt
#OUTPUT_FILE="update_list.html"
#OUTPUT_FILE2="update_list2.html"
#BUILD_DIR=~/build_tool
#WORK_DIR=${BUILD_DIR}/work
#COMMAND_BATCH=${BUILD_DIR}/make_pscm_log.bat
#>> $COMMAND_BATCH

# customize path
WORKSPACE=~/Workspace
PROJECT=$WORKSPACE/P12478_EF49K_ICS_Dev
APQ=$PROJECT/APQ8064
LOG_DIR=~/log
LOG_FILE=$LOG_DIR/49k_result.txt
PDL_PATH=$APQ

cd ~
# Optional, delete pdl & log
rm -f  $PDL_PATH/*.pdl
rm -f $LOG_FILE

mkdir $LOG_DIR

echo "#############################################" >> $LOG_FILE
echo "auto build script start" >> $LOG_FILE
date >> $LOG_FILE
echo "---------------------------------------------" >> $LOG_FILE
cd ~

cd $PROJECT

echo "Update workspace start" >> $LOG_FILE
date >> $LOG_FILE
echo "---------------------------------------------" >> $LOG_FILE

# customize pscm command or option
cm update . --override >> $LOG_FILE

echo "---------------------------------------------" >> $LOG_FILE
echo "Update workspace end" >> $LOG_FILE
date >> $LOG_FILE

echo "---------------------------------------------" >> $LOG_FILE
cd $APQ

echo "---------------------------------------------" >> $LOG_FILE
echo "update api start" >> $LOG_FILE
date >> $LOG_FILE
echo "---------------------------------------------" >> $LOG_FILE

# customize build option
./BUILD.sh u >> $LOG_FILE

echo "---------------------------------------------" >> $LOG_FILE
echo "update api end" >> $LOG_FILE
date >> $LOG_FILE
echo "---------------------------------------------" >> $LOG_FILE

echo "clean build start" >> $LOG_FILE
date >> $LOG_FILE
echo "---------------------------------------------" >> $LOG_FILE

# customize build option
./BUILD.sh 1b >> $LOG_FILE

echo "---------------------------------------------" >> $LOG_FILE
echo "clean build end" >> $LOG_FILE
date >> $LOG_FILE
echo "---------------------------------------------" >> $LOG_FILE
echo "auto build script end" >> $LOG_FILE
date >> $LOG_FILE
echo "#############################################" >> $LOG_FILE
