package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TopicSAMPTProperty {

  def apply(
    topicName: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.TopicSAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.TopicSAMPTProperty.Builder)
      .topicName(topicName.orNull)
      .build()
}
