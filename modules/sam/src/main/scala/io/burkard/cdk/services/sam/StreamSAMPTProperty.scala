package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StreamSAMPTProperty {

  def apply(
    streamName: String
  ): software.amazon.awscdk.services.sam.CfnFunction.StreamSAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.StreamSAMPTProperty.Builder)
      .streamName(streamName)
      .build()
}
