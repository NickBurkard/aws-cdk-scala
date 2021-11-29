package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InputParallelismProperty {

  def apply(
    count: Option[Number] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputParallelismProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputParallelismProperty.Builder)
      .count(count.orNull)
      .build()
}
