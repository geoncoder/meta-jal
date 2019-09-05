DESCRIPTION = "This is a reference implementation of the Journal, Audit, and Logging Protocol (JALoP)."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=4dffff28386962f18ebac0e07f339aa0"
FILESEXTRAPATHS_prepend := "${THISDIR}/file:"

SRCREV = "a474b464d4916fe559cf1df97c855232e5ec24ab"
SRC_URI = " \
    git://github.com/jalop-tresys/JALoP.git;protocol=git \
    file://fix-platform-flag.patch \
    file://fix-linking-issues.patch \
    file://remove-doxygen.patch \
"

DEPENDS = "libtool libvortex libconfig lcov libxml2 xmlsec1"
DEPENDS += "test-dept db util-linux glibc glibc"

RDEPENDS_${PN} = "util-linux"

S = "${WORKDIR}/git"

inherit scons

TARGET_LDFLAGS = " -lstdc++ -lpthread "

LD = "${CCLD}"

do_install() {
    export DESTDIR="${D}"
    export JALOP_SCHEMAS_ROOT="/usr/share/schemas"
    scons install --prefix=/usr --libdir=/usr/lib
}

FILES_${PN}-dev = "${includedir}/jalop/*.h"
FILES_${PN} += "${libdir}/*.so"
FILES_${PN} += "${datadir}/jalop-v1.0/schemas/*.xsd"
FILES_${PN} += "${datadir}/jalop-v1.0/schemas/*.dtd"
