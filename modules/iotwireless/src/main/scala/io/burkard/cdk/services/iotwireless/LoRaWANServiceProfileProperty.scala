package io.burkard.cdk.services.iotwireless

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoRaWANServiceProfileProperty {

  def apply(
    dlRate: Option[Number] = None,
    prAllowed: Option[Boolean] = None,
    channelMask: Option[String] = None,
    drMax: Option[Number] = None,
    ulRatePolicy: Option[String] = None,
    ulRate: Option[Number] = None,
    drMin: Option[Number] = None,
    nwkGeoLoc: Option[Boolean] = None,
    raAllowed: Option[Boolean] = None,
    ulBucketSize: Option[Number] = None,
    dlBucketSize: Option[Number] = None,
    targetPer: Option[Number] = None,
    addGwMetadata: Option[Boolean] = None,
    hrAllowed: Option[Boolean] = None,
    reportDevStatusBattery: Option[Boolean] = None,
    dlRatePolicy: Option[String] = None,
    devStatusReqFreq: Option[Number] = None,
    reportDevStatusMargin: Option[Boolean] = None,
    minGwDiversity: Option[Number] = None
  ): software.amazon.awscdk.services.iotwireless.CfnServiceProfile.LoRaWANServiceProfileProperty =
    (new software.amazon.awscdk.services.iotwireless.CfnServiceProfile.LoRaWANServiceProfileProperty.Builder)
      .dlRate(dlRate.orNull)
      .prAllowed(prAllowed.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .channelMask(channelMask.orNull)
      .drMax(drMax.orNull)
      .ulRatePolicy(ulRatePolicy.orNull)
      .ulRate(ulRate.orNull)
      .drMin(drMin.orNull)
      .nwkGeoLoc(nwkGeoLoc.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .raAllowed(raAllowed.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ulBucketSize(ulBucketSize.orNull)
      .dlBucketSize(dlBucketSize.orNull)
      .targetPer(targetPer.orNull)
      .addGwMetadata(addGwMetadata.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .hrAllowed(hrAllowed.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .reportDevStatusBattery(reportDevStatusBattery.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dlRatePolicy(dlRatePolicy.orNull)
      .devStatusReqFreq(devStatusReqFreq.orNull)
      .reportDevStatusMargin(reportDevStatusMargin.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .minGwDiversity(minGwDiversity.orNull)
      .build()
}
