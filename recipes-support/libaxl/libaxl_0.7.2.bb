DESCRIPTION = "LibAxl (or just Axl) is an implementation of the XML 1.0 standard specification."
LICENSE = "GPLv2 & LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=f0504124678c1b3158146e0630229298"
FILESEXTRAPATHS_prepend := "${THISDIR}/file:"

SRCREV = "904521ff31807d90cc5552b71d292291cdb9d332"
SRC_URI = " \
    git://github.com/asples/libaxl.git;protocol=git \
    file://fix-python-macro.patch \
"

DEPENDS = "autoconf pkgconfig libtool"

S = "${WORKDIR}/git"

inherit autotools pkgconfig

EXTRA_OECONF += "--host x86_64 --enable-maintainer-mode"

CFLAGS += "-fPIC"
