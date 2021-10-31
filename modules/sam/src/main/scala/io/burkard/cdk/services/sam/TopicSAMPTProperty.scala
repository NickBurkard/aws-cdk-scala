package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TopicSAMPTProperty {

  def apply(
    topicName: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.TopicSAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.TopicSAMPTProperty.Builder)
      .topicName(topicName.orNull)
      .build()
}
