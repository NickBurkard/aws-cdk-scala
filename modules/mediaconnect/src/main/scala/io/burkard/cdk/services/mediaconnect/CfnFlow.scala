package io.burkard.cdk.services.mediaconnect

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFlow {

  def apply(
    internalResourceId: String,
    name: String,
    source: software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty,
    sourceFailoverConfig: Option[software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty] = None,
    availabilityZone: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.mediaconnect.CfnFlow =
    software.amazon.awscdk.services.mediaconnect.CfnFlow.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .source(source)
      .sourceFailoverConfig(sourceFailoverConfig.orNull)
      .availabilityZone(availabilityZone.orNull)
      .build()
}
