package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object QueueSAMPTProperty {

  def apply(
    queueName: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.QueueSAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.QueueSAMPTProperty.Builder)
      .queueName(queueName.orNull)
      .build()
}
