FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append:imx8mq-ecu150 = " file://localextra.rules"
do_install:append:imx8mq-ecu150 () {
        install -d ${D}${sysconfdir}/udev/rules.d
        install -m 0644 ${WORKDIR}/localextra.rules ${D}${sysconfdir}/udev/rules.d/
}

SRC_URI:append:imx8mq-ecu150a1 = " file://localextra.rules"
do_install:append:imx8mq-ecu150a1 () {
        install -d ${D}${sysconfdir}/udev/rules.d
        install -m 0644 ${WORKDIR}/localextra.rules ${D}${sysconfdir}/udev/rules.d/
}

SRC_URI:append:imx8mq-ecu150fl = " file://localextra.rules"
do_install:append:imx8mq-ecu150fl () {
        install -d ${D}${sysconfdir}/udev/rules.d
        install -m 0644 ${WORKDIR}/localextra.rules ${D}${sysconfdir}/udev/rules.d/
}

