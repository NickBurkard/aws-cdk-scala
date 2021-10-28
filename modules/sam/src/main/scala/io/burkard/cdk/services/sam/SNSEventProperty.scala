package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SNSEventProperty {

  def apply(
    topic: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.SNSEventProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.SNSEventProperty.Builder)
      .topic(topic.orNull)
      .build()
}
