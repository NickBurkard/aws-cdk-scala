package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InputParallelismProperty {

  def apply(
    count: Option[Number] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputParallelismProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputParallelismProperty.Builder)
      .count(count.orNull)
      .build()
}
