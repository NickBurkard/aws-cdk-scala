package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssetPropertyVariantProperty {

  def apply(
    doubleValue: Option[String] = None,
    integerValue: Option[String] = None,
    stringValue: Option[String] = None,
    booleanValue: Option[String] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyVariantProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyVariantProperty.Builder)
      .doubleValue(doubleValue.orNull)
      .integerValue(integerValue.orNull)
      .stringValue(stringValue.orNull)
      .booleanValue(booleanValue.orNull)
      .build()
}
