require python3-labgrid.inc

SRC_URI += "git://github.com/rossizero/labgrid.git;protocol=https;branch=${SRCBRANCH}"
SRCBRANCH = "master"
SRCREV = "46b4098acbf06b7ef3fa6f7321092fe1e7f92ac5"

PV = "24.0+git"

RDEPENDS:${PN} += " \
    python3-grpcio \
    python3-grpcio-reflection \
    python3-grpcio-channelz \
"
RDEPENDS:${PN}:remove = "python3-autobahn"

LABGRID_USE_DEVEL_VERSION[doc] = "Global switch to enable labgrid development (git) version"
LABGRID_USE_DEVEL_VERSION ??= "-1"
DEFAULT_PREFERENCE ??= "${LABGRID_USE_DEVEL_VERSION}"
