FILESEXTRAPATHS_prepend := "${THISDIR}:"

# Update SRCREV
SRCREV = "009fbc44b97affd5de13a0494f0302cabfc1551d"

# Add Gstreamer RTSP to dependencies
DEPENDS += " gst-rtsp"
RDEPENDS_${PN} += " \
		gst-plugins-good-rtsp \
		gst-rtsp \
"

