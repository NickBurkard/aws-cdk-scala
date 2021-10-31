package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IotSiteWiseProperty {

  def apply(
    propertyAlias: Option[String] = None,
    entryId: Option[String] = None,
    assetId: Option[String] = None,
    propertyId: Option[String] = None,
    propertyValue: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyValueProperty] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotSiteWiseProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotSiteWiseProperty.Builder)
      .propertyAlias(propertyAlias.orNull)
      .entryId(entryId.orNull)
      .assetId(assetId.orNull)
      .propertyId(propertyId.orNull)
      .propertyValue(propertyValue.orNull)
      .build()
}
