FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

UBOOT_SRC = "git://github.com/Advantech-IIoT/adv-uboot-imx.git;protocol=https"
SRCBRANCH = "adv-lf-5.15.71-2.2.0"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "${AUTOREV}"

