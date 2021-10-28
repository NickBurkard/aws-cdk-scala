package io.burkard.cdk.services.greengrassv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LambdaEventSourceProperty {

  def apply(
    topic: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaEventSourceProperty =
    (new software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaEventSourceProperty.Builder)
      .topic(topic.orNull)
      .`type`(`type`.orNull)
      .build()
}
