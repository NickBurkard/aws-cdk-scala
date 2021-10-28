package io.burkard.cdk.services.lookoutmetrics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LambdaConfigurationProperty {

  def apply(
    lambdaArn: Option[String] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAlert.LambdaConfigurationProperty =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAlert.LambdaConfigurationProperty.Builder)
      .lambdaArn(lambdaArn.orNull)
      .roleArn(roleArn.orNull)
      .build()
}
