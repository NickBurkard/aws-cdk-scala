package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CoreProperty {

  def apply(
    certificateArn: Option[String] = None,
    id: Option[String] = None,
    thingArn: Option[String] = None,
    syncShadow: Option[Boolean] = None
  ): software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreProperty =
    (new software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreProperty.Builder)
      .certificateArn(certificateArn.orNull)
      .id(id.orNull)
      .thingArn(thingArn.orNull)
      .syncShadow(syncShadow.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
