package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConnectionLogOptionsProperty {

  def apply(
    cloudwatchLogGroup: Option[String] = None,
    enabled: Option[Boolean] = None,
    cloudwatchLogStream: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ConnectionLogOptionsProperty =
    (new software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ConnectionLogOptionsProperty.Builder)
      .cloudwatchLogGroup(cloudwatchLogGroup.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cloudwatchLogStream(cloudwatchLogStream.orNull)
      .build()
}
