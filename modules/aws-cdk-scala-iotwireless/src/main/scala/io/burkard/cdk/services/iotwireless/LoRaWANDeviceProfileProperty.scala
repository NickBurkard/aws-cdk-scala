package io.burkard.cdk.services.iotwireless

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoRaWANDeviceProfileProperty {

  def apply(
    supportsClassB: Option[Boolean] = None,
    classBTimeout: Option[Number] = None,
    macVersion: Option[String] = None,
    rfRegion: Option[String] = None,
    pingSlotDr: Option[Number] = None,
    pingSlotFreq: Option[Number] = None,
    maxEirp: Option[Number] = None,
    classCTimeout: Option[Number] = None,
    regParamsRevision: Option[String] = None,
    supportsJoin: Option[Boolean] = None,
    supports32BitFCnt: Option[Boolean] = None,
    pingSlotPeriod: Option[Number] = None,
    supportsClassC: Option[Boolean] = None,
    maxDutyCycle: Option[Number] = None
  ): software.amazon.awscdk.services.iotwireless.CfnDeviceProfile.LoRaWANDeviceProfileProperty =
    (new software.amazon.awscdk.services.iotwireless.CfnDeviceProfile.LoRaWANDeviceProfileProperty.Builder)
      .supportsClassB(supportsClassB.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .classBTimeout(classBTimeout.orNull)
      .macVersion(macVersion.orNull)
      .rfRegion(rfRegion.orNull)
      .pingSlotDr(pingSlotDr.orNull)
      .pingSlotFreq(pingSlotFreq.orNull)
      .maxEirp(maxEirp.orNull)
      .classCTimeout(classCTimeout.orNull)
      .regParamsRevision(regParamsRevision.orNull)
      .supportsJoin(supportsJoin.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .supports32BitFCnt(supports32BitFCnt.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .pingSlotPeriod(pingSlotPeriod.orNull)
      .supportsClassC(supportsClassC.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .maxDutyCycle(maxDutyCycle.orNull)
      .build()
}
