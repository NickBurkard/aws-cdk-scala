package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAccountProps {

  def apply(
    cloudWatchRoleArn: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnAccountProps =
    (new software.amazon.awscdk.services.apigateway.CfnAccountProps.Builder)
      .cloudWatchRoleArn(cloudWatchRoleArn.orNull)
      .build()
}
