package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CustomSMSSenderProperty {

  def apply(
    lambdaArn: Option[String] = None,
    lambdaVersion: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPool.CustomSMSSenderProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPool.CustomSMSSenderProperty.Builder)
      .lambdaArn(lambdaArn.orNull)
      .lambdaVersion(lambdaVersion.orNull)
      .build()
}
