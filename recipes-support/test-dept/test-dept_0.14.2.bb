DESCRIPTION = "Test Dept is an ease-of-use framework for unit testing."
LICENSE = "GPLv2 & LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = " \
    https://storage.googleapis.com/google-code-archive-downloads/v2/code.google.com/test-dept/${PN}-${PV}.tar.gz \
"

SRC_URI[md5sum] = "7fc58aa15ec6a7759f751624f38dadba"
SRC_URI[sha256sum] = "fa749bac0423ef1187e6303ec15903820a1a4738d52b5413729216058f48abad"

DEPENDS = "autoconf pkgconfig"

inherit autotools pkgconfig
