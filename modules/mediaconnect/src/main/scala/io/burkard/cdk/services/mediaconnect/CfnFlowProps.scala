package io.burkard.cdk.services.mediaconnect

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFlowProps {

  def apply(
    name: String,
    source: software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty,
    sourceFailoverConfig: Option[software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty] = None,
    availabilityZone: Option[String] = None
  ): software.amazon.awscdk.services.mediaconnect.CfnFlowProps =
    (new software.amazon.awscdk.services.mediaconnect.CfnFlowProps.Builder)
      .name(name)
      .source(source)
      .sourceFailoverConfig(sourceFailoverConfig.orNull)
      .availabilityZone(availabilityZone.orNull)
      .build()
}
