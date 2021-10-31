package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PropertyGroupProperty {

  def apply(
    propertyMap: Option[AnyRef] = None,
    propertyGroupId: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.PropertyGroupProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.PropertyGroupProperty.Builder)
      .propertyMap(propertyMap.orNull)
      .propertyGroupId(propertyGroupId.orNull)
      .build()
}
