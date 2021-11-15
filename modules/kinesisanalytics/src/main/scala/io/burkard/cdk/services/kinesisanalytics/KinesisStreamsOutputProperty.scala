package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KinesisStreamsOutputProperty {

  def apply(
    resourceArn: Option[String] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisStreamsOutputProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisStreamsOutputProperty.Builder)
      .resourceArn(resourceArn.orNull)
      .roleArn(roleArn.orNull)
      .build()
}
