package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object QueueSAMPTProperty {

  def apply(
    queueName: String
  ): software.amazon.awscdk.services.sam.CfnFunction.QueueSAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.QueueSAMPTProperty.Builder)
      .queueName(queueName)
      .build()
}
