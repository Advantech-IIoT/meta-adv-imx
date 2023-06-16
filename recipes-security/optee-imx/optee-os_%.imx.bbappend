FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append:imx8mq-ecu150a1 = " file://0001-imx-imx8mq-add-support-more-than-3GB.patch"
EXTRA_OEMAKE:append:imx8mq-ecu150a1 = " \
    CFG_DDR_SIZE=${TEE_CFG_DDR_SIZE} \
    CFG_TZDRAM_START=${TEE_LOAD_ADDR} \
"

SRC_URI:append:imx8mq-ecu150fl = " file://0001-imx-imx8mq-add-support-more-than-3GB.patch"
EXTRA_OEMAKE:append:imx8mq-ecu150fl = " \
    CFG_DDR_SIZE=${TEE_CFG_DDR_SIZE} \
    CFG_TZDRAM_START=${TEE_LOAD_ADDR} \
"
