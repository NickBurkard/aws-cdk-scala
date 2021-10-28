package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StreamSAMPTProperty {

  def apply(
    streamName: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.StreamSAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.StreamSAMPTProperty.Builder)
      .streamName(streamName.orNull)
      .build()
}
