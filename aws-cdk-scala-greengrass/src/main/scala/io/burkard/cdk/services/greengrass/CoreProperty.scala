package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CoreProperty {

  def apply(
    certificateArn: Option[String] = None,
    id: Option[String] = None,
    thingArn: Option[String] = None,
    syncShadow: Option[Boolean] = None
  ): software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion.CoreProperty =
    (new software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion.CoreProperty.Builder)
      .certificateArn(certificateArn.orNull)
      .id(id.orNull)
      .thingArn(thingArn.orNull)
      .syncShadow(syncShadow.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
