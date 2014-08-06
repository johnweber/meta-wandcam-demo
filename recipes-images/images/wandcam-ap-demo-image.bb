include recipes-core/images/core-image-base.bb

SOC_EXTRA_IMAGE_FEATURES ?= ""

# Add extra image features
EXTRA_IMAGE_FEATURES += " \
    ${SOC_EXTRA_IMAGE_FEATURES} \
"

IMAGE_INSTALL += " \
    packagegroup-wandboard-ap-base \
    glive \
"

export IMAGE_BASENAME = "wandcam-ap-demo-image"
