# Copyright 2013-2016 (C) Freescale Semiconductor
# Copyright 2017-2021 (C) NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)
#
# SPDX-License-Identifier: MIT
#

SUMMARY = "Linux Kernel provided and supported by NXP"
DESCRIPTION = "Linux Kernel provided and supported by NXP with focus on \
i.MX Family Reference Boards. It includes support for many IPs such as GPU, VPU and IPU."

require recipes-kernel/linux/linux-imx.inc

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

DEPENDS += "lzop-native bc-native"

# Don't include kernels in standard images
RRECOMMENDS:${KERNEL_PACKAGE_NAME}-base = ""

DEFAULT_PREFERENCE = "1"

KERNEL_SRC ?= "git://github.com/Advantech-IIoT/ecu-adv-linux-imx;protocol=https"
SRCBRANCH:imx8mq-ecu150 = "adv-lf-5.15.71-2.2.0"
SRCREV:imx8mq-ecu150 = "${AUTOREV}"

KERNEL_SRC ?= "git://github.com/Advantech-IIoT/ecu-adv-linux-imx;protocol=https"
SRCBRANCH:imx8mq-ecu150a1 = "adv-lf-5.15.71-2.2.0"
SRCREV:imx8mq-ecu150a1 = "${AUTOREV}"

KERNEL_SRC ?= "git://github.com/Advantech-IIoT/ecu-adv-linux-imx;protocol=https"
SRCBRANCH:imx8mq-ecu150fl = "adv-lf-5.15.71-2.2.0"
SRCREV:imx8mq-ecu150fl = "${AUTOREV}"

KERNEL_SRC ?= "git://github.com/Advantech-IIoT/ecu-adv-linux-imx;protocol=https"
SRCBRANCH:imx8mq-ecu150f = "adv-lf-5.15.71-2.2.0"
SRCREV:imx8mq-ecu150f = "${AUTOREV}"

KERNEL_SRC ?= "git://github.com/Advantech-IIoT/ecu-adv-linux-imx;protocol=https"
SRCBRANCH:imx8mq-ecu1370 = "adv-lf-5.15.71-2.2.0"
SRCREV:imx8mq-ecu1370 = "${AUTOREV}"

LINUX_VERSION:imx8mq-ecu150 = "5.15.71-lts"
LINUX_VERSION:imx8mq-ecu150a1 = "5.15.71-lts"
LINUX_VERSION:imx8mq-ecu150fl = "5.15.71-lts"
LINUX_VERSION:imx8mq-ecu150f = "5.15.71-lts"
LINUX_VERSION:imx8mq-ecu1370 = "5.15.71-lts"

SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

KBUILD_DEFCONFIG:mx8-nxp-bsp = "imx_v8_defconfig"
KBUILD_DEFCONFIG:imx8mq-ecu150 = "imx8mq_ECU150_defconfig"
DEFAULT_DTB:imx8mq-ecu150 = "sd"
DEFAULT_DTB_PREFIX:imx8mq-ecu150 = "fsl-imx8mq-ecu150"

KBUILD_DEFCONFIG:imx8mq-ecu150a1 = "imx8mq_ECU150A1_defconfig"
DEFAULT_DTB:imx8mq-ecu150a1 = "sd"
DEFAULT_DTB_PREFIX:imx8mq-ecu150a1 = "fsl-imx8mq-ecu150a1"

KBUILD_DEFCONFIG:imx8mq-ecu150fl = "imx8mq_ECU150FL_defconfig"
DEFAULT_DTB:imx8mq-ecu150fl = "sd"
DEFAULT_DTB_PREFIX:imx8mq-ecu150fl = "fsl-imx8mq-ecu150fl"

KBUILD_DEFCONFIG:imx8mq-ecu150f = "imx8mq_ECU150F_defconfig"
DEFAULT_DTB:imx8mq-ecu150f = "sd"
DEFAULT_DTB_PREFIX:imx8mq-ecu150f = "fsl-imx8mq-ecu150f"

KBUILD_DEFCONFIG:imx8mq-ecu1370 = "imx8mq_ECU1370_defconfig"
DEFAULT_DTB:imx8mq-ecu1370 = "sd"
DEFAULT_DTB_PREFIX:imx8mq-ecu1370 = "fsl-imx8mq-ecu1370"

KERNEL_VERSION_SANITY_SKIP="1"
COMPATIBLE_MACHINE = "(mx6-nxp-bsp|mx8-nxp-bsp|mx9-nxp-bsp)"
