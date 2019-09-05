# Fetch our configuration files.
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += " \
    file://rsyslog-jal-plugin.patch \
"

DEPENDS_append = " jalop "
EXTRA_OECONF_append = " --enable-omjal "
