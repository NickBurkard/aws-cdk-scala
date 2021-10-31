package io.burkard.cdk.services.mediaconnect

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFlow {

  def apply(
    internalResourceId: String,
    sourceFailoverConfig: Option[software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty] = None,
    name: Option[String] = None,
    source: Option[software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty] = None,
    availabilityZone: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.mediaconnect.CfnFlow =
    software.amazon.awscdk.services.mediaconnect.CfnFlow.Builder
      .create(stackCtx, internalResourceId)
      .sourceFailoverConfig(sourceFailoverConfig.orNull)
      .name(name.orNull)
      .source(source.orNull)
      .availabilityZone(availabilityZone.orNull)
      .build()
}
