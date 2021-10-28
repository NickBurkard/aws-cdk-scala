package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAccountProps {

  def apply(
    cloudWatchRoleArn: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnAccountProps =
    (new software.amazon.awscdk.services.apigateway.CfnAccountProps.Builder)
      .cloudWatchRoleArn(cloudWatchRoleArn.orNull)
      .build()
}
