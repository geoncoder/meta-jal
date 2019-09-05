DESCRIPTION = "OpenSource professional BEEP stack written in C"
LICENSE = "GPLv2 & LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=ea3aa696158cb6dc25e0897c9f85f837"
FILESEXTRAPATHS_prepend := "${THISDIR}/file:"

SRCREV = "69f7dff8f980cb3165e0e1d25da35c0c4e6af8fa"
SRC_URI = " \
    git://github.com/asples/libvortex-1.1.git;protocol=git \
    file://fix-python-macro.patch \
"

DEPENDS = "autoconf pkgconfig libaxl"

S = "${WORKDIR}/git"

inherit autotools pkgconfig

CFLAGS += "-fPIC -pthread"
