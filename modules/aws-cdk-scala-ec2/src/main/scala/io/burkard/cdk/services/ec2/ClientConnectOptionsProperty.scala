package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ClientConnectOptionsProperty {

  def apply(
    lambdaFunctionArn: Option[String] = None,
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientConnectOptionsProperty =
    (new software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientConnectOptionsProperty.Builder)
      .lambdaFunctionArn(lambdaFunctionArn.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
