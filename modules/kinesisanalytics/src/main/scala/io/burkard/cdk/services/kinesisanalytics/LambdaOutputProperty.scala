package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaOutputProperty {

  def apply(
    resourceArn: String,
    roleArn: String
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.LambdaOutputProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.LambdaOutputProperty.Builder)
      .resourceArn(resourceArn)
      .roleArn(roleArn)
      .build()
}
