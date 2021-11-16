package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeviceShadowEnrichProperty {

  def apply(
    name: String,
    thingName: String,
    roleArn: String,
    attribute: String,
    next: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty.Builder)
      .name(name)
      .thingName(thingName)
      .roleArn(roleArn)
      .attribute(attribute)
      .next(next.orNull)
      .build()
}
