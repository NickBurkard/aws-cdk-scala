package io.burkard.cdk.services.lookoutmetrics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaConfigurationProperty {

  def apply(
    lambdaArn: String,
    roleArn: String
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAlert.LambdaConfigurationProperty =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAlert.LambdaConfigurationProperty.Builder)
      .lambdaArn(lambdaArn)
      .roleArn(roleArn)
      .build()
}
