package io.burkard.cdk.services.mediaconnect

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFlowProps {

  def apply(
    sourceFailoverConfig: Option[software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty] = None,
    name: Option[String] = None,
    source: Option[software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty] = None,
    availabilityZone: Option[String] = None
  ): software.amazon.awscdk.services.mediaconnect.CfnFlowProps =
    (new software.amazon.awscdk.services.mediaconnect.CfnFlowProps.Builder)
      .sourceFailoverConfig(sourceFailoverConfig.orNull)
      .name(name.orNull)
      .source(source.orNull)
      .availabilityZone(availabilityZone.orNull)
      .build()
}
