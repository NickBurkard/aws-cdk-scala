package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaOutputProperty {

  def apply(
    resourceArn: String
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.LambdaOutputProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.LambdaOutputProperty.Builder)
      .resourceArn(resourceArn)
      .build()
}
