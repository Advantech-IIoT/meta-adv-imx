FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
	file://modules-blacklist.conf \
"
do_install:append() {
	install -m 0755 -d ${D}${sysconfdir}/modprobe.d
	install -m 0644 ${WORKDIR}/modules-blacklist.conf ${D}${sysconfdir}/modprobe.d
}

